package ru.itpark.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Michael on 05.07.2017.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="themes")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


    @Column
    private String name;

    @Column
    private String ruName;

    @Column(name ="text")
    private String text;


    /*@OneToMany
    @JoinTable(name = "practic_tasks",
            joinColumns =
            @JoinColumn(name = "theme_id"),
            inverseJoinColumns =
            @JoinColumn(name = "id"))
    private List<PracticTask> practicTaskList;

    @OneToMany
    @JoinTable(name = "theoretic_tasks",
            joinColumns =
            @JoinColumn(name = "theme_id"),
            inverseJoinColumns =
            @JoinColumn(name = "id"))
    private List<TheoreticTask> theoreticTaskList; */


}
