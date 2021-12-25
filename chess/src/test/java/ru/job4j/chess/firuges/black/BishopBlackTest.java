package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import javax.swing.text.Position;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void positionCorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        int[] expected = {bishopBlack.position().getX(),
                bishopBlack.position().getY()};
        int[] actual = {Cell.C1.getX(), Cell.C1.getY()};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void copyCorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        int[] expected = {bishopBlack.copy(Cell.D2).position().getX(),
                bishopBlack.copy(Cell.D2).position().getY()};
        int[] actual = {Cell.D2.getX(), Cell.D2.getY()};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void wayCorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void wayCorrectAnother() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C3);
        Cell[] actual = bishopBlack.way(Cell.A5);
        Cell[] expected = {Cell.B4, Cell.A5};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void wayIncorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C3);
        Cell[] actual = bishopBlack.way(Cell.C5);
    }
}