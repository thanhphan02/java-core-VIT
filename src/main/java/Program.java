import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Giam Doc";
        System.out.println("Ten phong ban: " + department.name);



        Position position = new Position();
        position.id = 1;
        position.positionName  = PositionName.Dev;
        System.out.println("Ten chuc vu: " + position.positionName);

        Account account = new Account();
        account.id =1;
        account.email= "thanh@gmail.com";
        account.username ="thanh";
        account.fullname = "Phan Quang Thanh";
        account.department = department;
        account.Position = position;
        account.CreateDate =  LocalDate.of(2024, 6, 4);
        System.out.println("Ngay tao: " + account.CreateDate);

        Group group = new Group();
        group.id = 1;
        group.name ="Nhom 1";
        group.Creator = 1;
        group.CreateDate = LocalDate.of(2023,6,4);
        System.out.println("Ten nhom: " + group.name);

        GroupAccount groupAccount = new GroupAccount();
        groupAccount.id =1;
        groupAccount.AccountID=1;
        groupAccount.JoinDate= LocalDate.of(2024,06,04);

        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.id=1;
        TypeName typeName = TypeName.Multiple_Choice;

        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.id =1;
        CategoryName categoryName = CategoryName.Java;

        Question question = new Question();
        question.id=1;
        question.content="noi dung";
        question.CreatorID=1;
        question.TypeID=1;
        question.CategoryID =1;
        question.CreateDate = LocalDate.of(2024,06,04);

        Answer answer = new Answer();
        answer.id=1;
        answer.content = "Tra loi";
        answer.QuestionID= 1;
        answer.isCorrect = true;

        Exam exam = new Exam();
        exam.id = 1;
        exam.code = 12;
        exam.title = "thuc hanh";
        exam.duration = 60;
        exam.CategoryID =1;
        exam.CreateDate = LocalDate.of(2024,6,4);

        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.id = 1;
        examQuestion.QuestionID =1;
    }
}
