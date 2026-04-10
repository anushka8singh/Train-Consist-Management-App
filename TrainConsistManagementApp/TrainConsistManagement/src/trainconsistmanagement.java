import java.util.LinkedHashSet;

public class trainconsistmanagement {
    public static void main(String[] args) {
        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Sleeper");

        System.out.println("Train Formation Order:");
        System.out.println(formation);
    }
}
