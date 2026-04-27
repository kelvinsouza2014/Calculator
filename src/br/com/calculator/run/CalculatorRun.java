package br.com.calculator.run;

import br.com.calculator.model.Calculator;

import java.util.Scanner;


public class CalculatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();
        calculator.setNum1(getNum1(sc));
        calculator.setOperator(getOperator(sc));
        calculator.setNum2(getNum2(sc));

    }

    public static double getNum1(Scanner sc) {
        System.out.print("Digite o primeiro valor: ");
        double tNum1 = sc.nextDouble();
        return tNum1;
    }

    public static String getOperator(Scanner sc) {
        System.out.print("Digite o operator: ");
        String tOperator = sc.next();
        return tOperator;
    }

    public static double getNum2(Scanner sc) {
        System.out.print("Digite o segundo número: ");
        double tNum2 = sc.nextDouble();
        return tNum2;
    }
}
