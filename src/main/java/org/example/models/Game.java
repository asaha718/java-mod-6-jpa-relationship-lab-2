package org.example.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="GAMES")
public class Game {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String genre;
    private String platform;
    private int price;
    @Temporal(TemporalType.DATE)
    private LocalDate created_at;
    @Temporal(TemporalType.DATE)
    private LocalDate updated_at;

    @OneToMany(mappedBy = "review")
    private List<Review> reviews= new ArrayList<>();

}
