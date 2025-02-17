import java.util.TreeSet;

public class EmailList {
    TreeSet<String> email = new TreeSet<>();

public void listEmail(String textEmail) {
    String[] words =textEmail.split("\\s+");
    String kom =words[0];
    //String regex = "[0-9a-zA-Z]+" + "[@]" + "[a-zA-Z]+" +"\\."+ "[a-zA-Z]{2,3}";

    if (words.length <= 1 && !kom.equals("LIST")) {
        System.out.println("Вы не ввели адрес электронной почты");
        return;
    }
    switch (kom) {
        case "ADD" -> emailAdd(words[1]);
        case "LIST" -> printList(email);
        default -> System.out.println("Нет такой команды");
    }

//    if (!kom.equals("ADD") && !kom.equals("LIST")) {
//        System.out.println("Нет такой команды");
//        return;
//    }
//    if (kom.equals("LIST")) {
//        printList(email);
//        return;
//    }
//
//    if (kom.equals("ADD")) {
//        emailAdd(words[1]);
//        if (isValidEmail(words[1])) {
//            email.add(words[1]);
//            System.out.println("Добавлен адрес " + words[1]);
//        } else {
//            System.out.println("Адрес не соответствует шаблону");
//        }
//    }

}
private void printList(TreeSet<String> email) {
    if (!email.isEmpty()) {
        System.out.println("Список адресов электронной почты");
    for (String eml : email) {
        System.out.println(eml);
    }
    }else {
        System.out.println("Список адресов пуст");
    }
}
    private boolean isValidEmail(String email) {
        // Регулярное выражение для проверки email
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    private void emailAdd (String words1 ) {
         if (isValidEmail(words1)) {
            email.add(words1);
            System.out.println("Добавлен адрес " + words1);
        } else {
            System.out.println("Адрес не соответствует шаблону");
        }
    }


}
