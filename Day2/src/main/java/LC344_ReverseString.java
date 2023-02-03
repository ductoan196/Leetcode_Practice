public class LC344_ReverseString {
    public void reverseString(char[] s) {
        int[] alphabet = new int['z'-'a'+1];
        char[]newS = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            newS[i] = s[s.length-i-1];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = newS[i];
        }
    }
}
