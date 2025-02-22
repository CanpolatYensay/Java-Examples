import java.util.Scanner;

public class RaseleSoruOlusturma {
    public static void main(String[] args) {
        
			Scanner input = new Scanner(System.in);
		
		
		int n=5;
		String [] sorular = new String[5];
		
		sorular[0]="Verilerinden hangisi tam sayı tipidir"; 
		sorular[1]="Verilerinden hangisi ondalıklı sayı saklamak için kullanılır ";
		sorular[2]="Verilen veri tiplerinden hangisi true/false değeri saklayabilir ";
		sorular[3]="Verilen veri tiplerinde hangisi karakter saklayabilir ";
		sorular[4]="Verilenlerden hangisi bir döngü komutu değildir ";
		
		String[][]secenekler= { {"int", "double","char","String"},
				 				{"int", "double","char","String"},
				 				{"int", "double","boolean","String"},
				 				{"int", "double","char","String"},
				 				{"for", "do","do-while","switch"}  
				 			  };
		
		String[][]cevapAnahtarı= { {"int"}, 
								   {"double"}, 
								   {"boolean"}, 
								   {"char"}, 
								   {"switch"} };
		
		//Rasgele soru sor
		
		boolean[]soruKontrol=new boolean[n];
		int sayac=0;
		int dogruSayac=0;
		int yanlısSayac=0;
		
		do {
			int soruNo=(int)(Math.random()*5);
			if (!(soruKontrol[soruNo])) {
				soruKontrol[soruNo]=true;
				System.out.println((soruNo+1)+". Soru: "+sorular[soruNo]);
				sayac++;
				
				
				for(int i=0; i<secenekler[soruNo].length; i++) {
					System.out.println((char)(65+i)+") "+ secenekler[soruNo][i]+"\t");
				}
					
					System.out.println("\n");
					System.out.println("Cevabınız:");
			
					String cevap = input.nextLine();
			
					if (cevap.equals(cevapAnahtarı[soruNo][0])) {
						System.err.println("Doğru...");
						dogruSayac++;
					}else {
						System.err.println("Cevabınız Yanlış Doğru Cevap. "+ cevapAnahtarı[soruNo][0]);
						yanlısSayac++;
					}
						
						
					
						
			
		
			}
		
		} while (sayac<=4);
		
		System.err.println("Sorular Bitti.. \n"+"Doğru Sayısı: "+dogruSayac+"\n"+"Yanlış Sayısı: "+yanlısSayac);
        
    }
}
