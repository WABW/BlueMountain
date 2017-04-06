package bluemountain.repository;

import bluemountain.pojo.HistoryPatient;
import bluemountain.protocol.HistoryPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MainasuK on 2017-4-6.
 */
@Repository
public class JdbcHistoryPatientRepository extends JdbcRepository implements HistoryPatientRepository{

    @Autowired
    public JdbcHistoryPatientRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<HistoryPatient> all() {
        return jdbcOperations.query("SELECT * FROM history_patient ", (resultSet, i) -> new HistoryPatient(resultSet));
    }

}
