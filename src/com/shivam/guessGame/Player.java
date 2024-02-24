package com.shivam.guessGame;
import java.util.Scanner;
public class Player {
     int num;
    int PlayerNum(){
        System.out.println("Player Guess the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }
}
