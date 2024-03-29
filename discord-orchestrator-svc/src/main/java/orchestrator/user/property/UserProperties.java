package orchestrator.user.property;

import java.util.Set;
import lombok.Data;
import orchestrator.user.model.UserAuthority;
import orchestrator.user.model.UserRole;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@ConfigurationProperties(prefix = "user")
public class UserProperties {

    private UserRole defaultRole;
    private Set<UserAuthority> defaultAuthorities;
    private boolean defaultAccountState;

    public UserRole getDefaultRole() {
        return defaultRole;
    }

    public Set<UserAuthority> getDefaultAuthorities() {
        return defaultAuthorities;
    }

    public boolean getDefaultAccountState() {
        return defaultAccountState;
    }
}
