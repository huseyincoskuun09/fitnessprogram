import java.util.Scanner;

public class main {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);

System.out.println("İdman programına hoşgeldiniz ...");
 
String idmanlar = "Geçerli hareketler .\n"
		        + "Burpee\n"
		        + "Pushup\n"
		        + "Situp \n"
		        + "Squat\n" ;
	
System.out.println(idmanlar);


System.out.println("Bir idman oluştunuz ...");

System.out.println("Burpee Sayısı :");
int burpee = scanner.nextInt();

System.out.println("Pushup Sayısı :");
int pushup = scanner.nextInt();

System.out.println("Situp Sayısı :");
int situp = scanner.nextInt();

System.out.println("Squat Sayısı :");
int squat = scanner.nextInt();
scanner.nextLine();


idman idman1 = new idman(burpee , pushup , situp , squat) ;

System.out.println("İdmanınız başlıyor ..");

while(idman1.idmanbittimi() ==false) {
	
	
	System.out.println("Hareket Türü(Burpee,Pushup,Situp ,Squat");
	String tur = scanner.nextLine();
	System.out.println("Bu hareketten kaç tane yapmak isiyorsunuz ");
	int sayı = scanner.nextInt();
	scanner.nextLine();
	
	idman1.hareketyap(tur, sayı) ;
	
	
	
}
System.out.println("İdmanını başarıyla bitirdin ....");

}
}
