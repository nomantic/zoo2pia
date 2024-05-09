package game.manager.direction;

import game.manager.Player;
import game.manager.Room;

public class GameManager {
    private Room room;
    private Player player;

    public GameManager(Room room, Player player) {
        this.room = room;
        this.player = player;
    }

    //getters and setters
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
