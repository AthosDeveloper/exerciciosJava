package exerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RendimentoSimplificado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        System.out.println("informe o peso dos peixes:");
        double peso = sc.nextDouble();
        double excesso = peso - 50;
        double multa = excesso * 4.00;
        System.out.println("peso dos peixes: " + d.format(peso) + "peso excedido: " + d.format(excesso) + "multa: " + d.format(multa));
        sc.close();
    }
}
