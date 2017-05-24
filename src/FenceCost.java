
public class FenceCost {

	public static void main(String[] args) {
		
		int woodFence = 25;
		int chainLinkFence = 15;
		int gate = 150;
		int buildingPermit = 50;
		int tax = 6;
		boolean fenceWood= true;
	    int fenceCost;
		
		int perimeter = 40;
		int noOfDoors = 1;
		int gateCost;
		int salesCost;
		int totalCost;
		
		if(fenceWood){
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
