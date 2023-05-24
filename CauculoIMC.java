package exerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CauculoIMC {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat();
        Scanner sc = new Scanner(System.in);
        System.out.println("informe seu peso:");
        double peso = sc.nextDouble();
        System.out.println("agora, me informe sua altura:");
        double altura = sc.nextDouble();
double imc = peso / (altura * altura);
        System.out.println("o cáuculo do seu IMC é de: " + d.format(imc));
   sc.close();
    }
}
