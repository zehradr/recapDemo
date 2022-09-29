package recapDemo;

public class main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,5.6};
		double total=0;
		double max= myList[0];
		
		
		for (double number:myList) {
			//o anki sayı max'tan büyük ise max'ı o anki sayı olarak ata diyoruz
			if(max<number)
				max=number;
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam= "+ total);
		System.out.println("En büyük= "+ max);

	}

}
