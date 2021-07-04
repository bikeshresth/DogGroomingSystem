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
public class CleaningService extends Services{
		public boolean includeBrushTeeth;
		public boolean includeTrimNails;
		public double nailTrimCost;
		public double brushTeethCost;
		
		
		public CleaningService(String description, Grommer grommer, double cost, boolean includeBrushTeeth,
				boolean includeTrimNails, double nailTrimCost, double brushTeethCost) {
			super(description, grommer, cost);
			this.includeBrushTeeth = includeBrushTeeth;
			this.includeTrimNails = includeTrimNails;
			this.nailTrimCost = nailTrimCost;
			this.brushTeethCost = brushTeethCost;
		}


		public boolean includeBrushTeeth() {
			return includeBrushTeeth;
		}


		public boolean includeTrimNails() {
			return includeTrimNails;
		}


		public double getNailTrimCost() {
			return nailTrimCost;
		}


		public double getBrushTeethCost() {
			return brushTeethCost;
		}
		
		public void updateBrushTeethCost(double costTeeth) {
			
		}
		
		public void updatenailTrimCost(double costNail) {
			
		}


		@Override
		public double getTotalCost() {
			
			return 0;
		}


		@Override
		public String toString() {
			return "CleaningService [includeBrushTeeth=" + includeBrushTeeth + ", includeTrimNails=" + includeTrimNails
					+ ", nailTrimCost=" + nailTrimCost + ", brushTeethCost=" + brushTeethCost + ", description="
					+ description + ", cost=" + cost + "]";
		}
		
		

		
		
		
		
		
		
		
}
