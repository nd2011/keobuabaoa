package git;
import java.util.Random;
import java.util.Scanner;

public class keobuabao {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(3);
        
        String[] choices = {"la", "keo", "bua"};
        String computer = choices[random];
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap keo/ bua/bao: ");
        String userInput = scanner.nextLine().toLowerCase(); // Chuyển đổi lựa chọn của người chơi thành chữ thường
        System.out.println("Ban da nhap: " + userInput);
        System.out.println("May da nhap: " + computer);
        
        if (!userInput.equals("la") && !userInput.equals("keo") && !userInput.equals("bua")) {
            System.out.println("Lua chon khong hop le!");
        } else if (userInput.equals(computer)) {
            System.out.println("Hoa");
        } else if ((userInput.equals("la") && computer.equals("bua")) ||
                   (userInput.equals("keo") && computer.equals("la")) ||
                   (userInput.equals("bua") && computer.equals("keo"))) {
            System.out.println("Ban thang");
        } else {
            System.out.println("Ban thua");
        }
        
        scanner.close();
    }
}
