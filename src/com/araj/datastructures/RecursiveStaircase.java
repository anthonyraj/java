import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class RecursiveStaircase {

	public static void readSteps(){
		Scanner s = new Scanner(System.in);
		Boolean hasData = s.hasNextLine();
		List<String> data = new ArrayList<String>();

		while(hasData) {
			data = s.nextLine().split(" ");
			System.out.println("data.length=" + data.size);
			hasData = s.hasNextLine();
		}
		s.close();

	}

	public static void main(String[] args){
			readSteps();
	}
}
