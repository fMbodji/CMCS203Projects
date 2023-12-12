/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Holiday Bonus class for calculating total Holiday Bonus
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Fatima Mbodji
*/

public class HolidayBonus {
	private final static double BONUS_HIGHEST = 5000.0;
	private final static double BONUS_LOWEST = 1000.0;
	private final static double BONUS_OTHER = 2000.0;
	
	public static double[] calculateHolidayBonus(double[][] data) {
		double[] bonuses = new double[data.length]; 
		double total=0.0;
		
		double [][] bonusArray = new double [data.length][];
		for (int row = 0; row < data.length; row++) 
		{
			bonusArray[row]=new double [data[row].length] ;
			for (int col = 0; col < data[row].length; col++) 
			{
				if(data[row][col] > 0)
				{
					if (data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data, col)
							&& data[row][col] == TwoDimRaggedArrayUtility.getLowestInColumn(data, col)) {
						bonusArray[row][col] += BONUS_HIGHEST;
					}
					if (data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data, col)) {
						bonusArray[row][col] += BONUS_HIGHEST;
					}
					if (data[row][col] == TwoDimRaggedArrayUtility.getLowestInColumn(data, col)) {
						bonusArray[row][col] += BONUS_LOWEST;
					}
					if (data[row][col] != TwoDimRaggedArrayUtility.getLowestInColumn(data, col)
							&& data[row][col] != TwoDimRaggedArrayUtility.getHighestInColumn(data, col)) {
						bonusArray[row][col] = BONUS_OTHER;
					}
				}
				else
					continue;
			}
		}
		
		for (int row = 0; row < bonusArray.length; row++) 
		{
			total = 0;
			for (int col = 0; col < bonusArray[row].length; col++)
			{
				total += bonusArray[row][col];
			}
			bonuses[row] += total;
		}

		return bonuses;
	}
	
	
	public static double calculateTotalHolidayBonus(double[][] data) {
	    double[] bonuses = calculateHolidayBonus(data);
	    double totalBonus = 0.0;

	    for (int i=0; i<data.length ; i++) 
	    {
	        totalBonus += bonuses[i];
	    }

	    return totalBonus;
	}
	

	    
}

	 
