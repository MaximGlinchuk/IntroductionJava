import java.util.Arrays;

public class HW_Task2 {
    public static void bublesort(String[] args) {
    int [] mas = {15, 2, 20, 12, 6};
 
    boolean isSorted = false;
    int buf;
    while(!isSorted) {
        isSorted = true;
        for (int i = 0; i < mas.length-1; i++) {
            if(mas[i] > mas[i+1]){
                isSorted = false;
 
                buf = mas[i];
                mas[i] = mas[i+1];
                mas[i+1] = buf;
            }
        }
    }
    System.out.println(Arrays.toString(mas));
    }
}
