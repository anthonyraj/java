
public class FindVowel {

	private class Result{
		private int vowelCount = 0;
		private int consonantCount = 0;
		
		public int getVowelCount() { return this.vowelCount; }
		
		public void setVowelCount(int vowelCount) { this.vowelCount = vowelCount; } 

		public int getConsonantCount() { return this.consonantCount;}

		public void setConsonantCount(int consonantCount) { this.consonantCount = consonantCount; }

		public void incrementVowel() { this.vowelCount += 1; }

		public void incrementCons() { this.consonantCount += 1; }
	}

	public Result find(String data) {
		String vowelString = "aeiouy";

		Result result = new Result();
		for (char letter: data.toLowerCase().trim().toCharArray()) {
			if (vowelString.indexOf(letter) != -1)  {
				result.incrementVowel();
			} else if (letter != ' ') {
				result.incrementCons();
			}
		}
		return result;
	}


	public static void main(String[] args) { 
		String[] data = {"HellO", " there is a quiet Mouse", "I am happy "};
		FindVowel finder = new FindVowel();
		for (String input: data) {
			System.out.println(input);
			Result result = finder.find(input);
			System.out.println(result.getVowelCount() + "Vowels " + result.getConsonantCount() + " Consonants");
		}
	}
}
