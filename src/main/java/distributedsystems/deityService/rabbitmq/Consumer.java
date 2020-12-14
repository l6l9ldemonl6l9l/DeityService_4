package distributedsystems.deityService.rabbitmq;


import distributedsystems.deityService.model.Deity;
import distributedsystems.deityService.services.DeityService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    DeityService DeityService;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void consume(Deity Deity) {
        DeityService.addDeity(Deity);
    }
}
