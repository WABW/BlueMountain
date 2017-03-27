package bluemountain.web.doctor.search;

import bluemountain.pojo.PatientExam;
import bluemountain.protocol.CheckItemRepository;
import bluemountain.protocol.PatientExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by MainasuK on 2017-3-27.
 */
@Controller
public class ChecklistController {

    private CheckItemRepository checkItemRepository;
    private PatientExamRepository patientExamRepository;


    @Autowired
    public ChecklistController(CheckItemRepository checkItemRepository, PatientExamRepository patientExamRepository) {
        this.checkItemRepository = checkItemRepository;
        this.patientExamRepository = patientExamRepository;
    }

    @RequestMapping(value = "/doctor/search/checklist", method = RequestMethod.GET)
    public String checklist(Model model) {
        model.addAttribute("checkItem", checkItemRepository.all());
        model.addAttribute("patientExams", patientExamRepository.all());

        return "doctor/search/checklist";
    }

    @RequestMapping(value = "/doctor/search/checklist", method = RequestMethod.POST)
    public String checklist(Model model, HttpServletRequest request) {
        model.addAttribute("checkItem", checkItemRepository.all());

        String and = "并含";
        String or  = "并或";
        String not = "不含";

        List<PatientExam> patientExams = patientExamRepository.all().stream().collect(Collectors.toList());

        String department = request.getParameter("department");
        if (!department.contains("不限")) {
            patientExams = patientExams.stream().filter(exam -> exam.getChecklist().getCheckItem().getExamclass().contentEquals(department)).collect(Collectors.toList());
        }

        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String value = request.getParameter(key);

            if (key.startsWith("item") && names.hasMoreElements()) {
                String inputValue = request.getParameter(names.nextElement());

                if (value.equals(and)) {
                    patientExams = patientExams.stream().filter(exam -> exam.getChecklist().getPhysicSign().contains(inputValue)).collect(Collectors.toList());
                } else if (value.equals(or)) {
                    patientExams = patientExams.stream().filter(exam -> !exam.getChecklist().getPhysicSign().contains(inputValue)).collect(Collectors.toList());
                } else {
                    List<PatientExam> result = patientExams.stream().filter(exam -> exam.getChecklist().getPhysicSign().contains(inputValue)).collect(Collectors.toList());
                    result.removeAll(patientExams);
                    patientExams.addAll(result);
                }
            }

            System.out.println(key + "::" + value);
        }

        model.addAttribute("patientExams", patientExams);

        return "doctor/search/checklist";
    }

}
