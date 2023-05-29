//leet code add 2 binary strings
// 14-02-2023
import java.util.Scanner;
public class lsum
{
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int sum = 0;
        StringBuilder result =  new StringBuilder();
        while(i>=0 || j>=0 || carry == 1)
        {
            sum = carry;
            if(i>=0) sum = sum+a.charAt(i)-'0';
            if(j>=0) sum = sum+b.charAt(j)-'0';
            result.append((char)(sum%2+'0'));
            carry = sum/2;
            i--;
            j--;
        }
        return result.reverse().toString();
        
        // idu run aytu submit aaglilla
        /*int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
        return result;*/
     }
     public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String x=s.next();
        String y=s.next();
        System.out.println(addBinary(x, y));
    }
}
