package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public record UserLab(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id,

    String username,
    String email,

    @OneToMany(mappedBy = "owner")
    List<Note> notes
) {
}
