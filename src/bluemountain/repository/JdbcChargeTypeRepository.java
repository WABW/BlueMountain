package bluemountain.repository;

import bluemountain.pojo.ChargeType;
import bluemountain.protocol.ChargeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MainasuK on 2017-3-9.
 */
@Repository
public class JdbcChargeTypeRepository implements ChargeTypeRepository {

    JdbcTemplate template;

    @Autowired
    public JdbcChargeTypeRepository(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<ChargeType> charges() {
        return template.query("SELECT CHARGE_TYPE FROM charge_type", (resultSet, i) -> new ChargeType(resultSet));
    }

}

