package assignment;

import java.util.*;

public class RemoveDuplicate {
	static String removeDuplicate(char str[], int n)
    {
        int index = 0;
 
        for (int i = 0; i < n; i++)
        {
 
          int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
    public static void main(String[] args)
    {
        char str[] = "ShraddhaSahu".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }

}
