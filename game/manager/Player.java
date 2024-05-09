package game.manager;

import java.util.Scanner;

public class Player {
    private String name;
    private int lifePoints;

    public Player(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    //gets user input
    public String initializePlayer(){
        Scanner scr=new Scanner(System.in);
        String player= scr.nextLine();
        System.out.println("Hi player! welcome to the game, what is your name? " + player );
        return player;
    }

}
