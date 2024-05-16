package game.manager;

import game.manager.direction.Direction;
import game.manager.direction.GameManager;
import game.manager.direction.InputControl;
import pawtropolis.animals.domain.Animal;
import pawtropolis.animals.domain.AnimalList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player(InputControl.userInput(), 100);

        //instances of Room/ all the rooms
        Room room1 = new Room("room1 juju", Main.animalmethod());
        Room room2 = new Room("room2 aron", Main.animalmethod());
        Room room3 = new Room("room3 ellie", Main.animalmethod());
        Room room4 = new Room("room4 timur", Main.animalmethod());

        //instances of gameManager
        GameManager gameManager = new GameManager(room1, p1);
        //gameManager.startGame();

        //instances of bag
        Bag bag1 = new Bag();

        //instances of items
        Item item1 = new Item("item1", "very special", 10);
        Item item2 = new Item("item2", "fa cagare", 5);

        //room settings
        room1.setRoomMap("north", room2);
        room2.setRoomMap("south", room1);
        room2.setRoomMap("south", room3);
        room3.setRoomMap("north", room2);
        room3.setRoomMap("east", room4);
        room4.setRoomMap("west", room3);

        //item settings in a room
        room1.setItemListRoom(item1);
        room1.setItemListRoom(item2);

        //bag settings
        bag1.insert(0, item1);
        bag1.insert(1, item2);

        //browsing into the rooms
        Room r1 = room1.getRoomMap("north");
        System.out.println(r1.getName());

    }

    public static AnimalList animalmethod(){
        Animal animal1 = new Animal("tiger", "meat", 2, LocalDate.of(2020, 1, 1), 100, 100);

        AnimalList animalList = new AnimalList();
        animalList.add(animal1);
        return animalList;
    }
}