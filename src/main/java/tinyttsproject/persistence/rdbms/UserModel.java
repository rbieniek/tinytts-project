package tinyttsproject.persistence.rdbms;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tinyttsproject.model.ModelConstants;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    @NotEmpty
    @Size(max = ModelConstants.USER_ID_LENGTH)
    @Column(name="user_id")
    private String userId;

    @NotNull
    @NotEmpty
    @Size(max = ModelConstants.USER_EMAIL_LENGTH)
    @Column(name="email_address")
    private String emailAddress;

    @NotNull
    @NotEmpty
    @Size(max = ModelConstants.USER_NAME_PART_LENGTH)
    @Column(name="first_name")
    private String firstName;

    @NotNull
    @NotEmpty
    @Size(max = ModelConstants.USER_NAME_PART_LENGTH)
    @Column(name="last_name")
    private String lastName;

    @Size(max = ModelConstants.USER_NAME_PART_LENGTH)
    @Column(name="middle_name")
    private String middleName;

    @NotNull
    private ZonedDateTime createdOn;

    @NotNull
    private ZonedDateTime updatedOn;

    private boolean deleted;
}
