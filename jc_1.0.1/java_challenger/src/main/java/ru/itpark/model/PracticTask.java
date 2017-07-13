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
@Entity
@ToString
@EqualsAndHashCode
@Table(name="practic_tasks")
public class PracticTask {
    @EmbeddedId
    private PracticTaskPK id;

    @Column
    private String question;

    @Column
    private String answer;
}
