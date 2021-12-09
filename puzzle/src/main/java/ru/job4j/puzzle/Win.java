package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHor(board, i) || checkVer(board, i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHor(int[][] board, int index) {
        for (int i = 0; i < board[index].length; i++) {
            if (board[index][i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkVer(int[][] board, int index) {
        for (int[] ints : board) {
            if (ints[index] != 1) {
                return false;
            }
        }
        return true;
    }
}
