package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public record Note(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,

        @ManyToOne
        @JoinColumn(name = "owner_id", nullable = false)
        UserLab owner,

        String title,
        String content,
        LocalDateTime creationDate,

        @ManyToMany
        @JoinTable(
                name = "note_tag",
                joinColumns = @JoinColumn(name = "note_id"),
                inverseJoinColumns = @JoinColumn(name = "tag_id")
        )
        Set<Tag> tags) {
}
