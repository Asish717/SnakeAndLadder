package com.java;

import java.util.Random;

public class SnakeLadder {
    public static final int BoardSize=100;

    public static void main(String[] args) {
        int playerPosition=0;
        Random random=new Random();
        int ran=random.nextInt(7);
        if (ran==0){
            int dice=ran+1;
            System.out.println(dice);
        } else {
            System.out.println(ran);
        }
        int option=random.nextInt(3);
        switch (option){
            case 0:
                System.out.println("No play: player stays in the same position");
                break;
            case 1:
                System.out.println("Ladder: player moves ahead by dice position");
                break;
            case 2:
                System.out.println("Snake: player moves behind by dice position");
        }
    }
}
