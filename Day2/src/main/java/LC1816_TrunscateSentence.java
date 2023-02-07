public class LC1816_TrunscateSentence {
//    public String truncateSentence(String s, int k) {
//        String[] newS = s.split(" ");
//        String sentence = "";
//        for (int i = 0; i < k; i++) {
//            sentence += newS[i] + " ";
//        }
//        return sentence.trim();
//    }
    public String truncateSentence(String s, int k) {
        String[] newS = s.split(" ");
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < k-1; i++) {
            sentence.append(newS[i]).append(" ");
        }
        sentence.append(newS[k-1]);
        return sentence.toString();
    }

}
