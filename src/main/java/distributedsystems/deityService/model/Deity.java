package distributedsystems.deityService.model;

import distributedsystems.deityService.DeityRequest;
import distributedsystems.deityService.DeityResponse;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@EnableAutoConfiguration
@Entity
@Data
public final class Deity {

    @Id
    private UUID id;
    @Column(unique = true)
    private int age;
    private String name;


    public Deity() {
        id = UUID.randomUUID();
    }

    public Deity(UUID id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public static Deity fromDeityRequest(DeityRequest DeityRequest) {
        return new Deity(UUID.randomUUID(),
                DeityRequest.getAge(),
                DeityRequest.getName());
    }

    public DeityResponse toDeityResponse() {
        return DeityResponse.newBuilder().
                setId(id.toString()).
                setAge(age).
                setName(name).
                build();
    }
}
