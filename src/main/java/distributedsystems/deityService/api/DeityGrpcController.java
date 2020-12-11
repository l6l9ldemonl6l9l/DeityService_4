package distributedsystems.deityService.api;

import distributedsystems.deityService.*;
import distributedsystems.deityService.model.Deity;
import distributedsystems.deityService.services.DeityService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@GRpcService
public class DeityGrpcController extends DeityServiceGrpc.DeityServiceImplBase {

    @Autowired
    private DeityService DeityService;

    @Override
    public void all(AllDeityRequest request, StreamObserver<AllDeityResponse> responseObserver) {
        List<Deity> deitis = DeityService.getAll();
        List<DeityResponse> convertedDeitis = deitis.stream().
                map(Deity::toDeityResponse).
                collect(Collectors.toList());
        AllDeityResponse response = AllDeityResponse.newBuilder().
                addAllDeity(convertedDeitis).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void add(DeityRequest request, StreamObserver<DeityResponse> responseObserver) {
        Deity deity = DeityService.addDeity(Deity.fromDeityRequest(request));
        responseObserver.onNext(deity.toDeityResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void byId(DeityByIdRequest request, StreamObserver<DeityResponse> responseObserver) {
        Deity Deity = DeityService.getById(UUID.fromString(request.getId()));
        responseObserver.onNext(Deity.toDeityResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void byName(DeityByNameRequest request, StreamObserver<DeityResponse> responseObserver) {
        Deity Deity = DeityService.getByName(request.getName());
        responseObserver.onNext(Deity.toDeityResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeityByIdRequest request, StreamObserver<DeleteDeityResponse> responseObserver) {
        DeityService.deleteDeityById(UUID.fromString(request.getId()));
        responseObserver.onNext(DeleteDeityResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}
