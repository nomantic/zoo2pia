package game.manager.direction;

import game.manager.Room;

public class GameManager {
    private Room room;

    public GameManager() {
    }

    public void setCurrentRoom(Room room) {
        this.room = room;
    }

    public Room getCurrentRoom() {
        return room;
    }

}
