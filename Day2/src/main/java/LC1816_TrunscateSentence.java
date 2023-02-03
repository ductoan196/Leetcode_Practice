public class LC1816_TrunscateSentence {
    public String truncateSentence(String s, int k) {
        String[] newS = s.split(" ");
        String sentence = "";
        for (int i = 0; i < k; i++) {
            sentence += newS[i] + " ";
        }
        return sentence.trim();
    }
}
