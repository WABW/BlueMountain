package bluemountain.test;

import bluemountain.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by MainasuK on 2017-3-5.
 */

public class HomeControllerTests {

    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mvc = standaloneSetup(controller).build();

        mvc.perform(get("/")).andExpect(view().name("other"));
    }

}
