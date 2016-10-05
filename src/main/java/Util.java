import java.util.HashSet;

/**
 * Created by Sola2Be on 03.10.2016.
 *
 */
public class Util {

    private HashSet<Character> uSet;
    private String inString;
    private int uCount;

    /**
     * Save string and start search unique substring
     * @param str inputed string
     **/
    void check(String str) {
        this.inString = str;
        uniqueChars();
    }

    /**
     * Get set of unique characters and their count
     */
    private void uniqueChars() {

        if (inString.length() == 0)
            return;

        uSet = new HashSet<Character>();

        for (int i = 0; i < inString.length(); i++) {
            uSet.add(inString.charAt(i));
        }

        uCount = uSet.size();

        String answ = subStr(0);
        System.out.println(answ);
    }


    /**
     * Recursive method check for {@link #uCount} == count
     * of unique characters in substring
     * @param j substring start
     * @return unique substring in {@link #inString} if (@link #uCount ) == unique characters count
     * and call {@link #subStr(int)} in other case
     */
    private String subStr(int j) {
        if (j + uCount > inString.length())
            return null;
        String subStr = inString.substring(j, uCount + j);
        uSet = new HashSet<Character>();
        for (int i = 0; i < uCount; i++) {
            uSet.add(subStr.charAt(i));
        }
        if (uSet.size() == uCount)
            return subStr;
        else
            return subStr(++j);
    }
}
