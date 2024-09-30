package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
public record Tag(
        @Id
        String name
) {

        public String getName() {return name;}
}
