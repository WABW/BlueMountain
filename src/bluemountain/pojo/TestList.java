package bluemountain.pojo;

import java.sql.Date;
import java.sql.ResultSet;

/**
 * Created by MainasuK on 2017-3-10.
 */
public class TestList {
    private String testNo;
    private int patientID;
    private int visitID;
    private Date executeDate;
    private String relevantClincDiag;
    private String specimen;
    private Date pecmSampleDateTime;
    private Date requestdDateTime;
    private int orderingDept;


    public TestList() {
    }

    public TestList(ResultSet resultSet) {

    }
}
