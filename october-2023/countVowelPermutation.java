public class countVowelPermutation {
     public int vowelPermutations(int n) {
        long mod = 1000000007;
        long a=1,e=1,i=1,o=1,u=1;

        for(int j = 1; j < n;j++){
            long aNext = e;
            long eNext = (a+i) % mod;
            long iNext = (a+e+o+u) % mod;
            long oNext = (i+u) % mod;
            long uNext = a;

            a = aNext;
            e=eNext;
            i=iNext;
            o=oNext;
            u=uNext;
        }


        return (int) ((a+e+i+o+u )% mod);
    } 
}
