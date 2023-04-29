public class Android extends Phone {
    
    private final String MANUFACTURER = "Samsung";
    private final String BRAND = "Note 8";
    private Carrier carrier;
    
    @Override
    public void initialize(String carrier, boolean memberCA){
    	//carrier.setMonthlyCostBase =	Willie
    	if (memberCA == true) {
    		double setupCostBase = 0.00;
    	    double monthlyCostBase = 50.00;
    	    this.carrier.setSetupCostBase(setupCostBase);  
    	    this.carrier.setMonthlyCostBase(monthlyCostBase);
  
    	}// end of if statement for MotoPhone
    	else if(memberCA == false) {
    		switch(carrier) {
    			case "Verizon": {
	    			double setupCostBase = 20.00;
	        	    double monthlyCostBase = 65.00;
	    			this.carrier.setSetupCostBase(setupCostBase);
	    			this.carrier.setMonthlyCostBase(monthlyCostBase);
	    			break;
    			}// end of case Verzion
    			case "AT&T": {
	    			double setupCostBase = 20.00;
	        	    double monthlyCostBase = 60.00;
	        	    this.carrier.setSetupCostBase(setupCostBase);
	    			this.carrier.setMonthlyCostBase(monthlyCostBase);
	    			break;
        	     }// end of case AT&T
    		     case "T-Mobile": {
	    			double setupCostBase = 10.00;
	        	    double monthlyCostBase = 60.00;
	    			this.carrier.setSetupCostBase(setupCostBase);
	    			this.carrier.setMonthlyCostBase(monthlyCostBase);
	    			break;
    		     }// end of case T-Mobile
    		}// end of switch statement
    	}// else if statement
    }// end of method
    
    public Android( String carrier ) {
   		switch (carrier){
           	case "Verizon": {
           		this.carrier = new Verizon(  );
           		break;
           	}// end of case Verzion
           	case "AT&T": {
           		this.carrier = new ATandT(  );
           		break;
           	}// end of case AT&T
           	case "T-Mobile": {
           		this.carrier = new Tmobile(  );
           		break;
           	}// end of T- Mobile 
           	default: {
           		System.out.println("Unknown Carrier.  Try Again.%n");
           		break;
           	}// end of default case
   		}// end of switch statement
   	}// end of constructor
     
   	@Override
   	public String toString() {
    	return MANUFACTURER + " " + BRAND + " on " + carrier.toString() + " - Setup Cost: " + this.carrier.getSetupCostBase() 
    	+ ", Monthly Cost: " + this.carrier.getMonthlyCostBase();
    }// method that returns a statement
    
 }// end of class Android
