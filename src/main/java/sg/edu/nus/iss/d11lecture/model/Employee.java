package sg.edu.nus.iss.d11lecture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Do not need getters and setters because there is Lombok
@Data
@AllArgsConstructor // Equivalent to generating a constructor using all parameters
@NoArgsConstructor
public class Employee {
    private String firstName;

    private String lastName;

    private String email;
    
}
