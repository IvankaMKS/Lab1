package Lab1.Task2;

public class Task2 {

    public static void main(final String[] args)
    {
        final String string =  "Everyone is the creator of one’s own fate\n" ;
        final char s = 'r';

        System.out.println (string);
        printNumberOfChar (string,s);
    }

    public static int numChar(final String string, final char c)
    {
        int res = 0;
        for (int i=0; i<string.length(); i++)
        {
            if (string.charAt(i) == c){
                res++;
            }
        }
        return res;
    }

    static void printNumberOfChar(final String string, final char s)
    {
        System.out.println ( "Total number of char \""+s+"\" in a string: " + numChar (string,s)) ;
    }

}
