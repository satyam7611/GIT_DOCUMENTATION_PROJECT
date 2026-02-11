import java.util.Scanner;

class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
        }

        
    }

    static Boolean isPrime(int i){
        int count=0;
        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                count++;
                break;
            }

        }
        if(count==0){
            return true;
        }
        else
        {
            return false;
        }
    }

}
