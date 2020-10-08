
public class Dau {
    private int Valor;

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    @Override
    public String toString() {
        return "Dau{" + "Valor=" + Valor + '}';
    }
    public int tirar (){
        int tirar = (int) (Math.random() * 6 + 1);
        return tirar;
    }
}