package br.ufpr.form;

public class MostFactor {

	public static void main(String[] args) {
		int[] list = { 13, 16, 25, 100};
		System.out.println(numberWithMostFactors(list));
	}

	public static int numberWithMostFactors(int[] listNumbers) {
		int currentFactor = 0;
		int maxFactorControl = 0;
		int numberMostFactor = 0;
		for (int num : listNumbers) {
			currentFactor = amountFactors(num);
			if(currentFactor > maxFactorControl){
				numberMostFactor = num;
				maxFactorControl = currentFactor;
			}
		}
		return numberMostFactor;
	}

	public static int amountFactors(int num) {
		int countFactors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				countFactors++;
		}
		return countFactors;
	}

}
