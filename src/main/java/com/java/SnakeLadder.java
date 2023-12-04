package com.java;

import java.util.Random;

public class SnakeLadder {
    public static final int BoardSize = 100;
    public static Random random = new Random();
    public static void main(String[] args) {
        int playerPosition = 0;
        int diceRollCount=0;
        while (playerPosition < BoardSize) {
            diceRollCount++;
            int diceRoll=(int)(Math.random()*6)+1;
            int option = random.nextInt(3);
            switch (option) {
                case 0:
                    System.out.println("No play: player stays in the same position");
                    break;
                case 1:
                    System.out.println("Ladder: player moves ahead by "+diceRoll+" position");
                    playerPosition += diceRoll;
                    break;
                case 2:
                    System.out.println("Snake: player moves behind by "+diceRoll+" position");
                    playerPosition -= diceRoll;
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
        System.out.println("Congratulation on reaching 100 with "+diceRollCount+" dice rolls");
    }
}
