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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( name = "theme_id")
    private int themeId;

    @Column
    private String question;

    @Column
    private String answer;
}
