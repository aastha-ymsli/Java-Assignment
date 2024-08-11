package Assignment;

public class Capsfirst {

	public static String capitalizeWords(String input) { 
        
        String[] words = input.split("\\s"); 
        StringBuilder result = new StringBuilder(); 
  
        
        for (String word : words) { 
            result.append(Character.toTitleCase(word.charAt(0))) 
                  .append(word.substring(1)) 
                  .append(" "); 
        } 
  
        return result.toString().trim(); 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "welcome to java development"; 
        String result = capitalizeWords(input); 
        System.out.println("Input: " + input); 
        System.out.println("Output: " + result); 
	}

}
