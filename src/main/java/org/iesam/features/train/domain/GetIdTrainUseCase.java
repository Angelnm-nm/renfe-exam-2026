package org.iesam.features.train.domain;

public class GetIdTrainUseCase {
    TrainsRepository trainsRepository;

    public GetIdTrainUseCase(TrainsRepository trainsRepository) {
        this.trainsRepository = trainsRepository;
    }

    public void excute(String id) {
        trainsRepository.delete(id);
    }
}
