/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author makul
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Linear sample = new Linear();

        sample.setArray_Length(20);
        sample.Display();
        sample.search(21);
        sample.MaxValue();
        sample.MinValue();

    }

}
