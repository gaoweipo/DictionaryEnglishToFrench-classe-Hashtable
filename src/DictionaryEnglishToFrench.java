import java.util.Hashtable;
import java.util.Scanner;

public class DictionaryEnglishToFrench {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        Scanner sc=new Scanner(System.in);
        ht.put("hello","bonjour");
ht.put("city","ville");
ht.put("country","pays");
        System.out.println(ht);
if (ht.isEmpty())
    System.out.println("There is no word in the dictionary.");
else{
    System.out.println("Enter a word here:");
    String Key=sc.nextLine();
if (ht.containsKey(Key.toLowerCase()))
    System.out.println("The translation of the word "+Key.toLowerCase()+" est "+ht.get(Key.toLowerCase()));
else
    System.out.println("This word is not in the dictionary.");
}
    }

}