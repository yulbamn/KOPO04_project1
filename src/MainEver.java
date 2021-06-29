package everlandFinal;

public class MainEver {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputEver everinput = new InputEver();
		DataEver everdata = new DataEver();
		ArrayEver everarray = new ArrayEver();
		
		everdata.printToday();
	    do {
	    	while(true ) {
	    		everinput.inputDate();
	    		everdata.confirmTicket(everinput.ticket);
	    		System.out.println(everinput.ticket);
	    		System.out.println("天");
	    		everinput.inputSocialnumber();
	    		if (everinput.socialNumber.equals("0")) {continue;} 
	    		everdata.confrimAge(everinput.socialNumber);
	    		everdata.manType(everinput.ticket);
	    		System.out.println("天");
	    		everinput.inputCount();
	    		if(everinput.count == 0) {continue;}
	    		System.out.println("天");
	    		everinput.inputBenefit();
	    		if(everinput.benefit == 0) {continue;}
	    		everdata.confirmPrice(everinput.benefit, everinput.ticket);
	    		break;
	    	}  	
	    	everinput.inputAdd();
	    	everarray.confirmData(everinput.ticket, everinput.count, everdata.price, everdata.age, everdata.b);
    	} while(everinput.add == 1);
		System.out.println("天");
		everarray.printData();
	}

}
