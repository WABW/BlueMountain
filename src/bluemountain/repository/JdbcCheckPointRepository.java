package bluemountain.repository;

import bluemountain.pojo.CheckPoint;
import bluemountain.protocol.CheckPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-10.
 */
@Repository
public class JdbcCheckPointRepository extends JdbcRepository implements CheckPointRepository {

    @Autowired
    public JdbcCheckPointRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<CheckPoint> all() {
        return jdbcOperations.query("SELECT * FROM check_list", (resultSet, i) -> new CheckPoint(resultSet));
    }
}
