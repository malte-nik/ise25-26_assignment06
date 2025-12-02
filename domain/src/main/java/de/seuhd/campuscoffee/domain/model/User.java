package de.seuhd.campuscoffee.domain.model;

import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;

@Builder(toBuilder = true)
public record User(
        //TODO: Implement user domain object
       @Nullable Long id,
       @Nullable LocalDateTime createdAt,
       @Nullable LocalDate updatedAt,
       @NonNull String loginName,
       @NonNull String emailAddress
       @NonNull String firstName,
       @NonNull String lastName,
) implements Serializable { // serializable to allow cloning (see TestFixtures class).
    @Serial
    private static final long serialVersionUID = 1L;
}
