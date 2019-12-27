package com.company;

public class SortingStudentsByGPA implements Comparator {
    private Student[] array = new Student[9];

    public int getArrayLength(){
        return array.length;
    }

    public boolean compare(Student a, Student b){
        if (a.getAverage_score() >= b.getAverage_score()){
            return true;
        } else {
            return false;
        }
    }

    public void initArray(){
        for (int i = 0; i < array.length; i++) {
            String name = "" + i;
            array[i] = new Student(name);
        }
    }

    public void printArray(){
        for (int i = 0; i < array.length-1; i++)
            System.out.print(array[i].getAverage_score() + ", ");
        System.out.println(array[array.length-1].getAverage_score());
    }

    public void quickSort(int front, int rear){
        if (front >= rear)
            return;
        int i = front, j = rear;
        int cur = i - (i - j)/2;
        while (i < j) {
            while (i < cur && compare(array[cur], array[i]))
                i++;
            while (j > cur && compare(array[j], array[cur]))
                j--;
            if (i < j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        quickSort(front, cur);
        quickSort(cur+1, rear);
    }
}
