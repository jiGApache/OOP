package com.company;

public class Main {

    public static void main(String[] args) {
        SortingStudentsByGPA ssbpga = new SortingStudentsByGPA();
        ssbpga.initArray();
        ssbpga.printArray();
        ssbpga.quickSort(0, ssbpga.getArrayLength()-1);
        ssbpga.printArray();
    }
}
