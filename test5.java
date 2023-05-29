import java.util.*;
public class test5
{
		// TEST 4 , 7:00 PM (4-11-2022)
	
//	wildcard pattern matching
	 public static int rec(int idx, int idy, String text, String pat, int dp[][])
     {
		if (idx == 0 && idy == 0) 
			return 1;
		if (idy <= 0) 
			return 0;
		if (idx <= 0) {
			int flag = 1;
			for (int i = idy; i > 0; i--)
				if (pat.charAt(i - 1) != '*')
                {
					flag = 0;
					break;
				}
			return flag;
		}
		int ret = dp[idx][idy];
		if (ret != -1)
			return ret;
		ret = 0;
		if (text.charAt(idx - 1) == pat.charAt(idy - 1))
			ret |= rec(idx - 1, idy - 1, text, pat, dp);
		if (pat.charAt(idy - 1) == '?') 
			ret |= rec(idx - 1, idy - 1, text, pat, dp);
		if (pat.charAt(idy - 1) == '*') {
			ret |= rec(idx - 1, idy, text, pat, dp);
			ret |= rec(idx, idy - 1, text, pat, dp);
		}
		dp[idx][idy] = ret;
		return ret;
	}
    public static boolean wildcardMatching(String pattern, String text)
    {
		// Write your code here.
        int n = text.length();
		int m = pattern.length();
		int dp[][] = new int[n + 1][m + 1];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		if (rec(n, m, text, pattern, dp) == 1)
			return true;
		else
			return false;
	}
    
//	print like a wave
    public static int[] wavePrint(int arr[][], int nRows, int mCols) 
    {
		// Write your code here.
        int ans[] = new int[nRows*mCols];
        int k = 0;
        // Loop tp iterate through the columns given to us.
        for (int j = 0; j < mCols; j++)
        {
            // If the current column is even then we will add the elements from top to bottom.
            if (j % 2 == 0)
                for (int i = 0; i < nRows; i++)
                    ans[k++] = arr[i][j];
            // Else the elements will be add from bottom to top.
            else
                for (int i = nRows - 1; i >= 0; i--)
                   ans[k++] = arr[i][j];
        }
        return ans;
	}
    
//	edit distance
    /**/
    static int solve(String word1, String word2, int i, int j,int[][] dp)
    {
        if(i<0)
        	return j+1;
        if(j<0)
        	return i+1;
        if(dp[i][j] !=0)
        	return dp[i][j];
        if(word1.charAt(i) == word2.charAt(j))
            return solve(word1,word2,i-1,j-1,dp);
        int insert =1+ solve(word1,word2,i,j-1,dp);
        int delete = 1+solve(word1,word2,i-1,j,dp);
        int replace = 1+solve(word1,word2,i-1,j-1,dp);  
        return dp[i][j]=Math.min(insert,Math.min(delete,replace));
    }

	public static int editDistance(String s, String t)
	{
		//Your code goes here
        int[][] dp = new int[s.length()][t.length()];
        int res  = solve(s,t,s.length()-1,t.length()-1,dp);
        return res;
    }
	
//	replace spaces
	public static StringBuilder replaceSpaces(StringBuilder str)
	{
		// Write your code here.
        StringBuilder res = new StringBuilder();
		int len = str.length();
		for (int i = 0; i < len; i++)
		{
			if (str.charAt(i) == ' ')
				res.append("@40");
			else
				res.append(str.charAt(i));
		}
		return res;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
