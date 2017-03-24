package bluemountain.repository;

import bluemountain.pojo.CheckList;
import bluemountain.protocol.CheckListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-10.
 */
@Repository
public class JdbcCheckListRepository extends JdbcRepository implements CheckListRepository {

    private static String quantityOfLastWeekSQL = "SELECT count(*) FROM check_list \n" +
            "WHERE date_sub(curdate(), INTERVAL 7 DAY) <= REAL_REPORT_DATE_TIME";
    private static String quantityOfLastMonthSQL = "SELECT count(*) FROM check_list \n" +
            "WHERE date_sub(curdate(), INTERVAL 30 DAY) <= REAL_REPORT_DATE_TIME";
    private static String quantityOfLastYearSQL = "SELECT count(*) FROM check_list \n" +
            "WHERE date_sub(curdate(), INTERVAL 365 DAY) <= REAL_REPORT_DATE_TIME";

    @Autowired
    public JdbcCheckListRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<CheckList> all() {
        return jdbcOperations.query("SELECT * FROM check_list_view", (resultSet, i) -> new CheckList(resultSet));
    }

    @Override
    public int quantityOfLastWeek() {
        return jdbcOperations.queryForObject(quantityOfLastWeekSQL, Integer.class);
    }

    @Override
    public int quantityOfLastMonth() {
        return jdbcOperations.queryForObject(quantityOfLastMonthSQL, Integer.class);
    }

    @Override
    public int qunaityOfLastYear() {
        return jdbcOperations.queryForObject(quantityOfLastYearSQL, Integer.class);
    }
}
