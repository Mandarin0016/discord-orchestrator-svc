package orchestrator.security.dto;

import lombok.Builder;

@Builder
public record UserAuthentication(
        String authorization,
        Object data
) {

}
