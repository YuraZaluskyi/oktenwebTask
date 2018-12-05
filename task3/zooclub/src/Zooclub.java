import java.util.TreeMap;

public class Zooclub {

    private TreeMap<User, ListPet> petClub = new TreeMap<>();

    public Zooclub() {
    }

    public Zooclub(TreeMap<User, ListPet> petClub) {
        this.petClub = petClub;
    }

    public TreeMap<User, ListPet> getPetClub() {
        return petClub;
    }

    public void setPetClub(TreeMap<User, ListPet> petClub) {
        this.petClub = petClub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zooclub)) return false;

        Zooclub zooclub = (Zooclub) o;

        return getPetClub() != null ? getPetClub().equals(zooclub.getPetClub()) : zooclub.getPetClub() == null;
    }

    @Override
    public int hashCode() {
        return getPetClub() != null ? getPetClub().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Zooclub{" +
                "petClub=" + petClub +
                '}';
    }
}
