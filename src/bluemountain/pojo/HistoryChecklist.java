package bluemountain.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * Created by MainasuK on 2017-4-6.
 */
public class HistoryChecklist {

    private int number;
    private int performedBy;
    private Timestamp timestamp;

    public HistoryChecklist(ResultSet resultSet) throws SQLException {
        this.number = resultSet.getInt("NUMBER");
        this.performedBy = resultSet.getInt("PERFORMED_BY");
        this.timestamp = resultSet.getTimestamp("TIMESTAMP_HISTORY");
    }

}
