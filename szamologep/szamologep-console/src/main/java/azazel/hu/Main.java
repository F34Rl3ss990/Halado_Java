package azazel.hu;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Calculator calculator = new Calculator();
        String[] possibilities = new String[]{"+", "-", "*", "/"};
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        String operator="";
        boolean run = true;

        while(run) {
            System.out.println("Add meg, hogy milyen műveletet szeretnél elvégezni (+, -, /, *): ");
            operator = scanner.next();
            for (int i = 0; i < possibilities.length; i++) {
                if (possibilities[i].equals(operator)){
                    run=false;
                }
            }
            if(run==true)
                System.out.println("Rossz operátort adtál meg!");
        }

        System.out.println("Add meg az első számot: ");
        a = scanner.nextDouble();
        System.out.println("Add meg a második számot: ");
        b= scanner.nextDouble();
        scanner.close();
        System.out.println(String.format("Eredmény: %.3f", calculator.szamol(a, b, operator)));


    }

}
