abstract public class Carrier {
    
    private String name = "Unknown Carrier";
    private double setupCostBase = 0.00;
    private double monthlyCostBase = 0.00;
    
    public Carrier(String name){
    	this.name = name;
    }// end of constructor 
    
    public void setSetupCostBase(double setupCostBase) {
    	this.setupCostBase = setupCostBase;
    }//method that sets Setup Cost
    
    public double getSetupCostBase() {
    	return setupCostBase;
    }// method that returns the SetupCostBase
    
    public void setMonthlyCostBase(double monthlyCostBase) {
    	this.monthlyCostBase = monthlyCostBase;
    }// method that sets MonthlyCostBase
    public double getMonthlyCostBase() {
    	return monthlyCostBase;
    }// method that returns the MonthlyCostBase
    
    
    @Override
    public String toString(){
        return name;
    }// method that returns name
}// end of super class Carrier
