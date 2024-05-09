package pawtropolis.animals.domain;

import game.manager.Bag;
import game.manager.Item;
import game.manager.Player;
import game.manager.Room;
import game.manager.direction.Direction;
import game.manager.direction.GameManager;
import game.manager.direction.InputControl;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player(InputControl.userInput(), 100);

        //instances of Room/ all the rooms
        Room room1 = new Room("room1 juju", Main.animalmethod());
        Room room2 = new Room("room2 aron", Main.animalmethod());
        Room room3 = new Room("room3 ellie", Main.animalmethod());
        Room room4 = new Room("room4 timur", Main.animalmethod());
        GameManager gameManager = new GameManager(room1, p1);

        Bag bag1 = new Bag();

        Direction ns = new Direction();
        Item item1 = new Item("item1", "very special", 10);
        Item item2 = new Item("item2", "fa cagare", 5);

        room1.setRoomMap("north", room2);
        room2.setRoomMap("south", room1);
        room2.setRoomMap("south", room3);
        room3.setRoomMap("north", room2);
        room3.setRoomMap("east", room4);
        room4.setRoomMap("west", room3);


        room1.setItemListRoom(item1);
        room1.setItemListRoom(item2);


        bag1.insert(0, item1);
        bag1.insert(1, item2);

        ns.add(room1);
        ns.add(room2);



        Room r1 = room1.getRoomMap("north");
        Room.getCRoom().look();

    }

    public static AnimalList animalmethod(){
        Animal animal1 = new Animal("tiger", "meat", 2, LocalDate.of(2020, 1, 1), 100, 100);

        AnimalList animalList = new AnimalList();
        animalList.add(animal1);
        return animalList;
    }
}