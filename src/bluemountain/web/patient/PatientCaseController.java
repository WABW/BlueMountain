package bluemountain.web.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 54472 on 2017/4/2.
 */

@Controller
public class PatientCaseController {

    @RequestMapping(value = "/patient/case",method = RequestMethod.GET)
    public String Case(){
        return "patient/case";
    }
}
