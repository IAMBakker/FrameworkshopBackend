package model.customer;

public class Prestashop
{
    private Customer customer;

    public Customer getCustomer ()
    {
        return customer;
    }

    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [customer = "+customer+"]";
    }
}