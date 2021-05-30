package lab14;

public class RecursiveAddFunc {
	 public static int AddFunc(int n)
	    {
	        if (n <= 0)
	            return n;
	        return n + AddFunc(n - 1);}
	public static void main(String[] args) {
			 int n = 10;
		        System.out.println(AddFunc(n));
		}
	}


