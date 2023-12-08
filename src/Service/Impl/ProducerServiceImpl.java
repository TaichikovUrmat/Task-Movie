package Service.Impl;


import Service.ProducerService;
import db.DataBase;
import model.Producer;

import java.util.LinkedList;

public class ProducerServiceImpl  implements ProducerService {
      DataBase dataBase = new DataBase();

    @Override
    public LinkedList<Producer> getAll() {
        return dataBase.producerLinkedList;
    }

    @Override
    public void addProducer(LinkedList<Producer> producers) {
      dataBase.producerLinkedList.addAll(producers);
    }
}
