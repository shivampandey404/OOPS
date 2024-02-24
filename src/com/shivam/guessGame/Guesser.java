package com.shivam.guessGame;
import java.util.Scanner;
public class Guesser {
    int GNum;
   int GuesserNum() {
       System.out.println("Guesser guess the name : ");
       Scanner sc = new Scanner(System.in);
       GNum = sc.nextInt();
     return GNum;
   }
}
