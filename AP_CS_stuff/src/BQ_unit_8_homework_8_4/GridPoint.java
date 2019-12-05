package BQ_unit_8_homework_8_4;

public class GridPoint
{
    private int x;
    private int y;

    public GridPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}