package bluemountain.web.Editor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 54472 on 2017/4/9.
 */
@Controller
public class EditorController {
    @RequestMapping(value = {"/editor/editor"}, method = RequestMethod.GET)
    public String editor(){

        return "editor/editor1";
    }

}
