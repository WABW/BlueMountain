package bluemountain.web.doctor;

import bluemountain.protocol.CheckItemRepository;
import bluemountain.protocol.PatientRepository;
import bluemountain.protocol.TestItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 54472 on 2017/3/24.
 */
@Controller
public class DoctorHomeController {

    PatientRepository patientRepository;
    CheckItemRepository checkItemRepository;
    TestItemRepository testItemRepository;

    @Autowired
    public DoctorHomeController(PatientRepository patientRepository, CheckItemRepository checkItemRepository, TestItemRepository testItemRepository) {
        this.patientRepository = patientRepository;
        this.checkItemRepository = checkItemRepository;
        this.testItemRepository = testItemRepository;
    }

    @RequestMapping(value = "/doctor/home", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("patientQuantity", patientRepository.size());
        model.addAttribute("checkItemQuantity", checkItemRepository.size());
        model.addAttribute("testItemQuantity", testItemRepository.size());

        return "doctor/home";
    }

}
