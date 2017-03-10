package bluemountain.web.search;

import bluemountain.protocol.ChargeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MainasuK on 2017-3-9.
 */
@Controller
@RequestMapping("/search")
public class ChargesController {

    ChargeTypeRepository chargeTypeRepository;

    @Autowired
    public ChargesController(ChargeTypeRepository chargeTypeRepository) {
        this.chargeTypeRepository = chargeTypeRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String search(Model model) {
        model.addAttribute("chargeTypes", chargeTypeRepository.all());

        return "search/charges";
    }

}
