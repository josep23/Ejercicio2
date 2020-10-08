

import jdk.swing.interop.SwingInterOpUtils;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dau dau = new Dau();
        JocDaus joc = new JocDaus();
        int ganadas;
        int jugadas;
        int a = 1;


        while (a != 0) {
            System.out.println("------------------");
            System.out.println("     1-OCA        ");
            System.out.println("     2-Dados      ");
            System.out.println("     3-Tic Tac TOE");
            System.out.println("     4-EXIT       ");
            System.out.println("------------------");
            int respuesta = scanner.nextInt();

        switch (respuesta){
            case 1:
            System.out.println("Estas jugando a la Oca");
                ;
            case 2:
            while (a !=0){


            }

            case 3:
            System.out.println("Ests Jugando Tic Tac Toe");

            case 4:
            break;
        }
        }
    }


}


