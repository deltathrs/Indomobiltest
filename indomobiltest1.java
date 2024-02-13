import java.util.Scanner;
import java.util.ArrayList;

public class indomobiltest1
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word = word.concat(" ");
        int StringSize = word.length();
		System.out.println("Kalimat : "+word);
		
		
		ArrayList<String> kalimat = new ArrayList<String>();
		String kata = "";
		for(int i=0;i<StringSize;i++) {
		    kata = kata + word.charAt(i);
		    if(Character.isWhitespace(word.charAt(i))){
		        kalimat.add(kata);
		        kata = "";
		    }
		}
		
		System.out.print("Kebalikan :");
		for(int i= kalimat.size();i>0;i--){
		    System.out.print(kalimat.get(i-1));
		}

	}
}