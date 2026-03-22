package com.codewithmosh.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @Setter(AccessLevel.NONE)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @NonNull
    private String password;

    // CREATING ONE-TO-MANY RELATIONSHIP
    // A user can have many addresses but each address should belong to only one user
    @OneToMany(mappedBy = "user")
    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address){
        addresses.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address){
        addresses.remove(address);
        address.setUser(null);
    }



    @ManyToMany
    @JoinTable(
            name = "user_tag",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>();

    public void addTag(Tag tag){
        tags.add(tag);
        tag.getUser().add(this);
    }

    public void removeTag(Tag tag) {
        tags.remove(tag);
        tag.getUser().remove(this);
    }



    @OneToOne(mappedBy = "user")
    private Profile profile;

    public void setProfile(Profile prof) {

        // 1. Break old relationship
        if (this.profile != null) {
            this.profile.setUser(null);
        }

        // 2. Set new profile
        this.profile = profile;

        // 3. Update owning side (VERY IMPORTANT)
        if (profile != null) {
            profile.setUser(this);   // ✅ use parameter, NOT this.profile
        }
    }

}
