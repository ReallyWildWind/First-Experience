package org.example;
import org.example.Menushka.Menu;
import org.example.Operation.Operations;
import java.util.Scanner;

public class Osnova {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Operations oper = new Operations();
        Menu menu = new Menu();

        String sist = menu.OpredelenieSistSchiclenia(); //ненужная штука по факту, просто чтобы сократить код сделал

        System.out.println("Введите число: ");
        String a = in.next(); //здесь хранится то, что пользователь ввел
        int FirstArg = (int) menu.ConvertorArgs(sist, a), result = 0;; //эта штука для компа, чтобы считать, тк он не умеют никак кроме десятичной. уже в цифрах нормальных

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
                            System.out.println(menu.ConvertorLast(sist, result)); //повторил
                        }
                    }
                    break;
                default:
                    System.out.println("ОШИБКА! Проверьте корректность вводимых данных и начните сначала");
                    break;
            }
            FirstArg = result;
            menu.Result(FirstArg);
        }
    }
}