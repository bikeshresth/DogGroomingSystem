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
		public class Dog {
		   public String name;
		   public int age;
		   public DogBreed breed;
		   
		   
		public Dog(String name, int age, DogBreed breed) {
			super();
			this.name = name;
			this.age = age;
			this.breed = breed;
		}


		public String getName() {
			return name;
		}


		public int getAge() {
			return age;
		}


		public DogBreed getBreed() {
			return breed;
		}
		
		
		public void updateAge(int a) {
			
		}


		@Override
		public String toString() {
			return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
		}
		
		

   
   
}
