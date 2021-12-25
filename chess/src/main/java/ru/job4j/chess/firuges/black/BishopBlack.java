package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int delta = dest.getX() - this.position.getX();
        int size = Math.abs(delta);
        Cell[] steps = new Cell[size];
        int deltaX = (delta) / size;
        int deltaY = (dest.getY() - this.position.getY()) / size;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(this.position.getX() + deltaX * (index + 1),
                    this.position.getY() + deltaY * (index + 1));
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(source.getX() - dest.getX()) == Math.abs(source.getY() - dest.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
