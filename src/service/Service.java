package service;

import java.util.Scanner;

public class Service {
    private double conversionDollar = 5.58;
    private double conversionEuro = 6.52;
    private double conversionLibra = 7.53;
    private int valueInput;
    private int option;
    public double conversion = 0;



    public void imprime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1-Dollar -> Real\n 2-Real -> Dollar\n 3-Euro -> Real\n 4-Real -> Euro\n 5-Libra -> Real\n 6-Real -> Libra");
        System.out.print("Information from 1 to 6 to make the conversion: ");
        int option = scanner.nextInt();
        if (option >= 7){
            System.out.println("The value is invalid. Exiting the program...");
            return;
        }
        System.out.print("Enter the value to convert: ");
        int valueInput = scanner.nextInt();

        if (option == 1) {
            conversion = valueInput * conversionDollar;
            System.out.printf("The converted value R$%.2f", conversion);
        } else if (option == 2) {
            conversion = valueInput / conversionDollar;
            System.out.printf("The converted value U$%.2f", conversion);
        } else if (option == 3) {
            conversion = valueInput * conversionEuro;
            System.out.printf("The converted value R$%.2f", conversion);
        } else if (option == 4) {
            conversion = valueInput / conversionEuro;
            System.out.printf("The converted value €$%.2f", conversion);
        } else if (option == 5) {
            conversion = valueInput * conversionLibra;
            System.out.printf("The converted value R$%.2f", conversion);
        } else if (option == 6) {
            conversion = valueInput / conversionLibra;
            System.out.printf("The converted value £$%.2f", conversion);
        }


    }
    public double getConversionDollar() {
        return conversionDollar;
    }

    public void setConversionDollar(double conversionDollar) {
        this.conversionDollar = conversionDollar;
    }

    public double getConversionEuro() {
        return conversionEuro;
    }

    public void setConversionEuro(double conversionEuro) {
        this.conversionEuro = this.conversionEuro;
    }

    public double getConversionLibra() {
        return conversionLibra;
    }

    public void setConversionLibra(double conversionLibra) {
        this.conversionLibra = conversionLibra;
    }

    public int getValueInput() {
        return valueInput;
    }

    public void setValueInput(int valueInput) {
        this.valueInput = valueInput;
    }
}
