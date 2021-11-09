package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.entity.Message;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.UUID;

/**
 * Simple {@code Boundary} that returns welcome messages.
 */
@Stateless
public class HelloWorld {

    @Inject
    Config config;

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
