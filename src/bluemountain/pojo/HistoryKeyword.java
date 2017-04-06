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

    public int getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(int keywordId) {
        this.keywordId = keywordId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
