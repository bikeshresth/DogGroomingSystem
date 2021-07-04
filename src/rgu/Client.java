/**
 * 
 */
package rgu;

import java.util.Date;

/**
* USER 
*/
/**
 * @author pc56
 *
 */
public class Client  implements Comparable<Client> {

	public String name;
	public Date joined;
	public Dog dog;
	
	
	public Client(String name, Date joined, Dog dog) {
		super();
		this.name = name;
		this.joined = joined;
		this.dog = dog;
	}


	public String getName() {
		return name;
	}


	public Date getJoined() {
		return joined;
	}


	public Dog getDog() {
		return dog;
	}


	@Override
	public String toString() {
		return "Client [name=" + name + ", joined=" + joined + ", dog=" + dog + "]";
	} 
	
	public int compareTo(Client c){
		return this.name.compareTo(c.name);
	}
}
