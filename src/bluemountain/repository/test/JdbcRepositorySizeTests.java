package bluemountain.repository.test;

import bluemountain.config.DBConfig;
import bluemountain.repository.JdbcCheckItemRepository;
import bluemountain.repository.JdbcPatientRepository;
import bluemountain.repository.JdbcTestItemRepository;
import bluemountain.repository.JdbcTestSubClassRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by MainasuK on 2017-3-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBConfig.class })
public class JdbcRepositorySizeTests {

    @Autowired
    JdbcTemplate template;

    @Test
    public void testPatientRepositorySize() {
        int size = new JdbcPatientRepository(template).size();
        System.out.println(size);

        Assert.notNull(size, "");
    }

    @Test
    public void testCheckItemRepositorySize() {
        int size = new JdbcCheckItemRepository(template).size();
        System.out.println(size);

        Assert.notNull(size, "");
    }

    @Test
    public void testTestItemRepositorySize() {
        int size = new JdbcTestItemRepository(template).size();
        System.out.println(size);

        Assert.notNull(size, "");
    }

}
