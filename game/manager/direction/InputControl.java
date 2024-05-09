package game.manager.direction;

import java.util.Scanner;

public class InputControl {
    
    //gets user input
    public static String initializePlayer(){
        Scanner scr=new Scanner(System.in);
        String player= scr.nextLine();
        System.out.println("Hi player! welcome to the game, what is your name? " + player );
        return player;
    }
}
