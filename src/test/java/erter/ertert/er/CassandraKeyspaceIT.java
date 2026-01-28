package erter.ertert.er;

import erter.ertert.er.config.CassandraTestContainer;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.metadata.Metadata;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@IntegrationTest
public class CassandraKeyspaceIT {

    @Autowired
    private CqlSession session;

    @Test
    void shouldListCassandraTestKeyspace() {
        Metadata metadata = session.getMetadata();
        assertThat(metadata.getKeyspace(CassandraTestContainer.DEFAULT_KEYSPACE_NAME)).isNotNull();
    }
}
