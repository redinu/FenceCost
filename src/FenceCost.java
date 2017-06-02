import java.util.Scanner;

public class FenceCost {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int woodFence = 25;
		int chainLinkFence = 15;
		int gate = 150;
		int buildingPermit = 50;
		int tax = 6;
		int fenceCost;
	    
		System.out.println("Enter length ");
		int length = scn.nextInt();
		System.out.println("Enter length ");
		int width = scn.nextInt();
		System.out.println("Enter number of doors");
		int noOfDoors = scn.nextInt();
		scn.nextLine();
		System.out.println("Choose the type of fence you want. Is it wood fence or chain link fence ? ");
		String fenceType = scn.nextLine();
		int perimeter = length * width;
		int gateCost;
		int salesCost;
		int totalCost;
		
		if(fenceType.equalsIgnoreCase("wood fence")){
			fenceCost = perimeter * woodFence;
		}else{
			fenceCost = perimeter * chainLinkFence;
		}

			gateCost = gate * noOfDoors;
			
		
		
		salesCost = fenceCost + gateCost;
		totalCost = buildingPermit+ salesCost + salesCost * tax/100;

		System.out.print(totalCost);
}

}
