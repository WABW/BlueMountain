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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }
}
