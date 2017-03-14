package bluemountain.repository;

import bluemountain.pojo.Department;
import bluemountain.protocol.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-14.
 */
public class JdbcDepartmentRepository extends JdbcRepository implements DepartmentRepository {

    @Autowired
    public JdbcDepartmentRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<Department> all() {
        return jdbcOperations.query("SELECT REQ_DEPT, DEPT_NAME FROM department", (resultSet, i) -> new Department(resultSet));
    }

}
