import java.time.LocalDate;

public class Account {
    int id;
    String email;

    String  username;
    String  fullName;
    Department department;
    Position position;
    LocalDate createDate;
    Group[] groups;


//    @Override
//    public String toString() {
//        return "Account{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", username='" + username + '\'' +
//                ", fullname='" + fullname + '\'' +
//                ", DepartmentID=" + DepartmentID +
//                ", PositionID=" + PositionID +
//                ", CreateDate=" + CreateDate +
//                '}';
//    }
}
