package exerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        System.out.println("informe o peso dos peixes: ");
        double peso = sc.nextDouble();
        double excesso = peso - 50;
        double multa = excesso * 4.00;
        String temMulta = excesso > 0 ? "peso dos peixes: " + d.format(peso) + " e sua multa é de: r$ " + d.format(multa) : "Peso dos peixes: " + d.format(peso) + " e você está de acordo com o regulamento.";
        System.out.println(temMulta);
        sc.close();
       }
}

