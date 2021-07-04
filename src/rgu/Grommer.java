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
public class Grommer {
	//Variables declared for Groomer class  
	public String name;
	public String description;
	
	
	
	
	public Grommer() {
		this.name = "";
		this.description = "";
	}

	//constructor created according to the parameters.
	public Grommer(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override //toString method implemented for displaying the string of the system 
	public String toString() {
		return name;
	}
	
	
}
