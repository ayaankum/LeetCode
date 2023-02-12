class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = countWord(sentences[0]);
        for(int i=1;i<sentences.length;i++){

            if(countWord(sentences[i]) > max)
             max = countWord(sentences[i]);

        }

        return max;


    }
    
    
    public  int countWord(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    String[] words = input.split("\\s+");
    return words.length;
  }
}