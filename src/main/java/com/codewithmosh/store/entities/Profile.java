package com.codewithmosh.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Profile")
@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NonNull
    private String bio;

    @NonNull
    private String phoneNumber;

    @NonNull
    private LocalDate dateOfBirth;

    @NonNull
    private Integer loyaltyPoint;

    @OneToOne
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;


}
