package bluemountain.web.doctor;

import bluemountain.pojo.Patient;
import bluemountain.pojo.PatientExam;
import bluemountain.protocol.CheckItemRepository;
import bluemountain.protocol.DepartmentRepository;
import bluemountain.protocol.PatientExamRepository;
import bluemountain.protocol.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by 54472 on 2017/3/22.
 */

@Controller
public class CheckController {
    private CheckItemRepository checkItemRepository;

    @Autowired
    public CheckController(CheckItemRepository checkItemRepository) {
        this.checkItemRepository = checkItemRepository;
    }

    @RequestMapping(value = "doctor/check", method = RequestMethod.GET)
    public String check(Model model) {
        model.addAttribute("checks", checkItemRepository.all());


        return "doctor/check";
    }


}
