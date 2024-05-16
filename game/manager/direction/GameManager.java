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

    public void startGame() {
        Room currentRoom = room;
        boolean gameEnded = false;

        while (!gameEnded) {
            String input;
            System.out.println("Where to?");
            System.out.print(">");
            input = InputControl.userInput();

            if (input.equals("north")) {
                currentRoom = currentRoom.getRoomMap("north");
            } else if (input.equals("south")) {
                currentRoom = currentRoom.getRoomMap("south");
            } else if (input.equals("east")) {
                currentRoom = currentRoom.getRoomMap("east");
            } else if (input.equals("west")){
                currentRoom = currentRoom.getRoomMap("west");
            }

            if (input.equals("exit")) {
                gameEnded = true;
            }
        }
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
