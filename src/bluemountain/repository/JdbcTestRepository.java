package bluemountain.repository;

import bluemountain.pojo.Test;
import bluemountain.protocol.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-10.
 */
@Repository
public class JdbcTestRepository extends JdbcRepository implements TestRepository {

    @Autowired
    public JdbcTestRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<Test> all() {
        return jdbcOperations.query("SELECT * FROM test_list", (resultSet, i) -> new Test(resultSet));
    }
}
