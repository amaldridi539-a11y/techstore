package techstore;

public class TestTypePersonne {
    public static void main(String[] args) {
        TypePersonne type = TypePersonne.ADULTE;
        System.out.println(type);

        for (TypePersonne t : TypePersonne.values()) {
            System.out.println(t);
        }
    }
}
