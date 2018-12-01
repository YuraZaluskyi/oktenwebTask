
import java.util.LinkedList;


public class ListUsers {
    private LinkedList<User> listUsers = new LinkedList<>();

    public ListUsers(LinkedList<User> listUsers) {
        this.listUsers = listUsers;
    }

    public ListUsers() {
    }

    public LinkedList<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(LinkedList<User> listUsers) {
        this.listUsers = listUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListUsers)) return false;

        ListUsers listUsers1 = (ListUsers) o;

        return getListUsers() != null ? getListUsers().equals(listUsers1.getListUsers()) : listUsers1.getListUsers() == null;
    }

    @Override
    public int hashCode() {
        return getListUsers() != null ? getListUsers().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ListUsers{" +
                "listUsers=" + listUsers +
                '}';
    }
}
