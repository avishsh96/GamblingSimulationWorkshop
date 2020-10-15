package com.company.gamblingsimulation;

public class GamblingSimulation {
     static int STAKE = 100;
     static int BET=1;

    public static void main(String[] args) {
        winLoose();
    }

    // UC-2 Win OR Loose
    public static void winLoose(){
        int target = 150;
        int stop = 50;
        int win = 1;

        while(STAKE<target && STAKE>stop){
            int random = (int)Math.round(Math.random());
            if (random == win){
                System.out.println("Win");
                STAKE = STAKE+BET;
            }else{
                System.out.println("Loose");
                STAKE=STAKE-BET;
            }
        }
        if (STAKE>=150){
            System.out.println("WINnnnnnnnnnnnnnnnn");
        }else {
            System.out.println("Losssssssssssss");
        }

    }
}
