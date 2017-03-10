package bluemountain.repository;

import bluemountain.pojo.Patient;
import bluemountain.protocol.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-10.
 */
@Repository
public class JdbcPatientRepository extends JdbcRepository implements PatientRepository {

    @Autowired
    public JdbcPatientRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<Patient> all() {
        return jdbcOperations.query("SELECT * FROM patient_info", (resultSet, i) -> new Patient(resultSet));
    }
}
