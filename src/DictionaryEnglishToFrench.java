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

    }

}