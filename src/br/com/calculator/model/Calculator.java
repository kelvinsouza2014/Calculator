package br.com.calculator.model;

public class Calculator {
    private double num1;
    private String operator;
    private double num2;
    private double result;

    public Calculator(){

    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double calculate(double num1, String operator, double num2){
        switch (operator){
            case "+": return result = num1 + num2;
            case "-": return result = num1 - num2;
            case "*": return result = num1 * num2;
            case "/":
                if (num2 == 0) throw new ArithmeticException("Divisão por zero");
                return result = num1 / num2;
            default:
                throw new IllegalArgumentException("Operador inválido\n");
        }
    }

    @Override
    public String toString() {
        return num1 + " " + operator + " " + num2 + " = " + result;
    }
}
