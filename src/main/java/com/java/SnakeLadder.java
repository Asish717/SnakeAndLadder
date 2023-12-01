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
    }
}
