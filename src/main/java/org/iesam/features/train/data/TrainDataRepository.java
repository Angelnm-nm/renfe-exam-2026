package org.iesam.features.train.data;

import org.iesam.features.train.domain.Train;
import org.iesam.features.train.domain.TrainsRepository;

import java.util.ArrayList;

public class TrainDataRepository implements TrainsRepository {
    TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public ArrayList<Train> getAll() {
        return trainMemLocalDataSource.findAll();
    }

    @Override
    public void add(Train train) {
        trainMemLocalDataSource.save(train);
    }

    @Override
    public void delete(String id) {
        trainMemLocalDataSource.delete(id);
    }

    @Override
    public Train getId(String id) {
        return trainMemLocalDataSource.findAll().get(0);
    }
}
