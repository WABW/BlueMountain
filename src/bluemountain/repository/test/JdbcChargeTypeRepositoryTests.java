package bluemountain.repository.test;

import bluemountain.config.DBConfig;
import bluemountain.pojo.ChargeType;
import bluemountain.repository.JdbcChargeTypeRepository;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBConfig.class })
public class JdbcChargeTypeRepositoryTests {

    @Autowired
    JdbcTemplate template;

    @Test
    public void testCharges() {
        List<ChargeType> charges = new JdbcChargeTypeRepository(template).charges();
        charges.stream().forEach(charge -> System.out.println(charge.getType()));

        Assert.notNull(charges, "Charges should not null");
    }

}
