package org.example.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="REVIEWS")
public class Review {
    @Id
    @GeneratedValue
    private int id;
    private int score;
    private String comment;
    private int game_id;
    @Temporal(TemporalType.DATE)
    private LocalDate created_at;
    @Temporal(TemporalType.DATE)
    private LocalDate updated_at;
    @ManyToOne
    private Game game;


}
