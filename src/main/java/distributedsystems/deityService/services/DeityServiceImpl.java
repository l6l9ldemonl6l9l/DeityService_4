package distributedsystems.deityService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import distributedsystems.deityService.model.Deity;
import java.util.UUID;
import java.util.List;


@Service
public final class DeityServiceImpl implements DeityService {

    @Autowired
    private DeityRepository DeityRepository;

    @Override
    public Deity addDeity(Deity Deity) {
        Deity savedDeity = DeityRepository.save(Deity);
        return savedDeity;
    }

    @Override
    public List<Deity> getAll() {
        return DeityRepository.findAll();
    }

    @Override
    public Deity getById(UUID id) {
        Deity Deity = DeityRepository.findById(id).get();
        return Deity;
    }

    @Override
    public Deity getByName(String name) {
        return DeityRepository.findByName(name);
    }

    @Override
    public void deleteDeityById(UUID id) {
        DeityRepository.deleteById(id);
    }
}