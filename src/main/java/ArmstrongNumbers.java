class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

     int number=numberToCheck;
     int noOfDigits=String.valueOf(numberToCheck).length();
     int result=0;
     while(number >0){
      result += Math.pow(number%10,noOfDigits);
      number=number/10;

	 }
      return result==numberToCheck;
	}
}
