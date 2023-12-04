package com.java;

import java.util.Random;

public class SnakeLadder {
    public static final int BoardSize = 100;
    public static Random random = new Random();
    public static void main(String[] args) {
        int playerPosition = 0;
        while (playerPosition < BoardSize) {
            int option = random.nextInt(3);
            switch (option) {
                case 0:
                    System.out.println("No play: player stays in the same position");
                    break;
                case 1:
                    System.out.println("Ladder: player moves ahead by dice position");
                    playerPosition += (int)(Math.random()*6)+1;
                    break;
                case 2:
                    System.out.println("Snake: player moves behind by dice position");
                    playerPosition -= (int)(Math.random()*6)+1;
                    break;
            }
            if (playerPosition<0){
                playerPosition=0;
            }
            else if (playerPosition>BoardSize){
                playerPosition=BoardSize-(playerPosition-BoardSize);
            }
            System.out.println(playerPosition);
        }
    }
}
