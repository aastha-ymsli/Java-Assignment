package Assignment;

public class FindDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 String string = "Becky was wearing a big black coat when she saw a big black dog on the street on black friday";    
	        int count;    
	       
	        string = string.toLowerCase();  
	        String words[] = string.split(" ");       
	        System.out.println("Duplicate words in a given string : ");     
	        for(int i = 0; i < words.length; i++) {    
	            count = 1;    
	            for(int j = i+1; j < words.length; j++) {    
	                if(words[i].equals(words[j])) {    
	                    count++;    
	                    words[j] = "0";    
	                }    
	            }    
	            if(count > 1 && words[i] != "0")    
	                System.out.println(words[i]);    
	}

}
}
