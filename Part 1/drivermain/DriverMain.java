package drivermain;

import balancingbrackets.BalancingBrackets;

public class DriverMain {

	public static void main(String[] args) {
		String bracketExpression ="())";
        boolean isBalanced = BalancingBrackets.checkBalancingBrackets(bracketExpression);
        if(isBalanced) {
        	System.out.println("Balanced Brackets");
        }else {
        	System.out.println("Unbalanced brackets");
        }
	}

}
