package org.iesam.mock;

import org.iesam.features.train.domain.Train;
import org.iesam.features.train.domain.TrainsRepository;

import java.util.ArrayList;

public class TrainMockrepository implements TrainsRepository {
    public Integer addTrain = 0;

    @Override
    public ArrayList<Train> getAll() {
        ArrayList<Train> trains = new ArrayList<>();
        Train train = new Train("1", "pedro", "11", "plastic");
        Train train1 = new Train("2", "javier", "12", "plastic");
        Train train2 = new Train("3", "pablo", "13", "plastic");
        trains.add(train);
        trains.add(train1);
        trains.add(train2);
        return trains;
    }

    @Override
    public void add(Train train) {
        addTrain++;

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Train getId(String id) {
        return null;
    }
}
