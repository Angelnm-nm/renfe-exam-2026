package org.iesam.features.train.domain;

import java.util.ArrayList;

public class GetAllTrainUseCase {
    TrainsRepository trainsRepository;

    public GetAllTrainUseCase(TrainsRepository trainsRepository) {
        this.trainsRepository = trainsRepository;
    }
    public ArrayList<Train> execute(){
        return trainsRepository.getAll();
    }
}
