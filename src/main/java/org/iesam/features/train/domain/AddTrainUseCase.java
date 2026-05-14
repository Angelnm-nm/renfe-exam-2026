package org.iesam.features.train.domain;

public class AddTrainUseCase {
    TrainsRepository trainsRepository;

    public AddTrainUseCase(TrainsRepository trainsRepository) {
        this.trainsRepository = trainsRepository;
    }

    public void execute(Train train) {
        trainsRepository.add(train);
    }
}
