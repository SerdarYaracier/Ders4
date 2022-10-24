package LabHafta4;
import java.util.Scanner;	

public class Lab4hafta {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dogru=0;
		System.out.println("1. soru icin 9u tuslayiniz");
		
		Scanner scanner = new Scanner(System.in);
		
		int array[]= new int[5];
		
		  
		
		
	    System.out.println("Hangisi kuresel isinmayi tetiklemez?");
		System.out.println("1  hava kirliligi");
		System.out.println("2  su kirliligi");
		System.out.println("3 toprak kirliligi");
		System.out.println("4 kahve icmek");
			array[0]=scanner.nextInt();
		if(array[0]==4)
		{
			System.out.println("Dogru bildiniz");
			dogru++;
		}
		else 
			System.out.println("Yanlis bildiniz");
		
		
		System.out.println("Hangisi doğaya zararlı bilesik degildir?");
		System.out.println("1 CO");
		System.out.println("2 SO2");
		System.out.println("3 SO3");
		System.out.println("4 H2O");
		array[1]=scanner.nextInt();
		if(array[1]==4)
		{
			System.out.println("Dogru bildiniz");
			dogru++;
		}
		else 
			System.out.println("Yanlis bildiniz");
		
		
		
		System.out.println("Hangisi kurasel isinmaya karsi bir onlem degildir");
		System.out.println("1 Suyu daha az kullanmak");
		System.out.println("2 Gunes enerjisi kullanmak");
		System.out.println("3 Petrol turevi yakit kullanmak");
		System.out.println("4 Tasarruflu ampul kullanmak");
		array[2]=scanner.nextInt();
		if(array[2]==3)
		{
			System.out.println("Dogru bildiniz");
			dogru++;
		}
		else 
			System.out.println("Yanlis bildiniz");
		
		
		System.out.println("Aşağıdakilerden hangisi küresel ısınmanın sonuçlarından biri değildir?");
		System.out.println("1 Ortalama deniz seviyesinin yükselmesi");
		System.out.println("2 Buzulların artması ");
		System.out.println("3 İklim değişiklikleri");
		System.out.println("4 Tatlı su kaynaklarının azalması");
		array[3]=scanner.nextInt();
		if(array[3]==2)
		{
			System.out.println("Dogru bildiniz");
			dogru++;
		}
		else 
			System.out.println("Yanlis bildiniz");
		
		
		System.out.println("Güneş enerjisinin bu gazlar tarafından tutulması olayına ne ad verilir?");
		System.out.println("1 günes tutulmasi");
		System.out.println("2 Buzullarin erimesi");
		System.out.println("3 Sera etkisi");
		System.out.println("4 Ozon Tabakasinin Delinmesi");
		array[4]=scanner.nextInt();
		if(array[4]==3)
		{
			System.out.println("Dogru bildiniz");
			dogru++;
		}
		else 
			System.out.println("Yanlis bildiniz");
		
		for(int i=0;i<=4;i++)
		System.out.println("cevaplariniz:"+ array[i]);
		
		System.out.println("Cevap anahtari : 4 4 3 2 3");
		
		
		switch(dogru)
		{

		case 1:
			System.out.println("bilgilerinizi tazeleme zamani");
			break;
		case 2:
			System.out.println("bilgilerinizi tazeleme zamani");	
			break;
		case 3:
			System.out.println("bilgilerinizi tazeleme zamani");	
			break;
		case 4:
			System.out.println("Cok iyi");
			break;
		case 5:
			System.out.println("Mukemmel");	
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
