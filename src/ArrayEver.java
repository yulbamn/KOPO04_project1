package everlandFinal;

import java.util.ArrayList;


public class ArrayEver {

	public ArrayList<String> arrTicket = new ArrayList<String>();
	public ArrayList<String> arrAge = new ArrayList<String>();
	public ArrayList<Integer> arrCount = new ArrayList<Integer>();
	public ArrayList<Integer> arrPrice = new ArrayList<Integer>();
	public ArrayList<String> arrB = new ArrayList<String>();
	
	public void confirmData(String ticket, int count, int price, String age, String b) {
	  	arrTicket.add(ticket);
	  	arrAge.add(age);
	  	arrCount.add(count);
	  	arrPrice.add(price);
	  	arrB.add(b);
	}
	
	public void printData() {
		int sum = 0;
		for(int i=0; i < arrTicket.size(); i++) {
			sum += arrPrice.get(i)*arrCount.get(i);
		}
		System.out.printf("가격은 %d 입니다.\n", sum);	
		System.out.println("감사합니다.");
		System.out.println();
		System.out.println("================= 에버랜드 =================");
		for(int i=0; i < arrTicket.size(); i++) {
		System.out.printf("%s\t%s\tX%d\t%d\t%s\n", arrTicket.get(i), arrAge.get(i), arrCount.get(i), arrPrice.get(i)*arrCount.get(i), arrB.get(i));
		}
		System.out.println("==========================================");
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println();
	}
	
}
