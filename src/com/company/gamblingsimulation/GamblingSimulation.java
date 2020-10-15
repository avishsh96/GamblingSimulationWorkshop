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

    public static void resignStake() {
        int cash = STAKE;
        final int target = 150;
        final int stop = 50;
        final int win = 1;
        while (cash < target && cash > stop) {
            int random = winLoose();
            if (random == win) {
                cash = cash + BET;
            } else {
                cash = cash - BET;
            }
        }
        if (cash == 150){
            System.out.println("Gambler Won");
        }else {
            System.out.println("Gambler Loose");
        }
    }
}
