/**
 * Customer
 *
 * @author ethanlhe
 * @version January 11th 2019
 */
public class Customer
{
    private String name;
    private double sales;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name1, double numSales)
    {
        // initialise instance variables
        name = name1;
        sales = numSales;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getSales()
    {
        return this.sales;
    }
}