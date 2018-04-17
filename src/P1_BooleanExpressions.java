/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/22/2018
*/

/*
 Your expression predictions:
 
 1. True
 2. True
 3. False
 4. True
 
 5. True
 6. False
 7. True
 8. True
   
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1. Correct
 2. Correct
 3. Correct
 4. Correct
 
 5. Correct
 6. Correct
 7. Correct
 8. Correct

 */
public class P1_BooleanExpressions {

	public static void main(String[] args) {
		int x = 27; 
		int y = -1; 
		int z = 32; 
		boolean b = false; 
		
		System.out.println(!b);
		System.out.println(b || true);
		System.out.println((x > y) && ( y > z));
		System.out.println((x == y) || (x <= z));
		System.out.println(!(x % 2 == 0) );
		System.out.println(b && !b);
		System.out.println(b || !b);
		System.out.println((x < y) == b);
	}

}
