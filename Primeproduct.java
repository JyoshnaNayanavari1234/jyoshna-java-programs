class Primeproduct{
    public static void main(String[] args){
        int n=357;
        int product=1;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
            n=n/10;
            product=product*digit;
            }
            System.out.println("product" + product);
        }
    }
