package bluemountain.protocol;

import bluemountain.pojo.CheckList;

/**
 * Created by MainasuK on 2017-3-10.
 */
public interface CheckListRepository extends ListRepositoryProtocol<CheckList> {
    int quantityOfLastWeek();
    int quantityOfLastMonth();
    int qunaityOfLastYear();
}
