package coderbyte;

public class Knapsacer {
	public static int max(int a, int b) {
		return (a>b) ? a:b;
	}
	public static int knapSacker(int W,int[] vale, int[] weight, int n) {
		if (n==0 || W==0) {
			return 0;
		}
		if (weight[n-1]>W)
			return knapSacker(W,vale, weight,n-1);
		else
		{
			return max(vale[n-1]+knapSacker(W-weight[n-1],vale, weight,n-1),
					knapSacker(W,vale, weight,n-1))
		;}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vale= {40,50,60};
		int[] weight= {10,20,30};
		int W=40;
		int n=vale.length;
		
		System.out.println(knapSacker(W,vale, weight,n));
	}

}
