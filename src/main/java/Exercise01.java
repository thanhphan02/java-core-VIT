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
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        Group[] groups = {group1,group2,group3};

        if (groups.length == 0){
            System.out.println("Nhan vien nay chua co group");
        } else if (groups.length == 1 || groups.length ==2) {
            System.out.println("Group cua nhan vien nay laf Java Fresher, C# Fresher");
        }else if (groups.length == 3){
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        }else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }
    void question03() {
        Department department = new Department();
        department.name = "Giám đốc";

        Account account = new Account();
        account.department = department;

        String message = (account.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account.department.name;
        System.out.println(message);
    }

    void question04() {
        Position position = new Position();
        position.name = PositionName.Dev;

        Account account = new Account();
        account.position = position;

        String message = (account.position.name == PositionName.Dev
                ? "Đây là developer"
                : "Người này không phải là developer");
        System.out.println(message);
    }

    void question05() {
        Account[] accounts = {new Account(), new Account()};
        Group group = new Group();
        group.accounts = accounts;

        switch (group.accounts.length) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
    }

    void question06() {
        Group[] groups = {new Group(), new Group()};
        Account account = new Account();
        account.groups = groups;

        switch (account.groups.length) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }

    void question07() {
        Position position = new Position();
        position.name = PositionName.Dev;

        Account account = new Account();
        account.position = position;

        switch (account.position.name) {
            case Dev:
                System.out.println("Đây là developer");
                break;
            default:
                System.out.println("Người này không phải là developer");
                break;
        }
    }

    void question08() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        for (Account account : accounts) {
            System.out.println("- Email: " + account.email);
            System.out.println("- Họ và tên: " + account.fullName);
            System.out.println("- Tên phòng ban: " + account.department.name);
        }
    }

    void question09() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        for (Department department : departments) {
            System.out.println("- Mã phòng ban: " + department.id);
            System.out.println("- Tên phòng ban: " + department.name);
        }
    }

    void question10() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            System.out.println();
        }
    }

}
