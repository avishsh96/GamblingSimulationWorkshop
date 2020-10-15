package com.company.gamblingsimulation;

public class GamblingSimulation {
    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN = 1;
    static int noOfTimeWon = 0;
    static int cashWon=0;
    static int noOfTimeLoss = 0;
    static int cashLow=0;

    public static void main(String[] args) {
        winLoose20Days();
    }

    // UC-2 Win OR Loose
    public static int winLoose() {
        int random = (int) Math.round(Math.random());
        if (random == WIN) {
            return 1;
        } else {
            return 0;

        }
    }

    //UC-3 IF target hits or stop loss hits
    public static void resignStake() {
        int cash = STAKE;
        final int target = 150;
        final int stop = 50;
        while (cash < target && cash > stop) {
            int random = winLoose();
            if (random == WIN) {
                cash = cash + BET;
            } else {
                cash = cash - BET;
            }
        }
        if (cash == 150) {
            System.out.println("Gambler Won");
            noOfTimeWon++;
            cashWon=cashWon+cash;
        } else {
            System.out.println("Gambler Loose");
            noOfTimeLoss++;
            cashLow=cashLow-cash;
        }
    }

    //UC-4 Win or Loose for 20 days
    public static void winLoose20Days(){
        int days = 20;
        for (int i =0; i<days; i++) {
            resignStake();
        }
        System.out.println("Number of time Wins in 20 Days: "+ noOfTimeWon);
        System.out.println("Number of time Looses in 20 Days: "+ noOfTimeLoss );
        System.out.println("Cash-Won: $"+cashWon+" Cash-Lost: $"+cashLow);
    }
}
