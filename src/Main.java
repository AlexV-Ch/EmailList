import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmailList emailList = new EmailList();

        while (true) {
            System.out.println("Введите адрес электронной почты ");
            String email = new Scanner(System.in).nextLine();
            emailList.listEmail(email);
        }
    }
}