package bluemountain.repository;

import bluemountain.pojo.HistoryChecklist;
import bluemountain.pojo.HistoryKeyword;
import bluemountain.pojo.SearchChecklistHistory;
import bluemountain.protocol.HistoryChecklistRepository;
import bluemountain.protocol.HistoryKeywordRepository;
import bluemountain.protocol.SearchChecklistHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by MainasuK on 2017-4-6.
 */
@Repository
public class JdbcSearchChecklistHistoryRepository extends JdbcRepository implements SearchChecklistHistoryRepository{

    private HistoryChecklistRepository historyChecklistRepository;
    private HistoryKeywordRepository historyKeywordRepository;


    @Autowired
    public JdbcSearchChecklistHistoryRepository(JdbcOperations jdbcOperations, HistoryChecklistRepository historyChecklistRepository, HistoryKeywordRepository historyKeywordRepository) {
        super(jdbcOperations);

        this.historyChecklistRepository = historyChecklistRepository;
        this.historyKeywordRepository = historyKeywordRepository;
    }

    @Override
    @Transactional
    public List<SearchChecklistHistory> all() {
        List<SearchChecklistHistory> list = new LinkedList<>();

        List<HistoryChecklist> historyChecklists = historyChecklistRepository.all();
        List<HistoryKeyword> historyKeywords = historyKeywordRepository.all();

        for (HistoryChecklist historyChecklist : historyChecklists) {
            List<HistoryKeyword> keywords =  historyKeywords.stream().filter(keyword -> keyword.getNumber() == historyChecklist.getNumber()).collect(Collectors.toList());
            list.add(new SearchChecklistHistory(historyChecklist, keywords));
        }

        return list;
    }
}
