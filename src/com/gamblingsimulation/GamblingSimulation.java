package com.gamblingsimulation;

public class GamblingSimulation {
    public static void main(String[] args) {
        final int STAKE = 100;
        final int BET=1;
        winLoose();
    }
    public static void winLoose(){
        int win = 1;
        int random = (int)Math.round(Math.random());
        if (random == win){
            System.out.println("Win");
        }else{
            System.out.println("Loose");
        }
    }
}
