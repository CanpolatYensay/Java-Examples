import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        double sayi1 = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();

        System.out.println("İşlem giriniz: ");
        char op= input.next().charAt(0);

        switch (op) {
            case '+' :
                System.out.println(sayi1 + sayi2);
                break;

                case '-' :
                System.out.println(sayi1 - sayi2);
                break;

                case '/' :
                System.out.println(sayi1 / sayi2);
                break;

                case '*' :
                System.out.println(sayi1 * sayi2);
                break;
        }


    }
}
