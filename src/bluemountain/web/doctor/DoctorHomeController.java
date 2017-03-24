package bluemountain.web.doctor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 54472 on 2017/3/24.
 */
@Controller
public class DoctorHomeController {

    @RequestMapping(value = "/doctor/home", method = RequestMethod.GET)
    public String home(){

        return "doctor/home";
    }

}
