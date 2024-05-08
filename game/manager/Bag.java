package game.manager;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> itemListInBag;
    private final int TOTAL_SLOT = 100;

    public Bag() {
        this.itemListInBag = new ArrayList<>();
    }

    public void insert(int index, Item element) {
        itemListInBag.add(index, element);
    }

    public void getItem(int index) {
        itemListInBag.get(index);
    }

    public void addItem(Item element){
        itemListInBag.add(element);
    }

    public void drop(Item item, Room room) {
        itemListInBag.remove(item);
        room.setItemListRoom(item);
    }

    public ArrayList<Item> bag(){
        ArrayList<Item> temp = new ArrayList<>();
        for(Item i : itemListInBag){
         temp.add(i);
            System.out.println( i + "all the items in bag" );
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "itemList=" + itemListInBag +
                ", TOTAL_SLOT=" + TOTAL_SLOT +
                '}';
    }
}
