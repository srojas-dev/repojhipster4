package erter.ertert.er;

import erter.ertert.er.FeerApp;
import erter.ertert.er.config.AsyncSyncConfiguration;
import erter.ertert.er.config.EmbeddedCassandra;
import erter.ertert.er.config.TestSecurityConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = {FeerApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class})
@EmbeddedCassandra
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
