package swp.internmanagement.internmanagement.payload.request;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")


public class HelpRequest {

    @Valid

    private int managerId;

    private int mentorId;

    private int coordinatorId;

    private int internId;

    @NotNull
    @NotEmpty
    @NotBlank
    private String requestType;

    @NotNull
    @NotEmpty
    @NotBlank
    private String requestDescription;


    private byte requestStatus;

}
