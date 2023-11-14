package com.projects.quizapp;

public class QuizApp {
    public static void main(String[] args) {

        QuestionService questionService = new QuestionService();
        questionService.displayQuestions();
        System.out.println();
        questionService.displayScore();
    }
}
