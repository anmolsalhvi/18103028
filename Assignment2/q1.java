
import java.util.Scanner;

public class Main {

    static int compare(String a, String b)
    {
        for(int i=0;i<a.length() && i<b.length();i++)
        {
            char c=a.charAt(i);
            char d=b.charAt(i);
            if(c>d) return 1;
            else if(d>c) return -1;
        }
        if(a.length()>b.length()) return 1;
        if(b.length()>a.length()) return -1;
        return 0;
    }

    public static void main(String[] args) {

	    Scanner scanner=new Scanner(System.in);

		Syetem.out.println("Enter first string: ");
	    String a=scanner.nextLine();
		System.out.println("Enter second string: ");
	    String b=scanner.nextLine();

	    int comp=compare(a, b);

	    if(comp>0) System.out.println("First string is lexicographically greater! ");
	    else if(comp==0) System.out.println("Both the strings are lexicographically equal! ");
	    else System.out.println("Second string is lexicographically greater! ");

	    scanner.close();

    }
}
