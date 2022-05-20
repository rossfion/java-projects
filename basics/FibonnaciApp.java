public class FibonnaciApp {
	public static void main(String[] args){
		// an exercise in recursion
		// the Fibonnaci number is defined by the sume of the 2 previous numbers
		// fib(0) = 0;
		// fib(1) = 1;
		// fib(2) = fib(1) + fib(0) = 0 + 1  = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1  = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1  = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2  = 5
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));
	}
	
	public static int fib(int n){
		if(n == 0){
			return 0;
		} else if (n == 1){
			return 1;
		}
		return ( ((fib(n-1)) + (fib(n-2))) );
	}
}