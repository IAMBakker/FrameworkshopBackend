package model.customer;

public class Groups
{
    private String api;

    private String nodeType;

    private Group group;

    public String getApi ()
    {
        return api;
    }

    public void setApi (String api)
    {
        this.api = api;
    }

    public String getNodeType ()
    {
        return nodeType;
    }

    public void setNodeType (String nodeType)
    {
        this.nodeType = nodeType;
    }

    public Group getGroup ()
    {
        return group;
    }

    public void setGroup (Group group)
    {
        this.group = group;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [api = "+api+", nodeType = "+nodeType+", group = "+group+"]";
    }
}
