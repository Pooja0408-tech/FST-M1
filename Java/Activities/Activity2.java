package activities;

public class Activity2 {
 public static void main(String[] args) {
	 Activity2 actObj = new Activity2();
	 int[]inputArr = {5,32,5,22,10,0,-5,12,5,20};
	 int searchNum = 5;
			int finalSum = 20;
			System.out.println("Does the sum equal to 20? :" +actObj.result(inputArr, searchNum, finalSum));
 }
	 
  public boolean result(int[]inputArr, int searchNum, int fixedSum) {
	 int tempSum = 0;
			 
			 for(int num : inputArr) {
				 if (num == searchNum) {
					 tempSum += searchNum;
				 }
				 if (tempSum > fixedSum) {
					 break;
				 }
			 }
			 return tempSum == fixedSum;
  }
}
			

