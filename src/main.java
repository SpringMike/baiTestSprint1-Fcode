import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Account account1 = new Account(510, "minh");
        Account account2 = new Account(120, "linh");
        ArrayList<Account> list = new ArrayList<>();
        list.add(account1);
        list.add(account2);
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----------------------");
            System.out.println("enter choice");
            System.out.println("1.hien thi thong tin");
            System.out.println("2.nap tien");
            System.out.println("3.rut tien");
            System.out.println("4.phuong thuc dao han");
            System.out.println("5.chuyen khoan");
            System.out.println("0.exit");
            System.out.println("-----------------------");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(account1.toString());
                    System.out.println(account2.toString());
                    break;
                case 2:
                    int moneyAdd = scanner.nextInt();
                    if (moneyAdd <= 0) {
                        System.out.println("khong hop le");
                    } else {
                        account1.recharge(moneyAdd);
                        System.out.println("thanh cong");
                    }
                    break;
                case 3:

                    int moneyRemove = scanner.nextInt();
                    if (moneyRemove <= 0 || moneyRemove > account1.getAccountBalance()) {
                        System.out.println("khong hop le");
                    } else {
                        account1.withDrawal(moneyRemove);
                        System.out.println("thanh cong");
                    }
                    break;
                case 4:
                    if (account1.getAccountBalance() <= 0) {
                        System.out.println("khong con no");
                    } else {
                        account1.expiredDate();
                        System.out.println("thanh cong");
                    }
                    break;
                case 5:
                    int moneyMoved = scanner.nextInt();
                    double tienChuyen = account1.getAccountBalance();
                    double tienNhan = account2.getAccountBalance();
                    if (tienChuyen <= moneyMoved) {
                        System.out.println("tien chuyen khong hop le");
                    } else {
                        tienChuyen = account1.getAccountBalance() - moneyMoved;
                        tienNhan = account2.getAccountBalance() + moneyMoved;
                        account1.setAccountBalance(tienChuyen);
                        account2.setAccountBalance(tienNhan);
                        System.out.println("thanh cong");
                    }
                    break;
                case 0:
                    break;

            }
        } while (choice != 0);


    }
}
