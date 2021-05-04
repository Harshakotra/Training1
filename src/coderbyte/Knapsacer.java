package coderbyte;

public class Knapsacer {
	
	// max function
	public static int max(int a, int b) {
		return (a>b) ? a:b;
	}
	
	 
	
	public static int knapSacker(int W,int[] profits, int[] weights, int n) {
		// base condition weight is zero or length is zero
		if (n==0 || W==0) {
			return 0;
		}
		// If the weight of the nth element is greater than the required Weight then 
		// skip and move fwd 
		//  40|50|60 W : 50
		// move to before element.
		if (weight[n-1]>W)
			return knapSacker(W,profits, weights,n-1);
		else
		{
			// If the weight of nth element is less than the req wt then
			// add the current profit and calculate remaining max profit
			// Also calculate the profit with out including this weight
			// max of two profits is the max profit.
			return max(profits[n-1]+knapSacker(W-weight[n-1],profits, weights,n-1),
					knapSacker(W,profits, weights,n-1));
		}
		
	}

	public static void main(String[] args) {
		// given profits
		int[] profits= {40,50,60};
		// given weights
		int[] weights= {10,20,30};
		// bag weight
		int W = 40;
		// length of weights
		int n=profits.length;
		// print max weight
		System.out.println(knapSacker(W,profits, weights,n));
	}

}
