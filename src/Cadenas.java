import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cadenas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cadena = new ArrayList<>();
        String introducido;
        do {
            introducido = sc.nextLine();
            if(!Objects.equals(introducido, " "))
            {
                cadena.add(introducido);
            }

        }while (!Objects.equals(introducido, ""));
        cadena.stream().sorted().forEach(System.out::println);
    }


}
