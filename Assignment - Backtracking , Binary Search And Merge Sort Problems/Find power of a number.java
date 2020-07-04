
import java.util.*;
public class Solution {
    
    public static int getPower(int x , int n){
        if(n==0)return 1;
        return x * getPower(x , n-1);
    }
    
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(getPower(x,n));
    }
}
