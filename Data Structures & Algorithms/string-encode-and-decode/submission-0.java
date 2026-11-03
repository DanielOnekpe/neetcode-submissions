class Solution {
    /*
    For each string keep the length and # and then the actual String
    For encoding 
    For decoding we then loop through till we get # and then get the substring to then get the string will be after # and then add the length of the string  
    */

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        // For each string keep the length and # and then the actual String
        for(String str: strs){
            res.append(str.length()).append("#").append(str);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> res = new LinkedList<>();

        while(i < str.length()){
            int j = i;
            // get the index of the length delimeter
            while(str.charAt(j) != '#'){
                j++;
            }

            // get the len chars from i to j #excluded
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + len;

            String decoded = str.substring(i, j);
            res.add(decoded);
            i = j;
        }

        return res;
    }
}
