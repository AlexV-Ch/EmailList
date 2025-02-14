import java.util.SortedMap;
import java.util.TreeSet;

public class EmailList {
    TreeSet<String> email = new TreeSet<>();

public void listEmail(String textEmail) {
    String[] words =textEmail.split("\\s+");
    String kom =words[0];
    String regex = "[0-9a-zA-Z]+" + "[@]" + "[a-zA-Z]{2,3}";

    if (!kom.equals("ADD") && !kom.equals("LIST")) {
        System.out.println("Нет такой команды");
        return;
    }
    if (kom.equals("LIST")) {
        System.out.println("Список адресов электронной почты");
        return;
    }
    if (words.length <= 1) {
        System.out.println("Вы не ввели адрес электронной почты");
        return;
    }
    if (kom.equals("ADD")) {
        System.out.println("Блок проверки адреса и добавления в список TreeSet");

        if (words[1].matches(regex)) {
            System.out.println("Адрес соответствует шаблону");
        } else {
            System.out.println("Адрес не соответствует шаблону");
        }

        return;
    }

}
}
