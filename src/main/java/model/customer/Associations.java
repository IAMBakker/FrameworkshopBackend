package model.customer;

public class Associations
{
    private Groups groups;

    public Groups getGroups ()
    {
        return groups;
    }

    public void setGroups (Groups groups)
    {
        this.groups = groups;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [groups = "+groups+"]";
    }
}
