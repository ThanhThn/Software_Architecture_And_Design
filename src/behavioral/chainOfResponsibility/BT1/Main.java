package behavioral.chainOfResponsibility.BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM k500 = new MenhGiaATM(500);
        ATM k100 = new MenhGiaATM(100);
        ATM k50 = new MenhGiaATM(50);
        ATM k10 = new MenhGiaATM(10);
        ATM k1 = new MenhGiaATM(1);
        k500.menhGiaThapHon(k100).menhGiaThapHon(k50).menhGiaThapHon(k10).menhGiaThapHon(k1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mệnh giá lớn nhất muốn rút: ");
        int menhgia = scanner.nextInt();
        ChuoiMenhGiaVND vnd =  new ChuoiMenhGiaVND();
        vnd.rutTien(293, menhgia);

    }
}
