
public class EvenPrime {

    public static void main(String[] args) {
        int n = 5;
        int count=0;
        boolean isPrime = true;
        while (n <= 5) {
            if (n % 2 == 0) isPrime=true;
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n);
                count+=1;
        
            
            }
           
           
        }
    }
}
