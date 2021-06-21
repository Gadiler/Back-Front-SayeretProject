package com.example.sayeretproject.beans;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "areas")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Area {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Singular
    private List<Point> points = new ArrayList<>();
}
