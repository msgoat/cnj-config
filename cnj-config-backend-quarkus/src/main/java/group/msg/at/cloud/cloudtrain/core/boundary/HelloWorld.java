package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.entity.Message;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.UUID;

/**
 * Simple {@code Boundary} that returns welcome messages.
 */
@Dependent
@Transactional
public class HelloWorld {

    @Inject
    @ConfigProperty(name = "cloudtrain.config.stringValue", defaultValue = "???cloudtrain.config.stringValue???")
    private String configStringValue;

    @Inject
    @ConfigProperty(name = "cloudtrain.config.numericValue", defaultValue = "-1")
    private int configNumericValue;

    public Message getHelloMessage() {
        return new Message(UUID.randomUUID(), "hello", String.format("Welcome to Cloud Native Java with %s! configNumericValue : %d", this.configStringValue, this.configNumericValue));
    }
}
