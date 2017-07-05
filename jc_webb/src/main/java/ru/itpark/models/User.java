package ru.itpark.models;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;


    @Column(name = "first_theme_answer_count")
    private int firstThemeAnswerCount;

    @Column(name = "second_theme_answer_count")
    private int secondThemeAnswerCount;

    @Column(name = "third_theme_answer_count")
    private int thirdThemeAnswerCount;

    @Column(name = "four_theme_answer_count")
    private int fourThemeAnswerCount;

    @Column(name = "five_theme_answer_count")
    private int fiveThemeAnswerCount;

    @Column(name = "complited_theoretic_tasks")
    private int complitedTheoreticTasks = firstThemeAnswerCount + secondThemeAnswerCount + thirdThemeAnswerCount +
            +fourThemeAnswerCount + fiveThemeAnswerCount;

    @Column(name = "first_theme_practic_answer_count")
    private int firstThemePracticAnswerCount;

    @Column(name = "second_theme_practic_answer_count")
    private int secondThemePracticAnswerCount;

    @Column(name = "third_theme_practic_answer_count")
    private int thirdThemePracticAnswerCount;

    @Column(name = "four_theme_practic_answer_count")
    private int fourThemePracticAnswerCount;


    @Column(name = "complited_practic_tasks")
    private int complitedPracticTasks  = firstThemePracticAnswerCount + secondThemePracticAnswerCount +
            thirdThemePracticAnswerCount + fourThemePracticAnswerCount;

    public User() {
    }

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.firstThemeAnswerCount = 0;
        this.secondThemeAnswerCount = 0;
        this.thirdThemeAnswerCount = 0;
        this.fourThemeAnswerCount = 0;
        this.fiveThemeAnswerCount = 0;
        this.complitedTheoreticTasks = 0;
        this.firstThemePracticAnswerCount = 0;
        this.secondThemePracticAnswerCount = 0;
        this.thirdThemePracticAnswerCount = 0;
        this.fourThemePracticAnswerCount = 0;
        this.complitedPracticTasks = 0;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirstThemeAnswerCount() {
        return firstThemeAnswerCount;
    }

    public void setFirstThemeAnswerCount(int firstThemeAnswerCount) {
        this.firstThemeAnswerCount = firstThemeAnswerCount;
    }

    public int getSecondThemeAnswerCount() {
        return secondThemeAnswerCount;
    }

    public void setSecondThemeAnswerCount(int secondThemeAnswerCount) {
        this.secondThemeAnswerCount = secondThemeAnswerCount;
    }

    public int getThirdThemeAnswerCount() {
        return thirdThemeAnswerCount;
    }

    public void setThirdThemeAnswerCount(int thirdThemeAnswerCount) {
        this.thirdThemeAnswerCount = thirdThemeAnswerCount;
    }

    public int getFourThemeAnswerCount() {
        return fourThemeAnswerCount;
    }

    public void setFourThemeAnswerCount(int fourThemeAnswerCount) {
        this.fourThemeAnswerCount = fourThemeAnswerCount;
    }

    public int getFiveThemeAnswerCount() {
        return fiveThemeAnswerCount;
    }

    public void setFiveThemeAnswerCount(int fiveThemeAnswerCount) {
        this.fiveThemeAnswerCount = fiveThemeAnswerCount;
    }


    public int getComplitedTheoreticTasks() {
        return complitedTheoreticTasks;
    }

    public void setComplitedTheoreticTasks(int complitedTheoreticTasks) {
        this.complitedTheoreticTasks = complitedTheoreticTasks;
    }

    public int getFirstThemePracticAnswerCount() {
        return firstThemePracticAnswerCount;
    }

    public void setFirstThemePracticAnswerCount(int firstThemePracticAnswerCount) {
        this.firstThemePracticAnswerCount = firstThemePracticAnswerCount;
    }

    public int getSecondThemePracticAnswerCount() {
        return secondThemePracticAnswerCount;
    }

    public void setSecondThemePracticAnswerCount(int secondThemePracticAnswerCount) {
        this.secondThemePracticAnswerCount = secondThemePracticAnswerCount;
    }

    public int getThirdThemePracticAnswerCount() {
        return thirdThemePracticAnswerCount;
    }

    public void setThirdThemePracticAnswerCount(int thirdThemePracticAnswerCount) {
        this.thirdThemePracticAnswerCount = thirdThemePracticAnswerCount;
    }

    public int getFourThemePracticAnswerCount() {
        return fourThemePracticAnswerCount;
    }

    public void setFourThemePracticAnswerCount(int fourThemePracticAnswerCount) {
        this.fourThemePracticAnswerCount = fourThemePracticAnswerCount;
    }

    public int getComplitedPracticTasks() {
        return complitedPracticTasks;
    }

    public void setComplitedPracticTasks(int complitedPracticTasks) {
        this.complitedPracticTasks = complitedPracticTasks;
    }
}
