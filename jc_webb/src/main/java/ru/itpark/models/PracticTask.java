package ru.itpark.models;

import javax.persistence.*;

/**
 * Created by Michael on 04.07.2017.
 */
@Entity
@Table(name = "practic_tasks")
public class PracticTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String question;

    @Column(name = "true_answer")
    private String trueAnswer;

    @Column
    private String theme;


    public PracticTask(){
    }

    public PracticTask(String question, String trueAnswer, String theme) {
        this.question = question;
        this.trueAnswer = trueAnswer;
        this.theme = theme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
