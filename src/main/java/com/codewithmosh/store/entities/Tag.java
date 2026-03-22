package com.codewithmosh.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Tag")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    @Column(nullable = false)
    private String tagType;

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private Set<User> user = new HashSet<>();
}
