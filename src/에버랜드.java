package java0628;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int todayYear, todayDate, birthYear, birthMonth, birthDay, birthDate, reservationDate, benefit, count, manAge, price = 0;
		String ticket, socialNumber, age;
        String b = "";
        	   
		String pattern1 = "yyyyMMdd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
		String today = simpleDateFormat.format(new Date());
		System.out.println(today);
		todayYear = Integer.parseInt(today.substring(0,4));
	    todayDate = Integer.parseInt(today.substring(4,8));
	    
	    while(true ) {
	    	while(true) {
				System.out.println("--------------------------------------");
	   	    	System.out.println("�̿볯¥�� �Է����ּ���.(���ڷθ� 20210628)");
	   	    	System.out.print(": ");
	   	    	Scanner myInput1 = new Scanner(System.in);
	   	    	reservationDate = myInput1.nextInt();
		
				if(reservationDate == 20210703 || reservationDate == 20210704 || reservationDate == 20210710 || reservationDate == 20210711 || reservationDate == 20210717 
					 || reservationDate == 20210718 || reservationDate == 20210724 || reservationDate == 20210725 || reservationDate == 20210729 || reservationDate == 20210730 
					 || reservationDate == 20210731 || reservationDate == 20210801 || reservationDate == 20210802 || reservationDate == 20210803 || reservationDate == 20210807 
					 || reservationDate == 20210808 || reservationDate == 20210814 || reservationDate == 20210815 || reservationDate == 20210821 || reservationDate == 20210822 
					 || reservationDate == 20210828 || reservationDate == 20210829 || reservationDate == 20210903 || reservationDate == 20210906 || reservationDate == 20210907 
					 || reservationDate == 20210908 || reservationDate == 20210909 || reservationDate == 20210910 || reservationDate == 20210913 || reservationDate == 20210914 
					 || reservationDate == 20210915 || reservationDate == 20210916 || reservationDate == 20210917 || reservationDate == 20210923 || reservationDate == 20210924 
					 || reservationDate == 20210927 || reservationDate == 20210928 || reservationDate == 20210929 || reservationDate == 20210930 || reservationDate == 20211001 
					 || reservationDate == 20211004 || reservationDate == 20211005 || reservationDate == 20211006 || reservationDate == 20211007 || reservationDate == 20211008 
					 || reservationDate == 20211011 || reservationDate == 20211012 || reservationDate == 20211013 || reservationDate == 20211014 || reservationDate == 20211015 
					 || reservationDate == 20211018 || reservationDate == 20211019 || reservationDate == 20211020 || reservationDate == 20211021 || reservationDate == 20211022
					 || reservationDate == 20211025 || reservationDate == 20211026 || reservationDate == 20211027 || reservationDate == 20211028 || reservationDate == 20211029 
					 || reservationDate == 20211101 || reservationDate == 20211102 || reservationDate == 20211103 || reservationDate == 20211104 || reservationDate == 20211105 
					 || reservationDate == 20211108 || reservationDate == 20211109 || reservationDate == 20211110 || reservationDate == 20211111 || reservationDate == 20211112 
					 || reservationDate == 20211113 || reservationDate == 20211114 || reservationDate == 20211120 || reservationDate == 20211121 || reservationDate == 20211127 
					 || reservationDate == 20211128) {
					ticket = "B Ƽ��";
					break;
				} else if(reservationDate == 20210904 || reservationDate == 20210905 || reservationDate == 20210911 || reservationDate == 20210912 || reservationDate == 20210918
					 || reservationDate == 20210919 || reservationDate == 20210920 || reservationDate == 20210921 || reservationDate == 20210922 || reservationDate == 20210925
					 || reservationDate == 20210926 || reservationDate == 20211002 || reservationDate == 20211003 || reservationDate == 20211009 || reservationDate == 20211010
					 || reservationDate == 20211016 || reservationDate == 20211017 || reservationDate == 20211023 || reservationDate == 20211024 || reservationDate == 20211030
					 || reservationDate == 20211031 || reservationDate == 20211106 || reservationDate == 20211107) {
					ticket = "A Ƽ��";
					break;
				} else if(reservationDate == 20210628 || reservationDate == 20210629 || reservationDate == 20210630 || reservationDate == 20210701 || reservationDate == 20210702
					 || reservationDate == 20210705 || reservationDate == 20210706 || reservationDate == 20210707 || reservationDate == 20210708 || reservationDate == 20210709
					 || reservationDate == 20210712 || reservationDate == 20210713 || reservationDate == 20210714 || reservationDate == 20210715 || reservationDate == 20210716
					 || reservationDate == 20210719 || reservationDate == 20210720 || reservationDate == 20210721 || reservationDate == 20210722 || reservationDate == 20210723
					 || reservationDate == 20210726 || reservationDate == 20210727 || reservationDate == 20210728 || reservationDate == 20210804 || reservationDate == 20210805
					 || reservationDate == 20210806 || reservationDate == 20210809 || reservationDate == 20210810 || reservationDate == 20210811 || reservationDate == 20210812
					 || reservationDate == 20210813 || reservationDate == 20210816 || reservationDate == 20210817 || reservationDate == 20210818 || reservationDate == 20210819
					 || reservationDate == 20210820 || reservationDate == 20210823 || reservationDate == 20210824 || reservationDate == 20210825 || reservationDate == 20210826
					 || reservationDate == 20210827 || reservationDate == 20210830 || reservationDate == 20210831 || reservationDate == 20210901 || reservationDate == 20210902
					 || reservationDate == 20211115 || reservationDate == 20211116 || reservationDate == 20211117 || reservationDate == 20211118 || reservationDate == 20211119
					 || reservationDate == 20211122 || reservationDate == 20211123 || reservationDate == 20211124 || reservationDate == 20211125 || reservationDate == 20211126
					 || reservationDate == 20211129 || reservationDate == 20211130) {
					ticket = "C Ƽ��";
					break;
				} else {
					System.out.println("�ٽ� �Է��� �ּ���.");
					continue;
				}
			}
			
			if(ticket == "A Ƽ��") {
				price = price + 60000;
			} else if(ticket == "B Ƽ��") {
				price = price + 56000;
			} else {
				price = price + 50000;
			}
			
			System.out.println(ticket);
			System.out.println("��");

			while(true) {
				System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ���.(���ڷθ� 951123)(0 ������ ó������)\n");
				System.out.print(": ");
				Scanner myInput2 = new Scanner(System.in);
				socialNumber = myInput2.nextLine();
				if(socialNumber.equals("0")) {
					break;
				} else if(socialNumber.length() != 6) {
					System.out.println("�ٽ� �Է��� �ּ���.");
					continue;
				} else if(socialNumber.length() == 6) {
					birthMonth = Integer.parseInt(socialNumber.substring(2,4));
					birthDay = Integer.parseInt(socialNumber.substring(4,6));
					if((1 <= birthMonth && birthMonth <= 12) && (1 <= birthDay && birthDay <= 32)  ) {	
						break;
					} else {
						System.out.println("�ٽ� �Է��� �ּ���.");
						continue;
					}					
				} else {
					break;
				}
			}
			if (socialNumber.equals("0")) {
				continue;			
			} else {
				
			}
			
			birthYear = Integer.parseInt(socialNumber.substring(0,2));
			birthDate = Integer.parseInt(socialNumber.substring(2,6));
	
			if(0 <= birthYear && birthYear <= 30) {
				birthYear += 2000;
			} else {
				birthYear += 1900;
			}
			manAge = todayYear - birthYear;
			if(todayDate < birthDate) {
				manAge = manAge - 1;
			} else {
				manAge = manAge + 0;
			}
			
			System.out.printf("�� %d\n", manAge);
			
			if((19 <= manAge) && (manAge <= 64 ))  {
				age = "�";	
			} else if(65 <= manAge) {
				age = "���";
			} else if((3 <= manAge) && (manAge <= 12 )) {
				age = "���";
				if(ticket == "A Ƽ��") {
					price = 48000;
				} else if(ticket == "B Ƽ��") {
					price = 44000;
				} else {
					price = 40000;
				}
			} else if(manAge < 3) {
				age = "36�����̸�";
				price = 0;
			} else {
				age = "û�ҳ�";
			}

			System.out.println("��");
					
			while(true) {
				System.out.println("��� �ֹ��Ͻðڽ��ϱ�?(0 ������ ó������)");
				System.out.print(": ");
				Scanner myInput3 = new Scanner(System.in);
				count = myInput3.nextInt();
				if(count == 0) {
					break;
				} else {
					break;
				}
			}
			
			if(count == 0) {
				continue;
			}
				System.out.println("��");
					
			while(true) {
				System.out.println("�������� �����ϼ���.(0 ������ ó������)");
				System.out.println("1. ���� (���� ���� �ڵ�ó��)");
				System.out.println("2. �����");
				System.out.println("3. ����������");
				System.out.println("4. ���ڳ�");
				System.out.println("5. �ӻ��");
				System.out.print(": ");
				Scanner myInput4 = new Scanner(System.in);
				benefit = myInput4.nextInt();
				if(0 <= benefit && benefit <=5 ) {
					break;
				} else {
					System.out.println("�ٽ� �Է��� �ּ���.");
					continue;
				}
			}
			if(benefit == 0) {
				continue;
			}
							
			switch(benefit) {
			case 1: b = "������� ����"; break;
			case 2: b = "����� �������"; 
			if(ticket == "A Ƽ��") {
				if(age == "�") {price = 36000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 28000;}
			} else if(ticket == "B Ƽ��") {
				if(age == "�") {price = 33000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 26000;}
			} else {
				if(age == "�") {price = 30000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 24000;}
			} break;
			case 3: b = "���������� �������"; 
			if(ticket == "A Ƽ��") {
				if(age == "�") {price = 30000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 24000;}
			} else if(ticket == "B Ƽ��") {
				if(age == "�") {price = 28000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 22000;}
			} else {
				if(age == "�") {price = 25000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 20000;}
			} break;
			case 4: b = "���ڳ� �������"; 
			if(ticket == "A Ƽ��") {
				if(age == "�" || age == "û�ҳ�") {price = 48000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 38000;}
			} else if(ticket == "B Ƽ��") {
				if(age == "�" || age == "û�ҳ�") {price = 44000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 35000;}
			} else {
				if(age == "�" || age == "û�ҳ�") {price = 40000;} 
				else if(age == "36�����̸�") {price = 0;} 
				else {price = 32000;}
			} break;
			case 5: b = "�ӻ�� �������"; 
			if(ticket == "A Ƽ��") {
				if(age == "36�����̸�") {price = 0;} 
				else {price = 51000;}
			} else if(ticket == "B Ƽ��") {
				if(age == "36�����̸�") {price = 0;} 
				else {price = 47000;}
			} else {
				if(age == "36�����̸�") {price = 0;} 
				else {price = 42000;}
			} break;
			}
			
			System.out.println("��");
			System.out.printf("������ %d �Դϴ�.\n", price*count);
			System.out.println("�����մϴ�.");
			System.out.println();
			System.out.println("=============== �������� ===============");
			System.out.printf("%s  %s  X  %d  %d  %s\n", ticket, age, count, price*count, b);
			System.out.println("======================================");
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println();
			System.out.println();
					
		}		
	}		    
}


