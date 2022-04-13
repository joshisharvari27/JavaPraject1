package comp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    /* Here we are going to code three mini-games which can be played on console
	        1. Guess the number
	        2. Rock, paper, scissors
	        3. Quiz
        */
//        Make the objects of the classes
        GuessTheNumber game1 = new GuessTheNumber();
        RockPaperScissors game2 = new RockPaperScissors();
        PlayQuiz game3 = new PlayQuiz();

        Scanner sc = new Scanner(System.in);
        System.out.println("* * * Welcome to the Mini-Games Portal * * *\n");
        System.out.println("Choose the game you want to play: \nPress 1 for Number Guessing Game\nPress 2 for Rock Paper Scissors\nPress 3 to Play a Quiz\nPress 0 to exit");
        boolean flag = true;
            try{
                int gameInput = sc.nextByte();
                try{
                    while(flag){
                        if(gameInput == 1){
                            System.out.println("Welcome to the number guessing game!");
//                    class GuessTheNumber method call
                            game1.takeNum();
                        }
                        else if(gameInput == 2){
                            System.out.println("Welcome to Rock, Paper, Scissors Game!");
//                    class RockPaperScissors
                            game2.takeInp();
                            game2.getScore();
                        }
                        else if(gameInput == 3){
                            System.out.println("Welcome to the Quiz Game!");
//                    class PlayQuiz
                            game3.selectCategory();
                        }
                        else if(gameInput == 0){
                            break;
                        }
                        flag = false;
                    }
                }
                catch(Exception e){
                    System.out.println("Some error occurred! "+e);
                }

            }
            catch(Exception e){
                System.out.println("Error! "+e);
            }
        System.out.println("Thank you for your time! Visit again!!");
    }
}
