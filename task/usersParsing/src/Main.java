
/*
* 1 Дістати з файлу usersForParsing.txt всіх користувачів
2 Зробити все необхідно, щоб :
 - відсортувати користувачів за id
 - відсортувати користувачів за імейлом
 - відфільтрувати користувачів , залишивши тільки тих хто має гугловський аккаунт.
3. Зробити ці всі дії
ФАЙЛ НЕ ЗМІНЮВАТИ!
* */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String currentWorkDir = System.getProperty("user.dir");
        System.out.println(currentWorkDir);
        File file = new File(currentWorkDir + File.separator + "usersForParsing.txt");

//        if(!file.exists()){
//            file.createNewFile();
//        }
//
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        String text = "10 ivan maximov qwerty123456 maximovi@gmail.com true;123 rostyk samiv asdqweqewads " +
//                "barada@mail.ru false;" +
//                "1 ira polis lolipopazaza neork@mail.ru true;90 andii boroda idivjopu " +
//                "barada@gmail.com false;3 oleksiy" +
//                " andirov password login@gmail.com false;";
//        fileOutputStream.write(text.getBytes());
//        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);

        ListUsers listUsers = new ListUsers();

        int available = fileInputStream.available();
        byte[] collector = new byte[available];
        fileInputStream.read(collector);
        String result = new String(collector);
        fileInputStream.close();
        String[] arrUsers = result.split(";");

        for (String arrUser : arrUsers) {
            User user;
            String[] dataUser = arrUser.split(" ");
            int idUser = Integer.parseInt(dataUser[0]);
            boolean statusUser = Boolean.parseBoolean(dataUser[5]);
            user = new User(idUser, dataUser[1], dataUser[2], dataUser[3], dataUser[4], statusUser);
            listUsers.getListUsers().add(user);
            System.out.println(user);
            System.out.println(dataUser[0]);
            for (String s : dataUser) {
                System.out.println(s);
            }
            System.out.println("");
//            int idUser = Integer.parseInt(dataUser[0]);
//            boolean statusUser = Boolean.parseBoolean(dataUser[5]);
//            User user = new User(dataUser[0], dataUser[1], dataUser[2], dataUser[3], dataUser[4], dataUser[5]);
//            listUsers.getListUsers().add(user);
        }

        System.out.println("");
//        System.out.println(result);
        System.out.println(listUsers.getListUsers());
        System.out.println("");
        listUsers.getListUsers()
                .stream()
                .sorted((o1,o2) -> (o1.getId() - o2.getId()))
                .forEach(user -> System.out.println(user));

        System.out.println("");

        listUsers.getListUsers()
                .stream()
                .sorted((o1,o2)->o1.getEmail().compareTo(o2.getEmail()))
                .forEach(user -> System.out.println(user));

        System.out.println("");

        listUsers.getListUsers()
                .stream()
                .filter(user -> user.getEmail().endsWith("gmail.com"))
                .forEach(user -> System.out.println(user));

    }
}
