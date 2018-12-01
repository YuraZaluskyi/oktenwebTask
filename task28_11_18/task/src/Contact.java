import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
    private int id;
    private String firstName;
    private String Surname;
    private String email;
    private String phone;
    private TypeCompany typeCompany;
    private TypeDepartment typeDepartment;

}
