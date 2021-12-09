package ru.job4j.puzzle;

import org.junit.Assert;
import org.junit.Test;

public class WinTest {
    @Test
    public void whenVerticalWin() {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        Assert.assertTrue(Win.check(board));
    }

    @Test
    public void whenHorizontalWin() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        Assert.assertTrue(Win.check(board));
    }

    @Test
    public void whenNotWin() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
        };
        Assert.assertFalse(Win.check(board));
    }

    @Test
    public void whenNotWinL() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0},
        };
        Assert.assertFalse(Win.check(board));
    }
}