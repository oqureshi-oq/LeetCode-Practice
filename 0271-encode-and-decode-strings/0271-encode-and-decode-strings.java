public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(); 
        
        for(String str: strs){
            sb.append(str.length() + "#" + str);
        }
        
        return sb.toString(); 
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        if(s == null || s.length() == 0)
            return new ArrayList(); 
        
        List<String> list = new ArrayList(); 
        
        int i = 0;
        int j = 0;
        
        while(i < s.length()){
            while(s.charAt(j) != '#')
                j++; 
            
            int length = Integer.parseInt(s.substring(i, j));
            
            i = j+1; 
            j += length+1; 
            
            list.add(s.substring(i, j)); 
            
            i = j; 
        }
        
        return list; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));