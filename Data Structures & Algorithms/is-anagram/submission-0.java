class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            int index_s = s.charAt(i) - 'a';
            int index_t = t.charAt(i) - 'a';

            count[index_s]++;
            count[index_t]--;
        }

        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }
}
