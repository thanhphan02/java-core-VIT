import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Giam Doc";
        System.out.println("Ten phong ban: " + department.name);


        Position position = new Position();
        position.id = 1;
        position.name = PositionName.Dev;
        System.out.println("Ten chuc vu: " + position.name);

        Account account = new Account();
        account.id = 1;
        account.email = "thanh@gmail.com";
        account.username = "thanh";
        account.fullName = "Phan Quang Thanh";
        account.department = department;
        account.position = position;
        account.createDate = LocalDate.of(2024, 6, 4);
        System.out.println("Ngay tao: " + account.createDate);


        Group group = new Group();
        group.id = 1;
        group.name ="Nhom 1";
        group.creator = account;
        group.createDate = LocalDate.of(2023,6,4);
        System.out.println("id nguoi tao group: " + account.id);

        GroupAccount groupAccount = new GroupAccount();
        groupAccount.group = group;
        groupAccount.account=account;
        groupAccount.joinDate= LocalDate.now();

        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.id=1;
        typeQuestion.name = TypeName.Multiple_Choice;

        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.id =1;
        categoryQuestion.name = CategoryName.Java;

        Question question = new Question();
        question.id=1;
        question.content="noi dung";
        question.categoryID=categoryQuestion;
        question.typeID= typeQuestion;
        question.creatorID =account;
        question.createDate = LocalDate.of(2024,06,04);

        Answer answer = new Answer();
        answer.id=1;
        answer.content = "Tra loi";
        answer.questionID= question;
        answer.isCorrect = true;

        Exam exam = new Exam();
        exam.id = 1;
        exam.code = 12;
        exam.title = "thuc hanh";
        exam.categoryID = categoryQuestion;
        exam.duration = 60;
        exam.cretorID = account;
        exam.createDate = LocalDate.of(2024,6,4);

        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.examID = exam;
        examQuestion.questionID = question;
    }
}
