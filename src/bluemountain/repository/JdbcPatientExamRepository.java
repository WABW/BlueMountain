package bluemountain.repository;

import bluemountain.pojo.PatientExam;
import bluemountain.protocol.PatientExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-13.
 */

@Repository
public class JdbcPatientExamRepository extends JdbcRepository implements PatientExamRepository {

    @Autowired
    public JdbcPatientExamRepository(JdbcOperations jdbcOperations) {
        super(jdbcOperations);
    }

    @Override
    public List<PatientExam> all() {
        return jdbcOperations.query("SELECT * FROM patient_exam_view", (resultSet, i) -> new PatientExam(resultSet));
    }

}
