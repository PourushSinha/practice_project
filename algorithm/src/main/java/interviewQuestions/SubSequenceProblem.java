package interviewQuestions;

/**
 * Created by pourush.sinha on 12/01/20.
 */

/*
* Given two strings str1 and str2. The task is to find the minimum number of characters to be replaced by $ in string str1 such that str1 does not contain string str2 as any substring.

Examples:

Input: str1 = "intellect", str2 = "tell"
Output: 1
4th character of string "str1" can be replaced by $
such that "int$llect" it does not contain "tell"
as a substring.

Input: str1 = "google", str2 = "apple"
Output: 0*/
public class SubSequenceProblem {
    static int getCount(String A, String B)
    {

        int n = A.length(), m = B.length();
        int count = 0, i, j;

        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {

                if(i + j >= n)
                    break;
                else if (A.charAt(i + j) != B.charAt(j))
                    break;
            }

            if (j == m)
            {
                count++;

            }
        }

        return count;
    }

    // Driver Code
    public static void main(String args[])
    {
        String str1 = "aaaa";
        String str2 = "aa";

        System.out.println(getCount(str1 , str2));
        int thereshold=2;
        System.out.println(getCount(str1 , str2) - thereshold);
    }
}
