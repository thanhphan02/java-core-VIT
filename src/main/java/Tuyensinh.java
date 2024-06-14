//public class Tuyensinh {
//    public void showMenu() {
//        while (true) {
//            System.out.println("1. Thêm thí sinh");
//            System.out.println("2. Hiển thị danh sách thí sinh");
//            System.out.println("3. Tìm kiếm thí sinh theo số báo danh");
//            System.out.println("4. Thoát chương trình");
//            System.out.println("Mời bạn chọn chức năng:");
//            int menu = Integer.parseInt(scanner.nextLine());
//            if (menu == 1) {
//                themThiSinh();
//            } else if (menu == 2) {
//                hienThiDSTS();
//            } else if (menu == 3) {
//                timKiemThiSinhTheoSBD();
//            } else if (menu == 4) {
//                return;
//            } else {
//                System.out.println("Vui lòng chọn đúng chức năng");
//            }
//        }
//    }
//    System.out.println("Nhập vào số báo danh:");
//    int soBaoDanh = Integer.parseInt(scanner.nextLine());
//System.out.println("+------+--------------------+-------------------------+------+-------------------------+");
//System.out.println("| SBD  |       HO TEN       |         DIA CHI         | MUT  |         MON THI         |");
//System.out.println("+------+--------------------+-------------------------+------+-------------------------+");
//for (ThiSinh thiSinh : thiSinhList) {
//        if (thiSinh.soBaoDanh != soBaoDanh) continue;
//        System.out.printf(
//                "| %-4s | %-18s | %-18s | %-4s | %-18s |%n",
//                thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.mucUuTien, thiSinh.monThi()
//        );
//    }
//
//}
