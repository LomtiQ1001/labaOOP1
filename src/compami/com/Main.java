package compami.com;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        int Var = 0;

        while(Var == 0) {
            System.out.println("Для самостоятельного ввода элементов массивва введите 1, для рандомного ввода элементов массива введите 2 ");
            Scanner scanner = new Scanner(System.in);
            Var = scanner.nextInt();
        }

        System.out.println("Введите количество элементов массива ");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();

        byte [] Mas = new byte[n];

        inMas(Mas, n, Var);
        outMas(Mas);
        outR(Mas, n);
    }

    private static void inMas(byte [] Mas, int n, int Var) {
        switch (Var) {
            case 1:
                System.out.println("Введите элементы массива");
                for (int i = 0; i < n; i++) {
                    Scanner scanner2 = new Scanner(System.in);
                    Mas[i] = scanner2.nextByte();
                }
            break;
            case 2:
                new Random().nextBytes(Mas);
                System.out.println("Элементам массива присвоены рандомные значения");
            break;
            default:
                break;
        }
    }


    private static void outMas(byte [] Mas){
        System.out.println("Вывод массива слева направо: ");
        for(byte element : Mas) {
            System.out.println(element);
        }
    }


    private static void  outR(byte [] Mas, int n){
        System.out.println("Вывод массива справо налево: ");
        for (int i = n - 1; i >= 0; i--){
            System.out.println(Mas[i]);
        }
    }

}
