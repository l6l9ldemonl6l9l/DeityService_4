package distributedsystems.deityService.api;
import distributedsystems.deityService.model.Deity;
import distributedsystems.deityService.services.DeityService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Deity")
@AllArgsConstructor
@NoArgsConstructor
public class DeityRestController {

    @Autowired
    private DeityService DeityService;

    @PostMapping
    public Deity createDeity(@RequestBody Deity Deity) {
        return DeityService.addDeity(Deity);
    }

    @GetMapping
    public List<Deity> getAllDeitys() {
        return DeityService.getAll();
    }

    @GetMapping(path = "{id}")
    public Deity getDeityById(@PathVariable(value = "id") UUID id) {
        Deity Deity = DeityService.getById(id);
        return Deity;
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteDeity(@PathVariable(value = "id") UUID id)  {
        DeityService.deleteDeityById(id);
        return ResponseEntity.noContent().build();
    }

}
