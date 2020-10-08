
public class JocDaus {
    Dau dado1;
    Dau dado2;
    Dau dado3;
    int a = 1;

    public JocDaus() {
        dado1 = new Dau();
        dado2 = new Dau();
        dado3 = new Dau();
    }

    public void jugar() {
        do {
            System.out.println("BIENVENIDO AL JUEGO DE LOS DADOS");
            System.out.println("EL PRIMER DADO A SALIDO " + dado1.getValor());

        } while (a != 0);

    }
}

