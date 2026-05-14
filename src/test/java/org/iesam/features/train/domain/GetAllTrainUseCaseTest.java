package org.iesam.features.train.domain;

import org.iesam.mock.EmptyTrainMockRepository;
import org.iesam.mock.NullTrainMockRepository;
import org.iesam.mock.TrainMockrepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetAllTrainUseCaseTest {
    GetAllTrainUseCase getAllTrainUseCase;
    TrainMockrepository trainMockrepository;
    EmptyTrainMockRepository emptyTrainMockRepository;
    NullTrainMockRepository nullTrainMockRepository;


    @BeforeEach
    void setUp() {
    }

    @Test
    void execute() {
        trainMockrepository = new TrainMockrepository();
        getAllTrainUseCase = new GetAllTrainUseCase(trainMockrepository);
        ArrayList<Train> trains = getAllTrainUseCase.execute();
        assertEquals(3, trains.size());
        assertEquals("1", trains.get(0).getId());
    }

    @Test
    void empty() {
        emptyTrainMockRepository = new EmptyTrainMockRepository();
        getAllTrainUseCase = new GetAllTrainUseCase(emptyTrainMockRepository);
        ArrayList<Train> trains = getAllTrainUseCase.execute();
        assertEquals(0, trains.size());
    }

    @Test
    void nullTrain() {
        nullTrainMockRepository = new NullTrainMockRepository();
        getAllTrainUseCase = new GetAllTrainUseCase(nullTrainMockRepository);
        ArrayList<Train> trains = getAllTrainUseCase.execute();
        assertNull(trains);
    }
}