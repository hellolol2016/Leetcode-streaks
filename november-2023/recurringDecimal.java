import java.util.*;
public class recurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {

        StringBuilder ans = new StringBuilder();

        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))
            ans.append("-");
        
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);

        long quotient = num / den;

        ans.append(quotient);
        long rem = num % den;
        if(rem == 0){
            return ans.toString();
        }

        ans.append(".");
        Map<Long, Integer> rems = new HashMap<>();
        while(rem != 0){
            if(rems.containsKey(rem)){
                int pos = rems.get(rem);
                ans.insert(pos,"(");
                ans.append(")");
                return ans.toString();
            }else{
                rems.put(rem,ans.length());
                rem *= 10;
                quotient = rem/ den;
                rem %= den;
                ans.append(String.valueOf(quotient));
            }
        }

        return ans.toString();
    }
}
