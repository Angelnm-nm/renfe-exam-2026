package org.iesam.features.train.domain;

import org.iesam.mock.TrainMockrepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTrainUseCaseTest {
    TrainMockrepository trainMockrepository;
    AddTrainUseCase addTrainUseCase;

    @BeforeEach
    void setUp() {
    }

    @Test
    void execute() {
        trainMockrepository = new TrainMockrepository();
        addTrainUseCase = new AddTrainUseCase(trainMockrepository);
        Train train = new Train("1", "pedro", "11", "plastic");
        addTrainUseCase.execute(train);
        assertEquals(1, trainMockrepository.addTrain);
    }
}