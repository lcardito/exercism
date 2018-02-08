class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
        String intAsString = String.valueOf(numberToCheck);

        int sum = (int) intAsString
                .chars()
                .mapToObj(Character::getNumericValue)
                .mapToDouble(i -> Math.pow(i, intAsString.length()))
                .sum();

        return sum == numberToCheck;
	}
}
