package com.ironhack.main;

public class Main {
    public static void main(String[] args) {
        int[]   array1 = {5, 4, 3, 2, 1};
        int[]   array2 = {1, 2, 3, 4, 5};

        multiply(array1);
        invert(array2);

        System.out.println("Ejercicio 1:");
        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }
        System.out.println("Ejercicio 2:");
        for (int i = 0; i < array2.length; i++)
        {
            System.out.println(array2[i]);
        }
    }

    public static int[] multiply(int[] array1)
    {
        int     aux;

        aux = array1[0];
        for (int i = 0; i < array1.length; i++)
        {
            if (i == array1.length - 1)
                array1[i] *= aux;
            else
                array1[i] *= array1[i + 1];
        }
        return array1;
    }

    public static int[] invert(int[] array2)
    {
        int aux;

        for (int i = 0; i < array2.length/2; i++)
        {
            aux = array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = aux;
        }
        return array2;
    }
}
