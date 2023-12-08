package Service;

import model.Actor;
import model.Producer;

import java.util.LinkedList;

public interface ProducerService {
    LinkedList<Producer> getAll();

    public void  addProducer(LinkedList<Producer> producers );
}
