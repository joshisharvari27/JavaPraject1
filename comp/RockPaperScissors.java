package comp;

import java.util.*;

class RockPaperScissors {
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    int compScore = 0;
    int userScore = 0;
    public void takeInp(){
        System.out.println("Enter your choice:\nPress 1 for Rock\nPress 2 for Paper\nPress 3 for Scissors");
        for(int i=0; i<3; i++){
            int comp = ran.nextInt(1, 4);
            System.out.print("Your turn: ");
            int user = sc.nextInt();
            if((comp == 1 && user == 2) || (comp == 2 && user == 3) || (comp == 3 && user == 1)){
                System.out.println("You scored 1 point!!!");
                userScore++;
            }
            else if((user == 1 && comp == 2) || (user == 2 && comp == 3) || (user == 3 && comp == 1)){
                System.out.println("Computer scored 1 point!");
                compScore++;
            }
            else if(comp == user){
                System.out.println("It is a tie!!");
                compScore++;
                userScore++;
            }
        }
    }
    public void getScore(){
        if(compScore < userScore){
            System.out.println("----->>Congratulations! You won the game!!<<-----");
        }
        else if(userScore < compScore){
            System.out.println("----->>You lost! Computer won the game.<<-----");
        }
        else{
            System.out.println("It is a tie! Nobody won the game.");
        }
        System.out.println("Your score: "+userScore);
        System.out.println("Computer score: "+compScore);
        System.out.println();
        System.out.println("Press 1 to play again\nPress 0 to exit");
        int act = sc.nextInt();
        if(act == 1){
            takeInp();
        }
        else if(act == 0){
            System.out.println();
        }
    }
}
