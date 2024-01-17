import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepartirRegalos
{
    public static void main(String[] args) {
        int casos;
        List<ListaDeseos> lista = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("introduce numero de casos: ");
            casos = sc.nextInt();
            for (int i = 0; i < casos ; i++)
            {
                lista.add(new ListaDeseos(sc.nextInt(), sc.nextInt()));
            }


        } while (casos > 0);

        lista.stream().sorted().forEach(System.out::println);

    }
}
