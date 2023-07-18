import java.util.Scanner;

public class ToggleCase
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();

        findToggleCase(str);
    }
    public static void findToggleCase(String str)
    {
        int length=str.length();
        char c[]=str.toCharArray();
        for(int i=0;i<length;i++)
        {
            int a=(int)c[i];
            int b=a^(1<<5);
            c[i]=(char)b;
            System.out.print(c[i]);
        }
    }
}
