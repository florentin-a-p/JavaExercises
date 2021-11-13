//package academy.learnprogramming;
package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
//        int score = 6000;
        int score = 10000;
//        int levelCompleted = 4;
        int levelCompleted = 8;
//        int bonus = 100;
        int bonus = 200;

        if ((score < 5000) && (score > 1000))
//        if (score < 5000 && >1000)
        {
            System.out.println("your score was 5000");
            System.out.println("hmmmm");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");
        } else {
            System.out.println("got here");
        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("your final score was " + finalScore);
        }




    }
}
