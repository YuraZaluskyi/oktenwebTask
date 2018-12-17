import models.Email;
import models.Phone;
import models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
* Телефонна книга
  Запис
    ім'я
    прізвище
    Телефон[]
      код
      номер
    Пошта[]
      домен
      назва
Створити 10 користувачів. записати їх в базу.
Створити методи які
-findAll();
-findOne(id);
-findByName(name);
-updateNameWhereId(id,newName);
-delete(id);

* */
public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Email.class)
                .addAnnotatedClass(Phone.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session manager = sessionFactory.openSession();
        manager.beginTransaction();


        manager.getTransaction().commit();
        manager.close();
        sessionFactory.close();












    }
}
