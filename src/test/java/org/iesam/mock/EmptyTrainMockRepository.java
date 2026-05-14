package org.iesam.mock;

import org.iesam.features.train.domain.Train;
import org.iesam.features.train.domain.TrainsRepository;

import java.util.ArrayList;

public class EmptyTrainMockRepository implements TrainsRepository {
    @Override
    public ArrayList<Train> getAll() {
        ArrayList<Train> trains = new ArrayList<>();
        return trains;
    }

    @Override
    public void add(Train train) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Train getId(String id) {
        return null;
    }
}
