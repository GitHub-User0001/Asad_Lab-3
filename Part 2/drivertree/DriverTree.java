package drivertree;

import findingsumpair.FindingSumPair;
import findingsumpair.FindingSumPair.Node;;

public class DriverTree {

	public static void main(String[] args) {
		Node root= null;
		
		FindingSumPair findingSP = new FindingSumPair();
		root = findingSP.insert(root,40);		
		root = findingSP.insert(root,20);
		root = findingSP.insert(root,60);
		root = findingSP.insert(root,10);
		root = findingSP.insert(root,30);
		root = findingSP.insert(root,50);
		root = findingSP.insert(root,70);
	
	    int sum = 80;
	    findingSP.findingPairWithGivenSum(root, sum);
		
	}

}
