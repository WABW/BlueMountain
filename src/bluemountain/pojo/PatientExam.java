package bluemountain.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MainasuK on 2017-3-13.
 */
public class PatientExam {
    Patient patient;
    CheckList checkList;

    public PatientExam() {
    }

    public PatientExam(Patient patient, CheckList checkList) {
        this.patient = patient;
        this.checkList = checkList;
    }

    public PatientExam(ResultSet resultSet) throws SQLException {
        this(new Patient(resultSet), new CheckList(resultSet));
    }

}
