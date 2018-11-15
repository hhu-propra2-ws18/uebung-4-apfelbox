package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Auto{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "marke")
    private String marke;
    @Column(name = "farbe")
    private String farbe;
    @Column(name = "hubraum")
    private double hubraum;
}
