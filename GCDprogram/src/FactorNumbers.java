// This class computes the gcd of m and n by using the prime factors
// of m and n
//
// gcd() method written by YOUR NAME HERE

public class FactorNumbers extends GCDAlgorithm
{
  private int[] primes;

  public FactorNumbers(int max)
  {
    super("Factoring");
    primes = findPrimes(max);
  }


  // findPrimes() returns an array containing all primes up to n
  // (including n if it is prime).  It implements a variation of the
  // Sieve of Eratosthenes (see page 7 of your text).
  // WARNING: if n > 100000, this method may take a fair bit of time
  // and memory to compute the primes.
  public static int[] findPrimes (int n)
  {
    int i, j;
    int[] primesFound = new int[n];
    int[] primeList;
    int numPrimes = 0;

    System.out.print("Computing primes: ");
    System.out.flush();

    // For each i between 2 and n, determine whether it is prime
    for (i = 2; i <= n; i++)
    {
      // i is prime if it is not divisible by any of the previous
      // primes we've already found
      for (j = 0; j < numPrimes; j++)
      {
        if (i % primesFound[j] == 0)    // i is divisible by primesFound[j]
          break;
      }
      if (j == numPrimes)
      {
        // assertion: In the previous for loop, we made it to the end
	// of the loop without finding a divisor of i; therefore, i is
	// prime.
        primesFound[j] = i;
        numPrimes++;
      }
    }
    // Copy the array of primes that we found into a smaller array
    System.out.println(numPrimes + " primes found");
    primeList = new int[numPrimes];
    System.arraycopy(primesFound, 0, primeList, 0, numPrimes);
    return primeList;
  }


  public int gcd(int m, int n)
  {
//    int[] nPrimes = findPrimes(n);
//   int num1 = m;
//   if(mod(num1,nprimes[])==0){
	   return 0;
   }
   
  }

