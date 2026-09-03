import java.util.Scanner;

public class KalkulatorStruktural {

    public static void main(String[] args) {
        //deklarasi variabel
        Scanner input = new Scanner(System.in);
        double angka1;
        double angka2;
        double hasil;
        char operator;

        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        // Proses perhitungan
        switch (operator) {

            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil = " + hasil);
                break;

            default:
                System.out.println("Operator tidak valid.");
        }

        input.close();
    }
}