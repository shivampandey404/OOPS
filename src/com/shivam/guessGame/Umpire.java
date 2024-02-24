package com.shivam.guessGame;

public class Umpire {
    int getNumFrGuesser;
    int getNumFrPlayer1;
    int getNumFrPlayer2;
    int getNumFrPlayer3;
   void NumFrGuesser(){
        Guesser g = new Guesser();
        getNumFrGuesser = g.GuesserNum();
    }
    void NumFrPlayer(){
       Player P1 = new Player();
        Player P2 = new Player();
        Player P3 = new Player();
        getNumFrPlayer1 = P1.PlayerNum();
        getNumFrPlayer2 = P2.PlayerNum();
        getNumFrPlayer3 = P3.PlayerNum();
    }
    void Compare(){
       if(getNumFrGuesser == getNumFrPlayer1){
           if (getNumFrGuesser == getNumFrPlayer2 && getNumFrGuesser == getNumFrPlayer3){
               System.out.println("All the 3 Players Won the Match");
           }
       } else if (getNumFrGuesser == getNumFrPlayer2) {
           if (getNumFrGuesser == getNumFrPlayer3){
               System.out.println("Player 2 and 3 won the Match");
           }
       } else if (getNumFrGuesser == getNumFrPlayer3) {
           System.out.println("Player 3 won the Match");
       }else{
           System.out.println("Game Over");
       }
    }
}
