//Array is pass by refrence its means its change in the actual value

public class PassingArray {

    public static void update(int marks[], int nonChangable) {
        nonChangable = 39;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int nonChangable = 5;

        update(marks, nonChangable);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        } // its changed

        System.out.println(nonChangable); /// its not change
    }
}
