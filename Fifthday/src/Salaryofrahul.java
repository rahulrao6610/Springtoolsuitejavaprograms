import java.util.Scanner;
public class Salaryofrahul {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of colonies:");
         int colonies = sc.nextInt();
         for (int i = 0; i < colonies; i++) {
           System.out.println("Enter the number of buildings and earnings per building for colony " + (i + 1) + ":");
            int numBuildings = sc.nextInt();
            int earningPerBuilding = sc.nextInt();
           int[] heights = new int[numBuildings];
        System.out.println("Enter the heights of the buildings:");
       for (int j = 0; j < numBuildings; j++) {
       heights[j] = sc.nextInt();
} 
  int totalEarnings = calculateEarnings(heights, earningPerBuilding);
  System.out.println("Maximum earnings in colony " + (i + 1) + ": " + totalEarnings);
}   
sc.close();
}
 private static int calculateEarnings(int[] heights, int earningPerBuilding) {
int totalBuildingsSeen = 0;
int maxHeightSoFar = 0;
for (int height : heights) {
	if (height > maxHeightSoFar) {
      maxHeightSoFar = height;
	totalBuildingsSeen++;
		  }
}   
return totalBuildingsSeen * earningPerBuilding;
		    }
	}


