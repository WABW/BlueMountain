package bluemountain.repository;

import bluemountain.pojo.Check;
import bluemountain.protocol.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-10.
 */
@Repository
public class JdbcCheckRepository extends JdbcRepository implements CheckRepository {

    @Autowired
    public JdbcCheckRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<Check> all() {
        return jdbcOperations.query("SELECT EXAM_SUB_CLASS FROM checkpoint", (resultSet, i) -> new Check(resultSet));
    }
}
