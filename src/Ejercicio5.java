import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cadena = new ArrayList<>();
        int introducido;
        do {
            introducido = sc.nextInt();
            if (introducido>0)
            {

                cadena.add(introducido);
            }
        }while (introducido>0);
        cadena.stream().filter(numero-> numero>=1 && numero<=5).sorted().forEach(System.out::println);
    }
}
