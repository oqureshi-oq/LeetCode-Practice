public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if(strs == null)
            return null; 
        
        StringBuilder encodedSB = new StringBuilder(); 
        
        for(String str: strs){
            encodedSB.append(str.length()); 
            encodedSB.append(' '); 
            encodedSB.append(str); 
        }
        
        return encodedSB.toString(); 
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        if(s == null)
            return null; 
        
        List<String> list = new ArrayList(); 
        
        int i = 0;
        while(i < s.length()){
            StringBuilder str = new StringBuilder(); 
            int nextSpaceIndex = s.indexOf(' ', i); 
            int length = Integer.parseInt(s.substring(i, nextSpaceIndex));
            i = nextSpaceIndex + 1; 
            
            for(int j = 0; j < length; j++){
                str.append(s.charAt(i++));
            }
            
            list.add(str.toString()); 
        }
        
        return list; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));