package exerciciosJava;

import java.util.Scanner;

public class CauculaDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a quantidade de anos: ");
        int anos = sc.nextInt();
        System.out.println("agora, informe os meses:");
        int meses = sc.nextInt();
        System.out.println("agora, a quantidade de dias:");
        int dias = sc.nextInt();
        int cauculaMes = meses * 30;
        int cauculaano = anos * 365;

        int resultado = cauculaano + cauculaMes + dias;
        System.out.println("a quantidade de dias é: " + resultado);
    }
}
