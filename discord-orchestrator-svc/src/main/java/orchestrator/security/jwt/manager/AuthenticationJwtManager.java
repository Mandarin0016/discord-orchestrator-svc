package orchestrator.security.jwt.manager;

import orchestrator.security.jwt.provider.AuthenticationJwtProvider;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationJwtManager implements AuthenticationManager {

    private final AuthenticationJwtProvider authenticationJwtProvider;

    public AuthenticationJwtManager(AuthenticationJwtProvider authenticationJwtProvider) {
        this.authenticationJwtProvider = authenticationJwtProvider;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        if (authenticationJwtProvider.supports(authentication.getClass())){
            authenticationJwtProvider.authenticate(authentication);
        }

        return authentication;
    }
}
