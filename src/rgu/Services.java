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
public abstract class Services {
		public String description;
		public Grommer grommer;
		public double cost;
		
		
		public Services(String description, Grommer grommer, double cost) {
			super();
			this.description = description;
			this.grommer = grommer;
			this.cost = cost;
		}


		public String getDescription() {
			return description;
		}


		public Grommer getGrommer() {
			return grommer;
		}


		public double getCost() {
			return cost;
		}
		
		public void updateCost(double c) {
			
		}
		
		public abstract double getTotalCost();


		@Override
		public String toString() {
			return "Services [description=" + description + ", cost=" + cost + "]";
		}
		
		
}
