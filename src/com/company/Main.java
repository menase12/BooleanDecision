package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter your test score: ");
        int score;
        Scanner keyboard=new Scanner(System.in);
        score=keyboard.nextInt();
        char grade='F';
        if (score >89)
        { if(score<93)
        System.out.println("A-");
        else if(score>96)
            System.out.println("A+");
        else
            System.out.println("A");
        }
        else if (score >79)
        { if(score<83)
            System.out.println("B-");
        else if(score>86)
            System.out.println("B+");
        else
            System.out.println("B");
        }
        else if (score > 69)
        { if(score<73)
            System.out.println("C-");
        else if(score>76)
            System.out.println("C+");
        else
            System.out.println("C");
        }
        else if (score>59)

        System.out.println("D");
        else

        System.out.println("F");
        //if (score >69)
            //System.out.println("Very good! You dont have to retake the exam");
        //else
            //System.out.print("Did you even look at the book?");
    }
}
