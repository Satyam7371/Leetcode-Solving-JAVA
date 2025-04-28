class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0) + 1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        StringBuilder ans = new StringBuilder();
        int maxFreq = 0;
        for(Map.Entry<Character,Integer> entry : list) {
        
                ans.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return ans.toString();
    }
}
