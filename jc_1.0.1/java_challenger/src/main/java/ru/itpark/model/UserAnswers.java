package ru.itpark.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Michael on 05.07.2017.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "user_answers")
public class UserAnswers implements Serializable {
    @EmbeddedId
    private UserAnswersPK id;

    @Column(name = "theoretic_task_last")
    private int theoreticTaskLast;

    @Column(name = "practic_task_last")
    private int practicTaskLast;

    @Column(name = "practic_answer_count")
    private int practicAnswerCount;

    @Column(name = "theoretic_answer_count")
    private int theoreticAnswerCount;
}

