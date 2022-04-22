import java.util.Scanner;

public class PerfectNumber {
    
    public void isPerfect() {
        
        System.out.println("Please enter the number: ");
        
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        
        int sum =0;
        
        // 6 - 1,2,3,4,5 till 6
        
        for(int i=1; i<number; i++) {
            
            if(number % i == 0) {
                
                sum += i; // sum = sum + i;
                
                
            }
        }
        
        if(sum == number) {
            
            System.out.println(number +" is a Perfect Number");
            
        }else{
            
            System.out.println(number +"is not a Perfect Number");
        }
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        PerfectNumber pn = new PerfectNumber();
        pn.isPerfect();
        
        
        }
        
}