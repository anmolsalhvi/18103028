import java.util.*;

public class Main {

    static String transform(String s)
    {
        String word=s;
        word=word.substring(0, 1);
        for(int i=1;i<s.length();i++)
        {
            word=word+"*";
        }
        return word;
    }

    static boolean notAChar(char c)
    {
        return !( ( c>='a' && c<='z' ) || ( c>='A' && c<='Z' ) );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paragraph : ");
        String para = scanner.nextLine();
        System.out.println("Enter the list of words you want to search : ");
        String ListOfWords = scanner.nextLine();
        String[] list = ListOfWords.split(" ");
        String[] newPara = para.split(" ");
        String ChangedPara = "";
        for (int i = 0; i < newPara.length; i++) {
            String word = newPara[i];
            String start = "", end = "";
            for (int j = 0; j < list.length; j++) {
                String version = newPara[i];
                if (notAChar(version.charAt(0))) {
                    start = version.substring(0, 1);
                    version = version.substring(1);
                }
                if (version.length() > 0 && notAChar(version.charAt(version.length() - 1))) {
                    end = version.substring(version.length() - 1, version.length());
                    version = version.substring(0, version.length() - 1);
                }
                if (version.equals(list[j])) {
                    word = start + transform(version) + end;
                    break;
                }
            }
            ChangedPara = ChangedPara + " " + word;
        }
        ChangedPara = ChangedPara.substring(1);
        System.out.println("Changed Paragraph is : " + ChangedPara);
    }
}
