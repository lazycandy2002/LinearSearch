/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;


public class Linear {

    int[] elements;

    public Linear() {

    }

    void setArray_Length(int length) {
        elements = new int[length];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = (int) (Math.random() * 100);

        }
    }

    void Display() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);

        }
    }

    void search(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (element == elements[i]) {
                System.out.println("Seached element found @ index" + i);

            }

        }
    }

    void MaxValue() {
        int maxValue = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > maxValue) {
                maxValue = elements[i];

            }
        }
        System.out.println("The maximum value is " + maxValue);
    }

    void MinValue() {
        int minValue = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < minValue) {
                minValue = elements[i];

            }
        }
        System.out.println("The minimum value is " + minValue);
    }
}
