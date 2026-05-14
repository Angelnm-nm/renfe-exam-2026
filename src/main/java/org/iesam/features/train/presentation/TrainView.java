package org.iesam.features.train.presentation;

import org.iesam.features.train.data.TrainDataRepository;
import org.iesam.features.train.data.TrainMemLocalDataSource;
import org.iesam.features.train.domain.AddTrainUseCase;
import org.iesam.features.train.domain.DeleteTrainUseCase;
import org.iesam.features.train.domain.GetAllTrainUseCase;
import org.iesam.features.train.domain.Train;

public class TrainView {
    public static void getTrains() {
        GetAllTrainUseCase getAllTrainUseCase = new GetAllTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        System.out.println(getAllTrainUseCase.execute());
    }

    public static void addTrains() {
        Train train = new Train("1", "pedro", "11", "plastic");
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        addTrainUseCase.execute(train);
    }

    public static void deleteTrains() {
        DeleteTrainUseCase deleteTrainUseCase = new DeleteTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        deleteTrainUseCase.execute("1");
    }

    public static void function1() {
        getTrains();
        addTrains();
        getTrains();
    }

    public static void function2() {
        getTrains();
    }

    public static void function3() {
        getTrains();
        deleteTrains();
        getTrains();
    }


}
