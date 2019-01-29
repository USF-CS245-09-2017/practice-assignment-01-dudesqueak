public class Factorial {
    public int factorial (int n, String type){
        if( type == "iterative" )
        {
            return factorial_iterative(n);
        }
        if(type == "recursive")
        {
            return factorial_recursive(n);
        }
        return 0;
    }
    public int factorial_iterative(int n){
        int total = 1;
        int i = 1;
        while(i<=n) {
            total*=i;
            i++;
        }
        return total;
    }
    public int factorial_recursive(int n){
        if (n <= 1) {
            return 1;
        }
        else {
            return n * factorial_recursive(n - 1);
        }
    }
}
