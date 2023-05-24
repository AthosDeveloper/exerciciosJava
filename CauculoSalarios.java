package exerciciosJava;

import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;

public class CauculoSalarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();

        System.out.println("Informe o valor de seu salário atual: ");
        double salarioAtual = sc.nextDouble();
         double salarioMinimo = salarioAtual / 1.212;
        System.out.println("salário atual: " + salarioAtual + "Quantidade de salários: " + d.format(salarioMinimo));
    }
}
