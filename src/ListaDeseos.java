import java.util.List;

public class ListaDeseos implements Comparable<ListaDeseos>
{
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int score;
    public int peso;

 public ListaDeseos(int score, int peso)
 {
     this.score = score;
     this.peso = peso;
 }
    @Override
    public int compareTo(ListaDeseos otro)
    {
        if (this.score == otro.getScore())
        {
            return this.getPeso() - otro.getPeso();
        }
        return otro.getScore() - this.score;
    }

    public String toString()
    {
        return score +" --- "+peso;
    }
}
