import java.util.*;
public class Main
{
    static void simplify(char[] a)
    {
        int size = a.length;
        for(int i = 0; i < size; i++ ) {
            for(int j = i+1; j < size; j++) {
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = (char) temp;
                }
            }
        }
    }

    static boolean anagrams(String a, String b)
    {
        char a1[]=a.toCharArray();
        char a2[]=b.toCharArray();
        simplify(a1);
        simplify(a2);
        for(int i=0;i<a.length();i++)
        {
            if(a1[i]==a2[i]) continue;
            else return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the string in which you want to search in");
        Scanner scan=new Scanner(System.in);
        String text=scan.nextLine();
        System.out.println("Enter the substring you want to search");
        String pattern=scan.nextLine();
        int count=0;
        for(int i=0, j=pattern.length();j<=text.length();i++, j++)
        {
            if( anagrams(text.substring(i, j), pattern) ) count++;
        }
        System.out.println("The number of times the above pattern appears in the given string is :: "+count);
    }
}
