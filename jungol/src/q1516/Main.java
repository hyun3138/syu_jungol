package q1516;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("END")) {
				break;
			}
			String[] words = str.split("\\s+");
			Map<String, Integer> count = new HashMap<>();
			
			for(String word : words	 ) {
				word = word.trim();
				if(!word.isEmpty()) {
					count.put(word,  count.getOrDefault(word, 0) + 1);
				}
			}
			List<Map.Entry<String, Integer>> sortedEntry = new ArrayList<>(count.entrySet());
			sortedEntry.sort(Map.Entry.comparingByKey());
			for(Map.Entry<String, Integer> entry : sortedEntry) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		sc.close();
	}
}
