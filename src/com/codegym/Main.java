package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {2, 4, 2, 4, 2},
                {1, 2, 1, 1, 2}
        };

        System.out.println("Mảng: ");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.printf("%d  ", elem);
            }
            System.out.println();
        }

        System.out.print("Nhập số thứ tự cột muốn tính (base 0): ");
        int col = sc.nextInt();
        if (col < 0 || col > arr[0].length) {
            System.out.printf("Cột %d nằm ngoài phạm vi mảng.\n", col);
        } else {
            int sum = 0;
            for (int[] row : arr) {
                sum += row[col];
            }
            System.out.printf("Tổng của cột %d là %d.", col, sum);
        }
    }
}
