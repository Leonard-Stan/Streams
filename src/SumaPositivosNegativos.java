import java.util.ArrayList;


public class SumaPositivosNegativos
{

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(-10);
        numeros.add(-2);
        numeros.add(5);
        numeros.add(8);

        long pos = numeros.stream()
                .filter(numero -> numero >0)
                .count();
        long negativos = numeros.stream().filter(numero -> numero <0).count();

        System.out.println("Hay "+pos+" positivos y "+negativos+" negativos");

    }


}
