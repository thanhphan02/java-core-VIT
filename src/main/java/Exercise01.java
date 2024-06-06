public class Exercise01 {
    public void question01() {


        Department department = new Department();
        department.name = "Giam doc";
        department.id = 01;

        Account account = new Account();
        account.department = department;

        if (account.department == null) {
            System.out.println("Nhan vien nay chua co phong ban");
        } else {
            System.out.println("Phong ban cua nhan vien la : " + account.department.name);
        }
    }
    public void question02(){
        Account account1 = new Account();
        account1.id = 1;
        Account account2 = new Account();
        account2.id =2;

        Group group1 = new Group();
        group1.creator = account1;

        Group group2 = new Group();
        group2.creator= account2;

        GroupAccount groupAccount1= new GroupAccount();
        groupAccount1.account = account1;
        groupAccount1.group = group1;
        GroupAccount groupAccount2= new GroupAccount();
        groupAccount2.account = account1;
        groupAccount2.group = group1;
        GroupAccount groupAccount3= new GroupAccount();
        groupAccount3.account = account1;
        groupAccount3.group = group1;
        GroupAccount groupAccount4= new GroupAccount();
        groupAccount4.account = account1;
        groupAccount4.group = group1;
        if (account1== null) {
            
        }

    }

}
