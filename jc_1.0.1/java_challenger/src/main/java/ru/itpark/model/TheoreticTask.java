package ru.itpark.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Michael on 05.07.2017.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="theoretic_tasks")
public class TheoreticTask {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( name = "theme_id")
    private int themeId; */
    @EmbeddedId
    private TheoreticTaskPK id;

    @Column
    private String question;

    @Column( name = "first_answer")
    private String firstAnswer;

    @Column( name = "second_answer")
    private String secondAnswer;

    @Column( name = "third_answer")
    private String thirdAnswer;

    @Column( name = "true_answer")
    private String trueAnswer;
}
