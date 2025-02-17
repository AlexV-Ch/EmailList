import java.util.TreeSet;

public class EmailList {
    TreeSet<String> email = new TreeSet<>();

public void listEmail(String textEmail) {
    String[] words =textEmail.split("\\s+");
    String kom =words[0];
    String regex = "[0-9a-zA-Z]+" + "[@]" + "[a-zA-Z]+" +"\\."+ "[a-zA-Z]{2,3}";

    if (!kom.equals("ADD") && !kom.equals("LIST")) {
        System.out.println("Нет такой команды");
        return;
    }
    if (kom.equals("LIST")) {
        System.out.println("Список адресов электронной почты");
        printList(email);
        return;
    }
    if (words.length <= 1) {
        System.out.println("Вы не ввели адрес электронной почты");
        return;
    }
    if (kom.equals("ADD")) {
        if (words[1].matches(regex)) {
            email.add(words[1]);
            System.out.println("Добавлен адрес " + words[1]);
        } else {
            System.out.println("Адрес не соответствует шаблону");
        }
    }

}
private void printList(TreeSet<String> email) {
    for (String eml : email) {
        System.out.println(eml);
    }
}

}
