public class mainTest {

	public static void main(String[] args) {
		double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8}};
		TwoDimRaggedArrayUtility test = new TwoDimRaggedArrayUtility();
		double testAverage=test.getAverage(dataSet1);
		System.out.println(testAverage);
		System.out.println(test.getLowestInRowIndex(dataSet1, 0));
		System.out.println(test.getHighestInColumnIndex(dataSet1,2));
		System.out.println(test.getLowestInColumnIndex(dataSet1,0));
	}

}
 