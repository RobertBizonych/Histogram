package com.trainings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Tigra
 * Date: 2/8/12
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Histogram {

    private int mark;
    private File markFile;

    public int getMark() {
        return mark;
    }

    public Histogram() {
        mark = 0;
        markFile = new File("files\\MidtermScores.txt");
    }

    public void show(){
        try {
            Marks();
            Marks2();
            Marks3();
            Marks4();
            Marks5();
            Marks6();
            Marks7();
            Marks8();
            Marks9();
            Marks10();
            Marks11();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void Marks() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("00-09: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score < 10) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }

    }    //----------------------

    public void Marks2() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("10-19: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 10 && score < 20) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }

    }

    public void Marks3() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("20-29: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 20 && score < 30) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }

    public void Marks4() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("30-39: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 30 && score < 40) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }

    public void Marks5() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("40-49: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 40 && score < 50) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }

    public void Marks6() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("50-59: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 50 && score < 60) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }

    public void Marks7() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("60-69: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 60 && score < 70) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }

    public void Marks8() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("70-79: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 70 && score < 80) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }

    public void Marks9() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("80-89: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 80 && score < 90) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }

    public void Marks10() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("90-99: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score >= 90 && score < 100) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }

    public void Marks11() throws FileNotFoundException {
        Scanner markScanner = new Scanner(markFile);
        char markCounter = '*';
        try {
            System.out.print("  100: ");
            while (markScanner.hasNextInt()) {
                int score = markScanner.nextInt();
                if (score == 100) {
                    System.out.print(markCounter);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } finally {
            markScanner.close();
        }
    }


    public static void main(String[] args) {
        Histogram result = new Histogram();
        result.show();
    }


}