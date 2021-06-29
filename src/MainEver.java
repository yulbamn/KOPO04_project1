package everlandFinal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainEver {

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputEver everinput = new InputEver();
		ArrayEver everarray = new ArrayEver();
		
		everarray.printToday();
	    do {
	    	while(true ) {
	    		everinput.inputDate();
	    		everarray.confirmTicket(everinput.ticket);
	    		System.out.println(everinput.ticket);
	    		System.out.println("天");
	    		everinput.inputSocialnumber();
	    		if (everinput.socialNumber.equals("0")) {continue;} 
	    		everarray.confrimAge(everinput.socialNumber);
	    		everarray.manType(everinput.ticket);
	    		System.out.println("天");
	    		everinput.inputCount();
	    		if(everinput.count == 0) {continue;}
	    		System.out.println("天");
	    		everinput.inputBenefit();
	    		if(everinput.benefit == 0) {continue;}
	    		everarray.confirmPrice(everinput.benefit, everinput.ticket);
	    		break;
	    	}  	
	    	everinput.inputAdd();
	    	everarray.confirmData(everinput.ticket, everinput.count);
    	} while(everinput.add == 1);
		System.out.println("天");
		everarray.printData();
	}

}


	

