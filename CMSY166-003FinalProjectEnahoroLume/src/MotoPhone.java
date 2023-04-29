
public class MotoPhone extends Phone {

    private final String MANUFACTURER = "MotoPhone";
    private final String BRAND = "Moto Galaxy z";
    private Carrier carrier;
    
    @Override
    public void initialize(String carrier, boolean memberCA){
    	//carrier.setMonthlyCostBase =	Willie
    	    double setupCostBase = 20.00;
    	    double monthlyCostBase = 70.00;
    	    this.carrier.setSetupCostBase(setupCostBase);  
    	    this.carrier.setMonthlyCostBase(monthlyCostBase);
     	}// end of method
    	
        public MotoPhone( String carrier ) {
        	switch (carrier){
            	case "Verizon": {
            		this.carrier = new Verizon(  );
            		break;
            	}//end of case Verzion
            	case "AT&T": {
            		this.carrier = new ATandT(  );
            		break;
            	}// end of case AT&T
            	case "T-Mobile": {
            		this.carrier = new Tmobile(  );
            		break;
            	}// end of case T-Mobile
            	default: {
            		System.out.println("Unknown Carrier.  Try Again.%n");
            		break;
            	}// end of default case
        	}// end of switch statement
        
        }// end of constructor
        @Override
        public String toString() {
        	return MANUFACTURER + " " + BRAND + " on "+ carrier.toString()+ " - Setup Cost: " + this.carrier.getSetupCostBase() +
        			", Monthly Cost: " + this.carrier.getMonthlyCostBase();
    }// method that returns a statement 

}// end of subclass MotoPhone

	
	