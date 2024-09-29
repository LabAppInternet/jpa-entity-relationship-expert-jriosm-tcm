package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
public record Permission(
        @Id
        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        UserLab owner,

        @Id
        @ManyToOne
        @JoinColumn(name = "note_id", nullable = false)
        Note note,

        boolean canRead,
        boolean canEdit) {
}
