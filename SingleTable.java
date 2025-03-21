public class SingleTable
{
private int seats;
private double quality;
private int height;
public SingleTable(int s, double q, int h)
{
    seats = s;
    quality = q;
    height = h;
}
/** Returns the number of seats at this table. The value is always greater than or equal to 4. */
public int getNumSeats()
{
    return seats;
}
/** Returns the height of this table in centimeters. */
public int getHeight()
{ 
    return height;
}
/** Returns the quality of the view from this table. */
public double getViewQuality()
{ 
    return quality;
}
/** Sets the quality of the view from this table to value . */
public void setViewQuality(double value)
{
    quality = value;
}
// There may be instance variables, constructors, and methods that are not shown.
}