package AboutVV;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        // Nhập thông tin nhân viên
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("Số lượng nhân viên: ");
        int soLuongNhanVien = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line còn lại sau khi nhập số lượng

        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Tên: ");
            String ten = scanner.nextLine();

            NhanVien nhanVien = new NhanVien(id, ten);
            danhSachNhanVien.add(nhanVien);
        }

        // Nhập thông tin quản lí
        ArrayList<QuanLi> danhSachQuanLi = new ArrayList<>();
        System.out.println("\nNhập thông tin quản lí:");
        System.out.print("Số lượng quản lí: ");
        int soLuongQuanLi = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuongQuanLi; i++) {
            System.out.println("Nhập thông tin cho quản lí thứ " + (i + 1));
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Tên: ");
            String ten = scanner.nextLine();
            System.out.print("Chức vụ: ");
            String chucVu = scanner.nextLine();
            System.out.print("Phòng ban: ");
            String phongBan = scanner.nextLine();

            QuanLi quanLi = new QuanLi(id, ten, chucVu, phongBan);
            danhSachQuanLi.add(quanLi);
        }

        // Xuất thông tin
        System.out.println("\nThông tin nhân viên:");
        for (NhanVien nhanVien : danhSachNhanVien) {
            nhanVien.xuatInfor();
        }

        System.out.println("\nThông tin quản lí:");
        for (QuanLi quanLi : danhSachQuanLi) {
            quanLi.xuatInfor();
        }
    }
}

