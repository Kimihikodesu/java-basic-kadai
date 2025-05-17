package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		 Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

	       
	        String[] wordsToSearch = { "apple", "banana", "grape", "orange" };

	        
	        for (String word : wordsToSearch) {
	            String result = dictionary.search(word);
	            System.out.println(result);
	        }

	}

}
