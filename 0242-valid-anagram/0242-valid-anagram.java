class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=s.length();
        int s2=t.length();

        if(s1 != s2){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s1;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<s2;j++){
            char c=t.charAt(j);
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        for(int count : map.values()){
            if(count != 0){
                return false;
            }

        }
        return true;
        
     
    }
}