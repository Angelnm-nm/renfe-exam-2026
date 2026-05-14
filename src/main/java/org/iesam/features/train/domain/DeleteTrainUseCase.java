package org.iesam.features.train.domain;

public class DeleteTrainUseCase {
    TrainsRepository trainsRepository;

    public DeleteTrainUseCase(TrainsRepository trainsRepository) {
        this.trainsRepository = trainsRepository;
    }

    public void execute(String id) {
        trainsRepository.delete(id);

    }
}
