package bluemountain.protocol;

import bluemountain.pojo.TestList;

/**
 * Created by MainasuK on 2017-3-10.
 */
public interface TestListRepository extends ListRepositoryProtocol<TestList> {
    int quantityOfLastWeek();
    int quantityOfLastMonth();
    int quantityOfLastYear();
}
