package bluemountain.web.search;

import bluemountain.pojo.PatientExam;
import bluemountain.protocol.*;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by MainasuK on 2017-3-9.
 */
@Controller
@RequestMapping("/search")
public class SearchController {
    private CheckItemRepository checkItemRepository;
    private CheckListRepository checkListRepository;
    private TestItemRepository testItemRepository;
    private DepartmentRepository departmentRepository;
    private PatientExamRepository patientExamRepository;

    ChargeTypeRepository chargeTypeRepository;



    @Autowired
    public SearchController(ChargeTypeRepository chargeTypeRepository,
                            CheckItemRepository checkItemsRepository,
                            CheckListRepository checkListRepository,
                            TestItemRepository testItemRepository,
                            DepartmentRepository departmentRepository,
                            PatientExamRepository patientExamRepository) {
        this.chargeTypeRepository = chargeTypeRepository;
        this.checkItemRepository = checkItemsRepository;
        this.checkListRepository = checkListRepository;
        this.testItemRepository = testItemRepository;
        this.departmentRepository = departmentRepository;
        this.patientExamRepository = patientExamRepository;
    }

    @RequestMapping(value = "/charges", method = RequestMethod.GET)
    public String charges(Model model) {
        model.addAttribute("chargeTypes", chargeTypeRepository.all());

        return "search/charges" ;
    }

    @RequestMapping(value = "/checkitems", method = RequestMethod.GET)
    public String checkitems(Model model) {
        model.addAttribute("checkItem", checkItemRepository.all());

        return "search/checkitems";
    }

    @RequestMapping(value = "/checkitems", method = RequestMethod.POST)
    public String checkitems(String keyword) {
        return "redirect:/search/checkitems/" + keyword.trim(); // Be careful with the '/'
    }

    @RequestMapping(value = "/checkitems/{keyword}", method = RequestMethod.GET)
    public String showCheckitemsFor(@PathVariable String keyword, Model model) {
        model.addAttribute("checkItem",
                checkItemRepository.all()
                        .parallelStream()
                        .filter(item ->
                                item.getExamclass().contains(keyword) || ("" + item.getPerformedby()).contains(keyword)
                        ).collect(Collectors.toList())
        );

        return "search/checkitems" ;
    }

    @RequestMapping(value = "/checklist", method = RequestMethod.GET)
    public String checklist(Model model) {
        model.addAttribute("checkList", checkListRepository.all());

        return "search/checklist" ;
    }

    @RequestMapping(value = "/testitems", method = RequestMethod.GET)
    public String testitems(Model model) {
        model.addAttribute("testItem", testItemRepository.all());

        return "search/testitems" ;
    }

    @RequestMapping(value = "/searchpatientinfo", method = RequestMethod.GET)
    public String searchpatientinfo(Model model) {
        model.addAttribute("departments", departmentRepository.all());

        return "search/searchpatientinfo" ;
    }

    @RequestMapping(value = "/searchcheckinfo", method = RequestMethod.GET)
    public String searchcheckinfo(Model model) {
        model.addAttribute("checkItem", checkItemRepository.all());

        return "search/searchcheckinfo" ;
    }

    @RequestMapping(value = "/searchcheckinfo", method = RequestMethod.POST)
    public String searchcheckinfo(Model model, HttpServletRequest request) {
        model.addAttribute("checkItem", checkItemRepository.all());

        String department = request.getParameter("department");
        List<PatientExam> patientExams = patientExamRepository.all().stream().filter(exam -> exam.getCheckList().getCheckItem().getExamclass().contentEquals(department)).collect(Collectors.toList());

        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String value = request.getParameter(key);

            System.out.println(key + "::" + value);
        }

        return "search/searchcheckinfo" ;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String search() {

        return "redirect: /search/checkitems" ;
    }



}
