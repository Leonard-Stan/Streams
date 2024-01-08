import java.util.ArrayList;

public class SumaPositivosNegativos2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(-10);
        numeros.add(-2);
        numeros.add(5);
        numeros.add(8);


        long positivos =  numeros.stream().filter(SumaPositivosNegativos2::positivos).count();
        System.out.println(positivos);
        long negativos = numeros.stream().filter(SumaPositivosNegativos2::negativo).count();
        System.out.println(negativos);
    }

    public static boolean positivos(int numero)
    {
        return(numero>0);
    }
    public static boolean negativo(int numero)
    {
        return(numero<0);
    }

}
