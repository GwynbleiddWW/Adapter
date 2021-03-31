package ru.netology;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Калькулятор:\n" +
                calc.newFormula()
                        .addOperand(45.5)
                        .addOperand(3.9)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );

        Ints intsCalculator = new IntsCalculator();
        System.out.println("Калькулятор для работы с целыми числами от -2147483648 до 2147483647:");
        System.out.println(intsCalculator.sum(2, 12));
        System.out.println(intsCalculator.multi(35, 198));
        System.out.println(intsCalculator.pow(2, 10));
    }
}
