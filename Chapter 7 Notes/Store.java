import java.util.ArrayList;
/**
 * Store
 *
 * @author ethanlhe
 * @version January 11th 2019
 */
public class Store
{
    ArrayList<Customer> customers = new ArrayList<Customer>();
    
    /**
     * Constructor for objects of class Store
     */
    public Store()
    {
        customers = new ArrayList<Customer>();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addSale(String customerName, double amount)
    {
        customers.add(new Customer(customerName, amount));
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Customer nameOfBestCustomer()
    {
        double max = 0;
        String best = null;
        for(Customer customer : customers)
        {
            if(customer.getSales() > max)
            {
                max = customer.getSales();
                best = customer.getName();
            }
        }
        return new Customer(best, max);
    }
}
