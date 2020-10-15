package com.company.gamblingsimulation;

public class GamblingSimulation {
    static final int STAKE = 100;
    static final int BET=1;

    public static void main(String[] args) {
        winLoose();
    }

    // UC-2 Win OR Loose
    public static void winLoose(){
        int cash = STAKE;
        final int target = 150;
        final int stop = 50;
        final int win = 1;
        while(cash < target && cash > stop){
            int random = (int)Math.round(Math.random());
            if (random == win){
                System.out.println("Win");
                cash = cash+BET;
            }else{
                System.out.println("Loose");
                cash = cash-BET;
            }
        }
        if (cash == 150){
            System.out.println("Gambler Won");
        }else {
            System.out.println("Gambler Loose");
        }
    }
}
