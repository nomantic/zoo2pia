package game.manager.direction;

import game.manager.Bag;
import game.manager.Room;
import java.util.ArrayList;
import java.util.List;

public class Direction {
    private List<Room> roomList;
    private static Bag inBag;
    private static int currentRoom = 0;

    public Direction() {
        this.roomList = new ArrayList<>();
    }

    public void add(Room element) {
        roomList.add(element);
    }

    public Bag getBag() {
        return inBag;
    }


    public Room currentRoom() {
        Room r = roomList.get(currentRoom);
        r.look();
        return r;
    }

    public int go(String s){
        int i = currentRoom;
        if (s.contains("north")){
            i++;
            currentRoom = i;
        }else if (s.contains("south")){
            i--;
            currentRoom = i;
        }
        return i;
    }
}
