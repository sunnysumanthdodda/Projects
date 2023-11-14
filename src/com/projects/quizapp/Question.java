package com.projects.quizapp;


public class Question {

    private final int id;
    private final String question;
    private final int[] opt;
    private final String answer;

    public Question(int id, String question, int[] opt, String answer) {
        this.id = id;
        this.question = question;
        this.opt = opt;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }


    public String getQuestion() {
        return question;
    }


    public String getAnswer() {
        return answer;
    }


    public int getOpt(int i){
        return opt[i];
    }

    public String toString(){
        return getId()+"."+getQuestion()+"\n"+"1)"+getOpt(0)+"  "+"2)"+getOpt(1)+"  "+"3)"+getOpt(2)+"  "+"4)"+getOpt(3);
    }

}
