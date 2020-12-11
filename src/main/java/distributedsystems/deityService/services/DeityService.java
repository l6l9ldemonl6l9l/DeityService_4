package distributedsystems.deityService.services;

import distributedsystems.deityService.model.Deity;

import java.util.List;
import java.util.UUID;

public interface DeityService {
    Deity addDeity(Deity Deity);

    List<Deity> getAll();

    Deity getById(UUID id);

    Deity getByName(String kindDeity);

    void deleteDeityById(UUID id);
}
