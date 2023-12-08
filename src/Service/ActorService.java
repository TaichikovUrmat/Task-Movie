package Service;

import model.Actor;

import java.util.LinkedList;

public interface ActorService {
    LinkedList<Actor> getAll();

    public void  addActor(LinkedList<Actor> actors);
}
