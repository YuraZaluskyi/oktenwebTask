/*
* Створити класс Контакт
  -id
  -name
  -company (Enum -> Intel, Microsoft, Apple)
  -surname
  -email
  -phone
  -department (Enum -> tech, support , factory)
  Створити DAO -прошарок з CRUD операціями, які будуть записувати
  контакти до БД (в данному випадку у LinkedList)
  -Створити 10 конатків (2 з яких будуть однаковими)
  -занести їх в базу.
  -знайти всі унікальні контакти
  -знайти всі унікальні контакти з певного департаменту.
  -знайти всі унікальні контакти з певної компанії
  посортувавши їх по імейлу .

  -знайти всі унікальні контакти згрупувавши їх по компанії !!!!
* */

import java.io.File;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        ContactsDaoImpl contactsDaoImpl = new ContactsDaoImpl();
        contactsDaoImpl.addContact(new Contact(45, "qqq", "www", "rrr@qwe", "4481264"
                , TypeCompany.APPLE, TypeDepartment.TECH));

        System.out.println("print all contacts");
        contactsDaoImpl.printContact();
        System.out.println("");
        System.out.println("sort contacts by id");
        contactsDaoImpl.sortContacts();
        System.out.println("");
        System.out.println("print all unique contacts");
        contactsDaoImpl.findAllUniqueContact();
        System.out.println("");
        System.out.println("print unique contacts from a specific department");
        contactsDaoImpl.findAllByDepartment(TypeDepartment.TECH);
        System.out.println("");
        System.out.println("print unique contacts from a specific company");
        contactsDaoImpl.findAllByCompany(TypeCompany.INTEL);
        System.out.println("");
        System.out.println("sort contacts by email");
        contactsDaoImpl.sortByEmail();
        System.out.println("");
        System.out.println("print unique contacts from a specific company");
        contactsDaoImpl.findUniqueContactsCompany(TypeCompany.INTEL);

    }
}
