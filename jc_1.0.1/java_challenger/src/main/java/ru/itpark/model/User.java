package ru.itpark.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by Michael on 05.07.2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="users")
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

    @Column(name = "total_practic_answer_count")
    private int totalPracticAnswersCount;

    @Column(name = "total_theoretic_answer_count")
    private int totalTheoreticAnswersCount;

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.totalPracticAnswersCount = 0;
        this.totalTheoreticAnswersCount = 0;
    }
}
