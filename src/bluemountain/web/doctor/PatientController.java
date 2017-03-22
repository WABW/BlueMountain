package bluemountain.web.doctor;

import bluemountain.protocol.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 54472 on 2017/3/22.
 */

@Controller
public class PatientController {

    private PatientRepository patientRepository;

    @Autowired
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @RequestMapping(value = "doctor/patient", method = RequestMethod.GET)
    public String patientinfo(Model model) {
        model.addAttribute("patients", patientRepository.all());

        return "doctor/patient";
    }

}
