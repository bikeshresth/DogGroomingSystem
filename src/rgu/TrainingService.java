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
public class TrainingService extends Services {
		public int sessions;
		public double sessionCost;
		
		
		public TrainingService(String description, Grommer grommer, double cost, int sessions, double sessionCost) {
			super(description, grommer, cost);
			this.sessions = sessions;
			this.sessionCost = sessionCost;
		}


		public int getSessions() {
			return sessions;
		}


		public double getSessionCost() {
			return sessionCost;
		}
			
		public void updateSessions(int update) {
			
		}


		public void updateSessionCost(double updateCost) {
			
		}


		@Override
		public double getTotalCost() {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public String toString() {
			return "TrainingService [sessions=" + sessions + ", sessionCost=" + sessionCost + ", description="
					+ description + ", cost=" + cost + "]";
		}
		
		
			
		
}
