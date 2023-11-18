package org.example;
import org.example.Menushka.Menu;
import org.example.Operation.Operations;
import java.util.Scanner;

public class Osnova {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Operations oper = new Operations();
        Menu menu = new Menu();

        String sist = menu.OpredelenieSistSchiclenia();

        System.out.println("Введите число: ");
        String a = in.next();
        int FirstArg = (int) menu.ConvertorArgs(sist, a), result = 0;

        label:
        while (true) { //начало цикла
            String operation = menu.ChosenOperation();
            switch (operation) {
                case "Стоп":
                    break label;
                case "C":
                    System.out.println(0);
                    result = 0;
                    break;
                case "+/-":
                    result = oper.PM(FirstArg);

                    System.out.println(menu.ConvertorLast(sist, result));
                    System.out.println(menu.Result(result));
                    break;
                case "+":
                case "-":
                case "/":
                case "*":
                case "%":
                    System.out.println("Введите ещё одно число: ");
                    String b = in.next();
                    int SecondArg = (int) menu.ConvertorArgs(sist, b);
                    switch (operation) {
                        case "+" -> {
                            result = oper.Plus(FirstArg, SecondArg);
                            System.out.println(menu.ConvertorLast(sist, result));
                        }
                        case "-" -> {
                            result = oper.Minus(FirstArg, SecondArg);
                            System.out.println(menu.ConvertorLast(sist, result));
                        }
                        case "/" -> {
                            result = oper.Div(FirstArg, SecondArg);
                            System.out.println(menu.ConvertorLast(sist, result));
                        }
                        case "%" -> {
                            result = oper.ProgDiv(FirstArg, SecondArg);
                            System.out.println(menu.ConvertorLast(sist, result));
                        }
                        default -> {
                            result = oper.Mult(FirstArg, SecondArg);
                            System.out.println(menu.ConvertorLast(sist, result));
                        }
                    }
                    break;
                default:
                    System.out.println("ОШИБКА! Проверьте корректность вводимых данных");
                    break;
            }
            FirstArg = result;
            menu.Result(FirstArg);
        }
    }
}
