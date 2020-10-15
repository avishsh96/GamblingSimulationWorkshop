package com.company.gamblingsimulation;

public class GamblingSimulation {
     static int STAKE = 100;
     static int BET=1;

    public static void main(String[] args) {
        winLoose();
    }

    // UC-2 Win OR Loose
    public static void winLoose(){
        final int target = 150;
        final int stop = 50;
        final int win = 1;

        while(STAKE<target && STAKE>stop){
            int random = (int)Math.round(Math.random());
            if (random == win){
                System.out.println("Win");
                STAKE++;
            }else{
                System.out.println("Loose");
                STAKE--;
            }
        }
        if (STAKE>=150){
            System.out.println("WINnnnnnnnnnnnnnnnn");
        }else {
            System.out.println("LoooSssssssssss");
        }

    }
}
