/**
 * 
 */
package rgu;
/**
* USER 
*/
/**
 * @author pc56
 *
 */
public class GrommingService extends Services {
     public String customStyle;
     public double customerStyleCost;
     
     
	

	public GrommingService(String description, Grommer grommer, double cost, String customStyle,
			double customerStyleCost) {
		super(description, grommer, cost);
		this.customStyle = customStyle;
		this.customerStyleCost = customerStyleCost;
	}


	public String getCustomStyle() {
		return customStyle;
	}


	public double getCustomerStyleCost() {
		return customerStyleCost;
	}
     
	public void updateCustomerStyleCost(double customStyle) {
		
	}


	@Override
	public double getTotalCost() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "GrommingService [customStyle=" + customStyle + ", customerStyleCost=" + customerStyleCost
				+ ", description=" + description + ", cost=" + cost + "]";
	}
	
	
     
     
}
