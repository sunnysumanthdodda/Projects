package com.projects.quizapp;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];

    String[] answer = new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"What is size of int?",new int[]{2,4,6,8},"4");
        questions[1] = new Question(2,"What is size of double?",new int[]{4,2,6,8}, "8");
        questions[2] = new Question(3,"What is size of float?",new int[]{8,4,6,2}, "4");
        questions[3] = new Question(4,"What is size of long?",new int[]{8,6,4,2}, "8");
        questions[4] = new Question(5,"What is size of char?",new int[]{4,6,2,8}, "2");
    }

    public void displayQuestions(){
        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer: ");
            answer[i] = sc.nextLine();
        }
    }

    public void displayScore(){
        int score = 0;
        for(int i=0;i<questions.length;i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = answer[i];
            if(actualAnswer.equals(userAnswer)) score++;
        }
        if(score==questions.length) System.out.println("Congratulations..!! You score is : "+score+"/"+score);
        else System.out.println("Your score is : "+score+"/"+questions.length+"\n"+"Better luck next time..!");
    }
}