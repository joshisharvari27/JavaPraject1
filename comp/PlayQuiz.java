package comp;

import java.util.Objects;
import java.util.Scanner;

class PlayQuiz {
    Scanner sc = new Scanner(System.in);
    public void selectCategory(){
        System.out.println("Select one category from the following to continue");
        System.out.println("Press 1 for Science\nPress 2 for History\nPress 3 for Food");
        System.out.println("Note - Answer only in Numbers or CAPITAL letters");
        int category = sc.nextInt();
        if(category == 1)catScience();
        else if(category == 2)catHistory();
        else if(category == 3)catFood();
        else{
            System.out.println("Error occurred!");
            playAgain();
        }
    }

    public void catScience(){
        System.out.println("How many bones are there in human body?");
        int ans1 = sc.nextInt();
        System.out.println("What is the hardest natural substance on Earth?");
        String ans2 = sc.next();
        System.out.println("What is a material that will not carry an electrical charge called?");
        String ans3 = sc.next();
        if(ans1 == 206 && Objects.equals(ans2, "DIAMOND") && Objects.equals(ans3, "INSULATOR")){
            System.out.println("----->>Congratulation!! All answers are correct!!<<-----");
        }
        else{
            System.out.println("You lost! Correct answers are:\n1. 206\n2. DIAMOND\n3. INSULATOR");
        }
        playAgain();
    }

    public void catHistory(){
        System.out.println("Where did British first open their factories in Eastern part of India?");
        String ans1 = sc.next();
        System.out.println("When East India Company came into existence, England was ruled by..?");
        String ans2 = sc.next();
        System.out.println("Which dynasty was ruling North India at the time of Alexander's invasion?");
        String ans3 = sc.next();
        if(Objects.equals(ans1, "ORISSA") && Objects.equals(ans2, "NORMANS") && Objects.equals(ans3, "NANDA")){
            System.out.println("----->>Congratulation!! All answers are correct!!<<-----");
        }
        else{
            System.out.println("You lost! Correct answers are:\n1. ORISSA\n2. NORMANS\n3. NANDA");
        }
        playAgain();
    }

    public void catFood(){
        System.out.println("Where does the Caesar salad originate from?");
        String ans1 = sc.next();
        System.out.println("Which part of the Ginger plant we eat?");
        String ans2 = sc.next();
        System.out.println("Where does coffee originate from?");
        String ans3 = sc.next();
        if(Objects.equals(ans1, "MEXICO") && Objects.equals(ans2, "STEM") && Objects.equals(ans3, "ETHIOPIA")){
            System.out.println("----->>Congratulation!! All answers are correct!!<<-----");
        }
        else{
            System.out.println("You lost! Correct answers are:\n1. MEXICO\n2. STEM\n3. ETHIOPIA");
        }
        playAgain();
    }

    public void playAgain(){
        System.out.println("Press 1 to play again\nPress 0 to exit");
        int act = sc.nextInt();
        if(act == 1)selectCategory();
        else if(act == 0)System.out.println();
    }
}
