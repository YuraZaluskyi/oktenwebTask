import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class ContactsDaoImpl implements ContactsDao {

    List<Contact> listContacts;
//    Stream<Contact> contactsStream;


    public ContactsDaoImpl() {

        listContacts = new LinkedList<>();
//        contactsStream = listContacts.stream();

        Contact contact1 = new Contact(1, "asd", "dsa", "as@asd", "1234567"
                , TypeCompany.INTEL, TypeDepartment.TECH);

        Contact contact2 = new Contact(2, "dfg", "gfd", "kj@dfg", "1234567"
                , TypeCompany.APPLE, TypeDepartment.FACTORY);

        Contact contact3 = new Contact(3, "xvc", "vcx", "fe@gfd", "1234567"
                , TypeCompany.MICROSOFT, TypeDepartment.SUPPORT);

        Contact contact4 = new Contact(4, "ghj", "jhg", "gh@wer", "1234567"
                , TypeCompany.INTEL, TypeDepartment.FACTORY);

        Contact contact5 = new Contact(5, "yui", "iuy", "dg@tyu", "1234567"
                , TypeCompany.INTEL, TypeDepartment.TECH);

        Contact contact6 = new Contact(6, "tre", "ert", "dw@vds", "1234567"
                , TypeCompany.MICROSOFT, TypeDepartment.FACTORY);

        Contact contact7 = new Contact(7, "mhf", "rer", "th@fad", "1234567"
                , TypeCompany.INTEL, TypeDepartment.TECH);

        Contact contact8 = new Contact(8, "esh", "seh", "er@gdf", "1234567"
                , TypeCompany.INTEL, TypeDepartment.FACTORY);

        Contact contact9 = new Contact(9, "ghi", "qwe", "df@wfe", "1234567"
                , TypeCompany.APPLE, TypeDepartment.TECH);

        Contact contact10 = new Contact(1, "asd", "dsa", "as@asb", "1234567"
                , TypeCompany.INTEL, TypeDepartment.SUPPORT);
        Contact contact11 = new Contact(777, "asd", "dsa", "as@asm", "1234567"
                , TypeCompany.INTEL, TypeDepartment.SUPPORT);
        Contact contact12 = new Contact(777, "asd", "dsa", "as@asm", "1234567"
                , TypeCompany.INTEL, TypeDepartment.SUPPORT);

        listContacts.add(contact9);
        listContacts.add(contact4);
        listContacts.add(contact1);
        listContacts.add(contact8);
        listContacts.add(contact2);
        listContacts.add(contact10);
        listContacts.add(contact3);
        listContacts.add(contact7);
        listContacts.add(contact5);
        listContacts.add(contact6);
        listContacts.add(contact11);
        listContacts.add(contact12);


    }

    @Override
    public void addContact(Contact contact) {
        listContacts.add(contact);

    }

    @Override
    public void printContact() {
        listContacts.forEach(contact -> System.out.println(contact));

    }

    @Override
    public void updateContact(Contact contact) {

    }

    @Override
    public void deleteContact(Contact contact) {


    }

    public void sortContacts() {
         listContacts
                .stream()
                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .forEach(contact -> System.out.println(contact));


    }

    public void findAllUniqueContact() {
        listContacts
                .stream()
                .distinct()
                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .forEach(contact -> System.out.println(contact));


    }

    public void findAllByDepartment(TypeDepartment department) {
        listContacts
                .stream()
                .distinct()
                .filter(contact -> contact.getTypeDepartment().equals(department))
                .forEach(contact -> System.out.println(contact));
    }

    public void findAllByCompany(TypeCompany company) {
        listContacts
                .stream()
                .distinct()
                .filter(contact -> contact.getTypeCompany().equals(company))
                .forEach(contact -> System.out.println(contact));
    }

    public void sortByEmail() {
        listContacts
                .stream()
                .distinct()
                .sorted((o1, o2) -> o1.getEmail().compareTo(o2.getEmail()))
                .forEach(contact -> System.out.println(contact));
    }

    public void findUniqueContactsCompany(TypeCompany company){
        listContacts
                .stream()
                .filter(contact -> contact.getTypeCompany().equals(company))
                .distinct()
                .forEach(contact -> System.out.println(contact));
    }

}
