package de.seyfarth.tutorium.revert;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7};
        Integer[] integers = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(revertIntArray(ints)));
        revertArray(integers);
        System.out.println(Arrays.toString(integers));
    }
    
    public static int[] revertIntArray(int[] array) {
        int[] reverted = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            reverted[reverted.length - 1 - index] = array[index];
        }
        return reverted;
    }
    
    public static void revertArray(Object[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            Object temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
    }
}
