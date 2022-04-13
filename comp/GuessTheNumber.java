package comp;

import java.util.*;

class GuessTheNumber {
    Scanner sc = new Scanner(System.in);
    int noOfGuesses = 0;
    Random ran = new Random();
    boolean b = true;
    public void takeNum(){
        int num = ran.nextInt(1, 100);
        while(b){
           System.out.println("Guess the number between 1 to 100");
           int inp = sc.nextInt();
           noOfGuesses++;
           if(inp == num){
               System.out.println("You guessed the number right!!\nNumber of attempts: "+noOfGuesses);
               System.out.println("Press 1 to play again\nPress 0 to exit");
               int act = sc.nextInt();
               if(act == 1){
                   takeNum();
               }
               else{
                   b = false;
               }
           }
           else if(inp > num){
               System.out.println("Too high! Enter a lower number.");
           }
           else{
               System.out.println("Too low! Enter a higher number.");
           }
       }
    }
}
