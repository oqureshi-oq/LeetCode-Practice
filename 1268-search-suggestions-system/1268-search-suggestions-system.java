class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        if(products == null || searchWord == null) return null; 
        
        Arrays.sort(products); 
        List<List<String>> list = new ArrayList(); 
        int left = 0; 
        int right = products.length-1; 
        StringBuilder prefix = new StringBuilder(); 
        
        for(char c: searchWord.toCharArray()){
            List<String> suggestions = new ArrayList(); 
            prefix.append(c); 
            while(left < products.length && products[left].indexOf(prefix.toString()) != 0){
                left++; 
            }
            
            for(int i = left; i < products.length && i < left+3; i++)
                if(products[i].indexOf(prefix.toString()) == 0)
                    suggestions.add(products[i]); 
            
            
            list.add(suggestions); 
        }
        
        return list; 
    }
}