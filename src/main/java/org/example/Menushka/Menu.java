package org.example.Menushka;
import java.util.Scanner;
public class Menu {
    private String HEX(int arg1) {
        String hex = Integer.toHexString(arg1);
        return hex.toUpperCase();
    }

    private String OCT(int arg1) {
        return Integer.toOctalString(arg1);
    }

    private String BIN(int arg1) {
        return Integer.toBinaryString(arg1);
    }
    public String Result(int arg1) { //тупо выводит результат
        System.out.printf("HEX:" + HEX(arg1) + "  " + "DEC:" + arg1 + "  " + "OCT:" + OCT(arg1) + "  " + "BIN:" + BIN(arg1) + "\n");
        System.out.println();
        return null;
    }
    public String OpredelenieSistSchiclenia() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите систему счисления");
        System.out.println("HEX   DEC   OCT   BIN");
        return in.next();
    }
    public String ChosenOperation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите операцию: '+', '-', '*', '/', '+/-', 'C', 'СТОП'");
        return in.next();
    }
    public Integer ConvertorArgs(String sistema, String arg1) { //ну по идее должно конверитироваться в какую-либо систему. работает или нет - хз
        switch (sistema) {
            case "HEX" -> {
                return Integer.parseInt(arg1, 16);
            }
            case "OCT" -> {
                return Integer.parseInt(arg1, 8);
            }
            case "BIN" -> {
                return Integer.parseInt(arg1, 2);
            }
            case "DEC" -> {
                return Integer.parseInt(arg1, 10);
            }
        }
        return 0;
    }
    public String ConvertorLast(String sistema, int arg1) { //превращает результат вычисления в ту систему которая задана, по идее
        switch (sistema) {
            case "HEX" -> {
                return Integer.toHexString(arg1);
            }
            case "OCT" -> {
                return Integer.toOctalString(arg1);
            }
            case "BIN" -> {
                return Integer.toBinaryString(arg1);
            }
            case "DEC" -> {
                return String.valueOf(arg1);
            }
        }
        return sistema;
    }
}
