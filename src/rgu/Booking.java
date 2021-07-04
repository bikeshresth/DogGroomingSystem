/**
 * 
 */
package rgu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* USER 
*/
/**
 * @author pc56
 *
 */
public class Booking  implements Comparable<Booking>{
	public Services service; 
	public Client client; 
	public Date datetime;
	
	public Booking(Services service, Client client, Date datetime) {
		super();
		this.service = service;
		this.client = client;
		this.datetime = datetime;
	}

	public Services getService() {
		return service;
	}

	public Client getClient() {
		return client;
	}

	public Date getDatetime() {
		return datetime;
	}
	
	public String getDatetimeAsString() {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
		 Date date = new Date();  
		 String strDate= formatter.format(date);  
		 return strDate;  
	}
	
	public int compareTo(Booking o){
		 if (getDatetimeAsString() == null || o.getDatetimeAsString() == null)
		      return 0;
		    return getDatetimeAsString().compareTo(o.getDatetimeAsString());
		  }
	}

