import java.io.*;
import java.util.*;

public class ClassVsInstance {
    private int age;	
  
	public ClassVsInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
           if(initialAge < 0){
              age = 0; 
        System.out.println("Age is not valid, setting age to 0.");
           }
           else{
            age = initialAge;
           }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
          if(age < 13){
          System.out.println("You are young.");
          }
          else if(age >= 13 && age < 18){
          System.out.println("You are a teenager.");
          }
          else
              System.out.println("You are old.");
          
      //  System.out.println(/*Insert correct print statement here*/);
	}

	public void yearPasses() {
  		// Increment this person's age.
          age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassVsInstance p = new ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}