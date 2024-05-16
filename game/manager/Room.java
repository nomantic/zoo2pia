package game.manager;
import game.manager.direction.GameManager;
import pawtropolis.animals.domain.AnimalList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    private Map<String, Room> roomMap;
    private static GameManager gameManager;
    private String name;
    private List<Item> itemListRoom;
    private AnimalList animalList;
    private static Room staticRoom = null;



    public Room(String name, AnimalList animalList) {
        this.name = name;
        this.itemListRoom = new ArrayList<>();
        this.roomMap = new HashMap<>();
        this.animalList = animalList;

    }

    public String getName() {
        return name;
    }

    public void setRoomMap(String s, Room room) {
        this.roomMap.put(s, room);
    }

    public List<Item> getItem(){
        List<Item> temp = new ArrayList<>();
        for (Item i : itemListRoom){
            System.out.println(animalList);
            temp.add(i);
        }
        return temp;
    }

    public void setItemListRoom(Item item){
        itemListRoom.add(item);

    }


    public void setName(String name) {
        this.name = name;
    }

    public Room getRoomMap(String s) {
        Room newRoom = this.roomMap.get(s);
        return newRoom;
    }

    public static void getCRoom() {

    }


    public AnimalList getAnimalList() {
        return animalList;
    }

    public void setAnimalList(AnimalList animalList) {
        this.animalList = animalList;
    }

    public void look() {

        System.out.println("You are in the " + this.getName() + ".");
        System.out.println("You see the following items :"+ this.itemListRoom);
        System.out.println("You see the following animals in the zoo:" + this.animalList.get(0));
    }
}