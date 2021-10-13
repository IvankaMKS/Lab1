package Lab1.Task1;

public class Task1 {

    public static void main(final String[] args){
        final String [] arraySort = {"What ", "a ", "lovely", "day", "it", "is"};
        printArrayString (arraySort);
        sortArrayString (arraySort);
        printArrayString (arraySort);
    }

    public static void printArrayString (final String[] arraySort){
        for(final String str: arraySort){
            System.out.println(str);
        }
    }

    static void sortArrayString(final String[] arraySort) {
        for(int i = 1; i < arraySort.length; i++) {
            final String tmp = arraySort[i];

            int j=i-1;
            while (j >= 0 && tmp.length() > arraySort[j].length()){
                arraySort[j+1] = arraySort[j];
                j--;
            }
            arraySort[j+1] = tmp;
        }
    }
}




