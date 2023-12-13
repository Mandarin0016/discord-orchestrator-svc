package orchestrator.feature.server.repository;

import orchestrator.feature.server.model.DiscordServer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DiscordServerRepository extends JpaRepository<DiscordServer, UUID> {
}
