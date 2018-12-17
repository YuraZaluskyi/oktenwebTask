package models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString(exclude = {"phones", "emails"})
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String surname;


    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "user"
    )
    private List<Phone> phones = new ArrayList<>();

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "user"
    )
    private List<Email> emails = new ArrayList<>();

    public User(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
}
