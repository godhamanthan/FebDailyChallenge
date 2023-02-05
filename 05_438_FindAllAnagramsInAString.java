class Solution {    
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> answer = new ArrayList<>();
        
        if(s == null || s.length() == 0 || s.length() < p.length()) {
            return answer;
        }

        int freqData[] = new int['z' - 'a' + 1];
        
        for(int i=0; i<p.length(); i++) {
            freqData[p.charAt(i) - 'a']++;
        }
        
        int left = 0;
        int right = 0;
        
        int countToHit = p.length();
        
        for(right=0; right<p.length(); right++) {
            
            freqData[s.charAt(right) - 'a']--;
            
            if(freqData[s.charAt(right) - 'a'] >= 0) {
                countToHit--;
            }
        }
        
        if(countToHit == 0) {
            answer.add(left);
        }
        
        while(right < s.length()) {
            if(freqData[s.charAt(left) - 'a'] >= 0) {
                countToHit++;
            }
            
            freqData[s.charAt(left) - 'a']++;
            
            left++;
            
            if(countToHit == 0) {
                answer.add(left);
            }
            
            freqData[s.charAt(right) - 'a']--;
            
            if(freqData[s.charAt(right) - 'a'] >= 0) {
                countToHit--;
            }
            
            if(countToHit == 0) {
                answer.add(left);
            }
            
            right++;
        }

        return answer;
    }
}
