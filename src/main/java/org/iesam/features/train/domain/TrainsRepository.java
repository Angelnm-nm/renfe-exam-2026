package org.iesam.features.train.domain;

import java.util.ArrayList;

public interface TrainsRepository {
    ArrayList<Train> getAll();

    void add(Train train);

    void delete(String id);

    Train getId(String id);

}
