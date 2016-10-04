import java.util.HashSet;

/**
 * Created by Sola2Be on 03.10.2016.
 */
public class Util {

    private HashSet<Character> uSet;
    private String inString;
    private int uCount;

    public Util(String str) {
        this.inString = str;
    }

    public String uniqueChars() {

        if (inString.length() == 0)
            return null;
        uSet = new HashSet<Character>();
        for (int i = 0; i < inString.length(); i++) {
            uSet.add(inString.charAt(i));
        }
        uCount = uSet.size();

        String answ = subStr(0);
        System.out.println(answ);

        return answ;
    }

    private String subStr(int j) {
        if (j+uCount > inString.length())
            return null;
        String subStr = inString.substring(j,uCount+j);
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
