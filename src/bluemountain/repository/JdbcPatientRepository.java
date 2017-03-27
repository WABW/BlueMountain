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
    private static String patientSQL = "SELECT pi.*,\n" +
            "(SELECT COUNT(*) FROM check_list cl WHERE pi.PATIENT_ID = cl.PATIENT_ID) AS CHECK_COUNT,\n" +
            "(SELECT COUNT(*) FROM test_list tl WHERE pi.PATIENT_ID = tl.PATIENT_ID) AS TEST_COUNT\n" +
            "FROM patient_info pi";
    private static String patientSizeSQL = "SELECT COUNT(*) SIZE FROM patient_info";
    private static String patientSizeOfMaleSQL = "SELECT COUNT(*) FROM patient_info pi where pi.SEX = '男'";
    private static String patientSizeOfFemaleSQL = "SELECT COUNT(*) FROM patient_info pi where pi.SEX = '女'";

    @Autowired
    public JdbcPatientRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<Patient> all() {
        return jdbcOperations.query(patientSQL, (resultSet, i) -> new Patient(resultSet));
    }


    @Override
    public int size() {
        return jdbcOperations.queryForObject(patientSizeSQL, Integer.class);
    }

    @Override
    public int quantityOfMale() {
        return jdbcOperations.queryForObject(patientSizeOfMaleSQL, Integer.class);
    }

    @Override
    public int quantityOfFemale() {
        return jdbcOperations.queryForObject(patientSizeOfFemaleSQL, Integer.class);
    }
}
