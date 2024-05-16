package game.manager.direction;

import java.util.Scanner;

public class InputControl {

    //gets user input
    public static String userInput(){
        Scanner scr=new Scanner(System.in);
        String player= scr.nextLine();
        return player;
    }
}
