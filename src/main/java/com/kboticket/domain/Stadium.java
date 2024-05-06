package com.kboticket.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "stadium")
@Getter @Setter
public class Stadium {

    @Id
    @Column(name = "stadium_id")
    private String id;

    private String name;

    private String address;

    @OneToMany(mappedBy = "stadium")
    private List<Seat> seats;

    @OneToMany(mappedBy = "stadium")
    private List<Team> teams;

}
