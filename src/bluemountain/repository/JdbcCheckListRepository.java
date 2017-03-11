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

    @Autowired
    public JdbcCheckListRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<CheckList> all() {
        return jdbcOperations.query("SELECT* FROM check_list", (resultSet, i) -> new CheckList(resultSet));
    }
}
