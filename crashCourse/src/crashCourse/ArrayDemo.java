package crashCourse;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int nums [] = new int[4]; nums[0]=1; nums[2]=4; nums[1] = 3; nums[3] = 2;
		 * for(int i=0; i<4; i++) { System.out.println(nums[i]);
		 * 
		 * }
		 */
		
		
		
		
		/*
		 * int a[]= {1,2,3,4}; int b[]= {2,4,6,8}; int c[] = {5,6,7,8}; int d[][]= { //
		 * 2-D Array {1,2,3,4}, {2,4,6,8}, {5,6,7,8} };
		 * 
		 * //System.out.println(d[0][2]);
		 * 
		 * 
		 * for(int i=0; i<3; i++) { for(int j=0;j<4;j++) { System.out.print(" " +
		 * d[i][j]); } System.out.println(); }
		 */
		
		
		
		
		/*
		 * int e[][]= { // Jagged Array {1,2,3,4}, {2,4,6}, {5,6,7,8,9} };
		 * 
		 * for(int i=0; i<e.length; i++) { for(int j=0;j<e[i].length;j++) {
		 * System.out.print(" " + e[i][j]); } System.out.println(); }
		 */
		
		int f[][]= { // Jagged Array 
				{1,2,3,4}, 
				{2,4,6},
				{5,6,7,8,9,10} 
				};
		
		for (int k[]:f) {
			for(int l:k) {
				System.out.print(" "+ l);
			}
			System.out.println();
		}
	}

}
