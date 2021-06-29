package everlandFinal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEver {

	public int todayYear = 0, todayDate = 0, manAge = 0, birthYear = 0, birthDate = 0 ;
	public int price = 0 ;
	public String age = null;
	public String b = null; 
	
	public void printToday() {
		String pattern1 = "yyyyMMdd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
		String today = simpleDateFormat.format(new Date());
		System.out.println(today);
		todayYear = Integer.parseInt(today.substring(0,4));
	    todayDate = Integer.parseInt(today.substring(4,8));
	}
	
	public void confirmTicket(String ticket) {
	  	if(ticket == "A 티켓") {price = 60000;} 
	  	else if(ticket == "B 티켓") {price = 56000;} 
	  	else {price = 50000;}
	}
		
	public void confrimAge(String socialNumber) {
	  	birthYear = Integer.parseInt(socialNumber.substring(0,2));
	  	birthDate = Integer.parseInt(socialNumber.substring(2,6));
	  	if(0 <= birthYear && birthYear <= 30) {birthYear += 2000;} 
	  	else {birthYear += 1900;}
	  	manAge = todayYear - birthYear;
	  	if(todayDate < birthDate) {manAge = manAge - 1;} 
	  	else {manAge = manAge + 0;}
		System.out.printf("만 %d\n", manAge);
	}
	
	public void manType(String ticket) {
		if((19 <= manAge) && (manAge <= 64 )) {age = "어른";	} 
	  	else if(65 <= manAge) {age = "경로";} 
	  	else if((3 <= manAge) && (manAge <= 12 )) {
	  		age = "어린이";
	  		if(ticket == "A 티켓") {price = 48000;} 
	  		else if(ticket == "B 티켓") {price = 44000;} 
	  		else {price = 40000;}} 
	  	else if(manAge < 3) {
	  		age = "36개월미만";
	  		price = 0;} 
	  	else {age = "청소년";}
	}
	
	public void confirmPrice(int benefit, String ticket) {
	  	switch(benefit) {
	  		case 1: b = "우대적용 없음"; break;
	  		case 2: b = "장애인 우대적용"; 
	  			if(ticket == "A 티켓") {
	  				if(age == "어른") {price = 36000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 28000;}
	  			} else if(ticket == "B 티켓") {
	  				if(age == "어른") {price = 33000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 26000;}
	  			} else {
	  				if(age == "어른") {price = 30000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 24000;}
	  			} break;
	  		case 3: b = "국가유공자 우대적용"; 
	  			if(ticket == "A 티켓") {
	  				if(age == "어른") {price = 30000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 24000;}
	  			} else if(ticket == "B 티켓") {
	  				if(age == "어른") {price = 28000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 22000;}
	  			} else {
	  				if(age == "어른") {price = 25000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 20000;}
	  			} break;
	  		case 4: b = "다자녀 우대적용"; 
	  			if(ticket == "A 티켓") {
	  				if(age == "어른" || age == "청소년") {price = 48000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 38000;}
	  			} else if(ticket == "B 티켓") {
	  				if(age == "어른" || age == "청소년") {price = 44000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 35000;}
	  			} else {
	  				if(age == "어른" || age == "청소년") {price = 40000;} 
	  				else if(age == "36개월미만") {price = 0;} 
	  				else {price = 32000;}
	  			} break;
	  		case 5: b = "임산부 우대적용"; 
	  			if(ticket == "A 티켓") {
	  				if(age == "36개월미만") {price = 0;} 
	  				else {price = 51000;}
	  			} else if(ticket == "B 티켓") {
	  				if(age == "36개월미만") {price = 0;} 
	  				else {price = 47000;}
	  			} else {
	  				if(age == "36개월미만") {price = 0;} 
	  				else {price = 42000;}
	  			} break;
	   	}

	}
	
}
