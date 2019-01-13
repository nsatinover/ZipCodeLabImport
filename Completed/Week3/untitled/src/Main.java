import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        //get highest int number
        //loop through till highest number
        //count every time there's a break and another start at that number

        int[] A = new int[11];
        A[0]  = 1;
        A[1]  = 3;
        A[2]  = 2;
        A[3]  = 1;
        A[4]  = 2;
        A[5]  = 1;
        A[6]  = 5;
        A[7]  = 3;
        A[8]  = 3;
        A[9]  = 4;
        A[10] = 2;

        int highest = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > highest){
                highest = A[i];
            }
        }

        int brushStrokes = 0;
        boolean lastTooShort = false;
        boolean rowStrokeAdded = false;

        for (int i = 1; i <= highest; i++) {
            for (int j = 0; j < A.length; j++) {

                if ((A[j] >= i) && lastTooShort == true) {
                    brushStrokes++;
                    lastTooShort = true;
                    rowStrokeAdded = true;
                }
                else {
                    lastTooShort = false;
                }

            }
            if (rowStrokeAdded == false){
                brushStrokes++;
            }
            rowStrokeAdded = false;
            lastTooShort = false;

        }

        System.out.println(brushStrokes); //return brushStrokes;

    }
}








