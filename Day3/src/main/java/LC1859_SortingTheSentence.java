public class LC1859_SortingTheSentence {
  String[] words = s.split(" ");
        String[] newS = new String[words.length];
        for(String word: words){
            int k = word.length();
            int index = word.charAt(k-1) - 1 -'0';
            newS[index] = word.substring(0,k-1);
        }
        return  String.join(" ", newS);
}
