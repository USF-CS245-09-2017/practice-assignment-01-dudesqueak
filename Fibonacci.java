public class Fibonacci {
    public int fibonacci (int n, String type){
        if( type == "iterative" )
        {
            return fibonacci_iterative(n);
        }
        if(type == "recursive")
        {
            return fibonacci_recursive(n);
        }
        return 0;
    }
    public int fibonacci_iterative(int n){
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }
    public int fibonacci_recursive(int n){
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }


}
