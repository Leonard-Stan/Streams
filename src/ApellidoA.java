import java.util.ArrayList;

public class ApellidoA
{
    public static void main(String[] args)
    {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "Aljibe", 1968);

        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Atún", 1968);
        personas.add(persona);

        long cuantos = personas.stream().filter(person -> person.getLastName().startsWith("A")).count();
        System.out.println(cuantos);
    }
}
