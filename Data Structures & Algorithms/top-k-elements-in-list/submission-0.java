class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
        Calculate the frequency of each element
        Implement a max heap that will keep track of the most frequent elements
        Return the top k elements of the max heap
        */

        Map<Integer, Integer> freq = new HashMap<>();

        // calculate the freq of each element
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // set up max heap
        PriorityQueue<int[]> max_heap = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]);

        // add all unique numbers to the max heap
        for(Map.Entry<Integer, Integer> freq_element: freq.entrySet()){
            int key = freq_element.getKey();
            int value = freq_element.getValue();
            max_heap.add(new int[]{value, key});
        }

        int[] result = new int[k];
        int count = 0;

        while(!max_heap.isEmpty() && count < k){
            int[] top = max_heap.poll();
            result[count] = top[1];
            count++;
        }
        
        return result;
    }
}
