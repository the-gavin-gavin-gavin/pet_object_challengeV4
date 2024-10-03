/* Constructing Objects and Exercising Methods Challenge
   1. Construct one zero argument constructor Pet object.
   2. Construct three 6 argument constructor Pet objects.
   3. Make one of your pets sleep by exercising the sleep() method.
   4. Make one of your pets wake up by using the wakeUp() method.
   5. Age two of your pets by using the aging() method.
   6. Make one of your pets gain weight by exercising the changeWeight() method.
   7. Make one of your pets lose weight by exercising the changeWeight() method.
   Rules: You may not change ANYTHING about the Pet class file.
   You must do everything above by using the Pet class.
   Between each console output, place a System.out.println() to aid with readibility of your output.
   Place all of your code in the main method below.
*/

class Main {
  public static void main(String[] args) {
   // zero argument Pet constructor
   Pet pet1 = new Pet();

   // three 6 argument Pet constructors
   Pet pet2 = new Pet("dog","Jaeger",2,8.1,true,false);

   // excersizing sleep method on pet1 and pet2
   pet1.sleep();
   System.out.println();
   pet2.wakeUp();
   System.out.println();

  //aging both of my pets
  pet1.aging(7);
  System.out.println();
  pet2.aging(2);
  System.out.println();

  //changing weight of both of my pets
  pet1.changeWeight(9.7);
  System.out.println();
  pet2.changeWeight(-2.1);
  System.out.println();

  // printing out pet values
   System.out.println(pet1);
   System.out.println();
   System.out.println(pet2);
  }
}