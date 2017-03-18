package bluemountain.pojo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MainasuK on 2017-3-10.
 */
public class Patient {

    Integer patientId;
    String sex;
    Date dateOfBirth;

    public Patient() {
    }

    public Patient(ResultSet resultSet) throws SQLException {
        this.patientId = resultSet.getInt("PATIENT_ID");
        this.sex = resultSet.getString("SEX");
        this.dateOfBirth = resultSet.getDate("DATE_OF_BIRTH");
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
