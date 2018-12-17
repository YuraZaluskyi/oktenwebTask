package models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Table(name = "email_table")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String domain;
    private String title;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private User user;

    public Email(String domain, String title) {
        this.domain = domain;
        this.title = title;
    }
}
