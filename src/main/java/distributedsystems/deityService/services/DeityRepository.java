package distributedsystems.deityService.services;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import distributedsystems.deityService.model.Deity;
import java.util.UUID;

@Repository
public interface DeityRepository extends JpaRepository <Deity, UUID > {
    Deity findByName(String name);
    Deity findDeityById(UUID id);
}
