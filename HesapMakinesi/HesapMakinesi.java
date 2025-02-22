package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
        public static void main(String[] args) {
            
            Scanner input= new Scanner(System.in);
		
            System.out.println("Birinci Sayı: ");
            double sayi1 = input.nextDouble();
            System.out.println("İkinci Sayı: ");
            double sayi2= input.nextDouble();
            
            System.out.println("Bir işlem seçin: ");
            char operator = input.next().charAt(0);
            double sonuc=0;
            
            switch (operator) {
            case '+': 
                sonuc=sayi1+sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '*':
                sonuc=sayi1*sayi2;
                break;
            case '/':
                sonuc=sayi1/sayi2;
                break;
            case '%':
                sonuc=sayi1%sayi2;
                break;
            default:
                System.out.println("Hatalı işlem seçimi");
            }
            
            System.out.println("Sonuç: "+sonuc);
    }
}
