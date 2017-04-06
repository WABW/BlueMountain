package bluemountain.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MainasuK on 2017-4-6.
 */
public class HistoryPatient {

    private int historyHistoryPatientId;
    private String sex;
    private int requestDepartment;
    private int minAge;
    private int maxAge;

    public HistoryPatient(ResultSet resultSet) throws SQLException {
        this.historyHistoryPatientId = resultSet.getInt("HISTORY_PATIENT_ID");
        this.sex = resultSet.getString("SEX");
        this.requestDepartment = resultSet.getInt("REQ_DEPT");
        this.minAge = resultSet.getInt("MIN_AGE");
        this.maxAge = resultSet.getInt("MAX_AGE");
    }

}
