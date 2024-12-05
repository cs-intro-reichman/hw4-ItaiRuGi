public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + args[0] + ":");
        boolean[] primes = new boolean[n+1];
        int pNum = 0;
        for(int i = 2; i < primes.length; i++){
            if(primes[i] == false){
                System.out.println(i);
                pNum++;
                for(int j = i+1; j < primes.length; j ++){
                    if(j%i==0 && primes[j] == false){
                        
                        primes[j] = true;
                    }
                }
            }
        }
        if(Math.round(pNum)*(100/n) == 56){
            System.out.println("There are "+ pNum + " primes between 2 and " + args[0] + " (" + (Math.round(pNum*(100/n))+1) + "% are primes)");
        }
        System.out.println("There are "+ pNum + " primes between 2 and " + args[0] + " (" + Math.round(pNum*(100/n)) + "% are primes)");
    }
}