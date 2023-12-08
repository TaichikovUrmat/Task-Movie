package Service.Impl;

import Service.ActorService;
import db.DataBase;
import model.Actor;

import java.util.LinkedList;

public class ActorServiceImpl implements ActorService {

  DataBase dataBase = new DataBase();
    @Override
    public LinkedList<Actor> getAll() {
        return dataBase.actorLinkedList;
    }

    @Override
    public void addActor(LinkedList<Actor> actors) {
         dataBase.actorLinkedList.addAll(actors);
    }

}
