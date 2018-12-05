import java.util.LinkedList;

public class ListPet {
    private LinkedList<Pet> listPet = new LinkedList<>();

    public ListPet() {
    }

    public ListPet(LinkedList<Pet> listPet) {
        this.listPet = listPet;
    }

    public LinkedList<Pet> getListPet() {
        return listPet;
    }

    public void setListPet(LinkedList<Pet> listPet) {
        this.listPet = listPet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListPet)) return false;

        ListPet listPet1 = (ListPet) o;

        return getListPet() != null ? getListPet().equals(listPet1.getListPet()) : listPet1.getListPet() == null;
    }

    @Override
    public int hashCode() {
        return getListPet() != null ? getListPet().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ListPet{" +
                "listPet=" + listPet +
                '}';
    }
}
