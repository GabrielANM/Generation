import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Laranja");
        frutas.add(0, "Morango");

        for(String fruta : frutas) {
            System.out.println(fruta);
        }
    }

}