package com.codewithmosh.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Address")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @Setter(AccessLevel.NONE)
    private Long id;

    @NonNull
    private String street;

    @NonNull
    private String city;

    @NonNull
    private String zip;

    @NonNull
    private  String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User user;
}
