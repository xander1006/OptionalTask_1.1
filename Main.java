import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Vvedite kol-vo chisel: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        ArrayList <Integer> arrayList = new ArrayList<>();
        int i = 1;
        while (i <= number){
            arrayList.add(scan.nextInt());
            i++;
        }

        String lengthStr =String.valueOf(arrayList.get(0));
        int line;
        int min = lengthStr.length();
        for (Integer l:arrayList) {
            lengthStr = String.valueOf(arrayList.get(l-1));
            line = lengthStr.length();
            if (line < min){ min = line; }
            System.out.println(min);
      
        }

    }
}
