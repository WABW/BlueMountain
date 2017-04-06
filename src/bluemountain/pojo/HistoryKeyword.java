package bluemountain.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MainasuK on 2017-4-6.
 */
public class HistoryKeyword {

    private int keywordId;
    private int number;
    private String keyword;
    private int condition;

    public HistoryKeyword(ResultSet resultSet) throws SQLException {
        this.keywordId = resultSet.getInt("KEYWORD_ID");
        this.number = resultSet.getInt("NUMBER");
        this.keyword = resultSet.getString("KEYWORD");
        this.condition = resultSet.getInt("CONDITION");
    }

}
