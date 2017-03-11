package bluemountain.repository.test;

import bluemountain.config.DBConfig;
import bluemountain.pojo.ChargeType;
import bluemountain.pojo.CheckItem;
import bluemountain.pojo.CheckList;
import bluemountain.pojo.TestItem;
import bluemountain.repository.*;
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
public class JdbcRepositoryTests {

    @Autowired
    JdbcTemplate template;

    // MARK: test .all()
    @Test
    public void testChargeTypeRepositoryAll() {
        List<ChargeType> charges = new JdbcChargeTypeRepository(template).all();
        charges.stream().forEach(charge -> System.out.println(charge.getType()));

        Assert.notNull(charges, "Charges should not null");
    }

    @Test
    public void testCheckItemRepositoryAll() {
        List<CheckItem> checkItems = new JdbcCheckItemRepository(template).all();
        checkItems.stream().forEach(checkItem -> System.out.println(checkItem.getExamclass()));
        checkItems.stream().forEach(checkItem -> System.out.println(checkItem.getPerformedby()));

        Assert.notNull(checkItems, "checkItems should not null");
    }

    @Test
    public void testCheckPointRepositoryAll() {
        Assert.notNull(new JdbcCheckPointRepository(template).all(), "");

    }

    @Test
    public void testCheckListRepositoryAll() {
//        Assert.notNull(new JdbcCheckListRepository(template).all(), "");
        List<CheckList> checkLists = new JdbcCheckListRepository(template).all();
        checkLists.stream().forEach(checkList -> System.out.println(checkList.getExamNo()));
    }

    @Test
    public void testDoctorRepositoryAll() {
        Assert.notNull(new JdbcDoctorRepository(template).all(), "");
    }

    @Test
    public void testPatientRepositoryAll() {
        Assert.notNull(new JdbcPatientRepository(template).all(), "");
    }

    @Test
    public void testTestItemRepositoryAll() {
//        Assert.notNull(new JdbcTestItemRepository(template).all(), "");
        List<TestItem> testItems = new JdbcTestItemRepository(template).all();
        testItems.stream().forEach(testItem -> System.out.println(testItem.getItemCode()));
    }

    @Test
    public void testTestListRepositoryAll() {
        Assert.notNull(new JdbcTestListRepository(template).all(), "");
    }

}
