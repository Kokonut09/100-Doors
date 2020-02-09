/**
 * The 100 Doors problem
 * @author Andrew
 *
 */
public class Doors {

	/**
	 * The main method
	 * @param args
	 */

	public static void main(String[] args) {

		int[] doors = new int[100];	

		for (int i = 1; i <= doors.length; i++) {

			for (int j = i ; j <=doors.length; j += i) {

				doors[j-1] = doorSwitch(doors[j-1]);
								
			}		
		}
		
		
		System.out.print("Open doors: ");		
		for (int i = 0; i < doors.length; i++) {
			
			if(doors[i] == 1) {
				
			System.out.print(i+1 + ", ");
			}
		}
	}

	/**
	 * this doorSwitch method will change 0 to 1 or 1 to 0
	 * @param nums the current state of the door
	 * @return
	 */
	public static int doorSwitch(int nums) {

		if(nums == 0) {

			nums = 1;

		}else {

			nums = 0;
		}
		return nums;

	}
}
