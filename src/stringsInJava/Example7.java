package stringsInJava;

import java.util.Arrays;

class Solution {
    public String[] findWords(String[] words) {

        String prefix[] = {"qwertyuiop","asdfghjkl","zxcvbnm"};

        // int row1 = 0;
        // int row2 = 0;
        // int row3 = 0;
        String[] ans = new String[words.length];
        // String ans = "";
        int index = 0;
        int row = -1;
        // List<String> ans = new LinkedList<String>();
        boolean flag = true;

        for(String word : words)
        {
            String lowerCaseWord = word.toLowerCase();
            char x = lowerCaseWord.charAt(0);
            if(x == 'q' || x == 'w' || x == 'e' || x == 'r' || x == 't' || x == 'y' || x == 'u'  || x == 'i' || x == 'o' || x == 'p') row = 0;
            else if(x == 'a' || x == 's' || x == 'd' || x == 'f' || x == 'g' || x == 'h' || x == 'j'  || x == 'k' || x == 'l') row = 1;
            else row = 2;

            flag = true;
            for(char c  : lowerCaseWord.toCharArray())
            {
                if(!prefix[row].contains(c+""))
                {
                    flag  = false;
                    break;
                }
            }

            if(flag)
            {
                // ans.add(word);
                ans[index++] = new String(word);
                // ans = ans + word + " ";
            }

        }

        // return ans.toArray();
        // ans = ans.trim();

        // return ans.split(" ");
        return Arrays.copyOf(ans,index);
    }
}

public class Example7 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] ans = {"qwee"};
        sol.findWords(ans);
    }
}
