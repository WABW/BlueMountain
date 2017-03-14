package bluemountain.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MainasuK on 2017-3-14.
 */
public class Department {

    int requestDepartmentId;
    String departmentName;

    public Department(ResultSet resultSet) throws SQLException {
        this.requestDepartmentId = resultSet.getInt("REQ_DEPT");
        this.departmentName = resultSet.getString("DEPT_NAME");
    }

}
