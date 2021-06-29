package everlandFinal;

import java.util.Scanner;

public class InputEver {
	
	public int reservationDate = 0, benefit = 0, count = 0, birthMonth = 0, birthDay = 0, add = 0, sum=0;	
	public String ticket = null, socialNumber = null;
	
	public void inputDate() {		
	  	while(true) {	  		
	  		System.out.println("--------------------------------------");
	  		System.out.println("이용날짜를 입력해주세요.(숫자로만 20210628)");
	  		System.out.print(": ");
	  		Scanner myInput = new Scanner(System.in);
	  		reservationDate = myInput.nextInt();
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
	  			ticket = "B 티켓";
	  			break;
	  		} else if(reservationDate == 20210904 || reservationDate == 20210905 || reservationDate == 20210911 || reservationDate == 20210912 || reservationDate == 20210918
	  				|| reservationDate == 20210919 || reservationDate == 20210920 || reservationDate == 20210921 || reservationDate == 20210922 || reservationDate == 20210925
	  				|| reservationDate == 20210926 || reservationDate == 20211002 || reservationDate == 20211003 || reservationDate == 20211009 || reservationDate == 20211010
	  				|| reservationDate == 20211016 || reservationDate == 20211017 || reservationDate == 20211023 || reservationDate == 20211024 || reservationDate == 20211030
	  				|| reservationDate == 20211031 || reservationDate == 20211106 || reservationDate == 20211107) {
	  			ticket = "A 티켓";
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
	  			ticket = "C 티켓";
	  			break;
	  		} else {
	  			System.out.println("다시 입력해 주세요.");
	  			continue;
	  		}
	  	}
	}
		
	public void inputSocialnumber() {
		while(true) {
	  		System.out.print("주민번호 앞자리를 입력하세요.(숫자로만 951123)(0 누르면 처음으로)\n");
	  		System.out.print(": ");
	  		Scanner myInput = new Scanner(System.in);
	  		socialNumber = myInput.next();
	  		if(socialNumber.equals("0")) {break;} 
	  		else if(socialNumber.length() != 6) {System.out.println("다시 입력해 주세요.");
	  			continue;} 
	  		else if(socialNumber.length() == 6) {
	  			birthMonth = Integer.parseInt(socialNumber.substring(2,4));
	  			birthDay = Integer.parseInt(socialNumber.substring(4,6));
	  			if((1 <= birthMonth && birthMonth <= 12) && (1 <= birthDay && birthDay <= 32)) {	
	  				break;} 
	  			else {
	  				System.out.println("다시 입력해 주세요.");
	  				continue;}} 
	  		else {break;}
	  	}
	}
		
	public void inputCount() {
		while(true) {
	  		System.out.println("몇개를 주문하시겠습니까?(0 누르면 처음으로)");
	  		System.out.print(": ");
	  		Scanner myInput = new Scanner(System.in);
	  		count = myInput.nextInt();
	  		if(count == 0) {break;} 
	  		else {break;}
	  	}
	}
	
	public void inputBenefit() {
	  	while(true) {
	  		System.out.println("우대사항을 선택하세요.(0 누르면 처음으로)");
	  		System.out.println("1. 없음 (나이 우대는 자동처리)");
	  		System.out.println("2. 장애인");
	  		System.out.println("3. 국가유공자");
	  		System.out.println("4. 다자녀");
	  		System.out.println("5. 임산부");
	  		System.out.print(": ");
	  		Scanner myInput = new Scanner(System.in);
	  		benefit = myInput.nextInt();
	  		if(0 <= benefit && benefit <=5 ) {break;} 
	  		else {
	  			System.out.println("다시 입력해 주세요.");
	  			continue;}
	  	}
	}
		
	public void inputAdd() {
	  	System.out.println("ㅡ");
	  	System.out.print("1. 추가구매 2. 구매완료\n");
	  	System.out.print(": ");
	  	Scanner myInput = new Scanner(System.in);
	  	add = myInput.nextInt();
	}
	
}

