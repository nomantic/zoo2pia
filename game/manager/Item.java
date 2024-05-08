package game.manager;

public class Item {
    private String name;
    private String description;
    private int requestedSlot;

    public Item(String name, String description, int requestedSlot) {
        this.name = name;
        this.description = description;
        this.requestedSlot = requestedSlot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequestedSlot() {
        return requestedSlot;
    }

    public void setRequestedSlot(int requestedSlot) {
        this.requestedSlot = requestedSlot;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", requestedSlot=" + requestedSlot +
                '}';
    }
}
