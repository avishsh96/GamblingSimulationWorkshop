package com.company.gamblingsimulation;

public class GamblingSimulation {
    static final int STAKE = 100;
    static final int BET = 1;
    static final int win = 1;

    public static void main(String[] args) {
        resignStake();
    }

    // UC-2 Win OR Loose
    public static int winLoose() {
        int random = (int) Math.round(Math.random());
        if (random == win) {
            return 1;
        } else {
            return 0;

        }
    }

    //UC-3 IF target hits or stop loss hits
    public static void resignStake() {
        int noOfTimeWon = 0;
        int noOfTimeloss = 0;
        for (int i =0;i<20;i++) {
            int cash = STAKE;
            final int target = 150;
            final int stop = 50;
            while (cash < target && cash > stop) {
                int random = winLoose();
                if (random == win) {
                    cash = cash + BET;
                } else {
                    cash = cash - BET;
                }
            }
            if (cash == 150) {
                System.out.println("Gambler Won");
                noOfTimeWon++;
            } else {
                System.out.println("Gambler Loose");
                noOfTimeloss++;
            }
        }
        System.out.println("Number of time Wins in 20 Days: "+ noOfTimeWon);
        System.out.println("Number of time Looses in 20 Days: "+ noOfTimeloss);
    }
}
