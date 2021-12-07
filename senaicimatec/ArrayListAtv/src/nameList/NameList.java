package nameList;
import java.util.ArrayList;

public class NameList {

	public static void main(String[] args) {
		ArrayList<String> listaNomes = new ArrayList<String>();
		listaNomes.add("Franklin");
		listaNomes.add("Westn");
		listaNomes.add("Senai");
		listaNomes.add("Cimatec");
		listaNomes.add("Java");
		for(int i = listaNomes.size()-1; i>=0;i--) {
			System.out.println(listaNomes.get(i));
		}
	}

}
