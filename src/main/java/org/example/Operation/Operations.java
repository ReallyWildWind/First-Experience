package org.example.Operation;
import org.example.Menushka.Menu;

public class Operations {
    Menu menu = new Menu();
    public int Plus(int arg1, int arg2) {
        return arg1 + arg2;
    }
    public int Minus(int arg1, int arg2) {
        return arg1 - arg2;
    }
    public int Div(int arg1, int arg2) {
        return arg1 / arg2;
    }
    public int Mult(int arg1, int arg2) {
        return arg1 * arg2;
    }
    public int PM(int arg1) {
        return -arg1;
    }
    public int ProgDiv(int arg1, int arg2) {
        return arg1 % arg2;
    }

}
