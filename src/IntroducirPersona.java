
import java.awt.*;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class IntroducirPersona
{
    public static void main(String[] args)
    {
        String answer = null;
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personas = new ArrayList<>();
        String nombre;
        String apellido;
        int year;

        do {
            System.out.println("¿Desea agregar una persona? y/n: ");
            if (Objects.equals(answer, null))
            {
                answer = sc.nextLine();


            }

            if (Objects.equals(answer, "y"))
            {

                System.out.println("Introduce un nombre: ");
                nombre = sc.nextLine();
                System.out.println("Introduce un apellido: ");
                apellido = sc.nextLine();
                System.out.println("Introduce un año de nacimiento: ");
                year = sc.nextInt();
                sc.nextLine();

                Person persona = new Person(nombre,apellido, year);
                personas.add(persona);
                answer=null;
            }

        }while(!Objects.equals(answer, "n"));

        personas.stream().map(Person::getLastName).sorted().forEach(System.out::println);

    }
}
