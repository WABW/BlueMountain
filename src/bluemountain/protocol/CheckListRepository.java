package bluemountain.protocol;

import bluemountain.pojo.Checklist;

/**
 * Created by MainasuK on 2017-3-10.
 */
public interface CheckListRepository extends ListRepositoryProtocol<Checklist> {
    int quantityOfLastWeek();
    int quantityOfLastMonth();
    int qunaityOfLastYear();
}
