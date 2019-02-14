import java.util.*;
class SortByPolicyNumber implements Comparator<Insurance>
{
    private String res;
    public SortByPolicyNumber(String in)
    {
        this.res = in;
    }
    
    public int compare(Insurance a, Insurance b)
    {
        if(res.equals("ASC"))
        return a.getPolicyNumber()-b.getPolicyNumber();
        else
        return b.getPolicyNumber()-a.getPolicyNumber();
    }
}

class SortByPolicyName implements Comparator<Insurance>
{
    private String res;
    public SortByPolicyName(String in)
    {
        this.res = in;
    }
    
    public int compare(Insurance a, Insurance b)
    {
        if(res.equals("ASC"))
        return a.getPolicyName().compareTo(b.getPolicyName());
        else
        return b.getPolicyName().compareTo(a.getPolicyName());
    }
}

class SortByHolderName implements Comparator<Insurance>
{
    private String res;
    public SortByHolderName(String in)
    {
        this.res = in;
    }
    
    public int compare(Insurance a, Insurance b)
    {
        if(res.equals("ASC"))
        return a.getHolderName().compareTo(b.getHolderName());
        else
        return b.getHolderName().compareTo(a.getHolderName());
    }
}

class SortByAddress implements Comparator<Insurance>
{
    private String res;
    public SortByAddress(String in)
    {
        this.res = in;
    }
    
    public int compare(Insurance a, Insurance b)
    {
        if(res.equals("ASC"))
        return a.getAddress().compareTo(b.getAddress());
        else
        return b.getAddress().compareTo(a.getAddress());
    }
}

class SortByAmount implements Comparator<Insurance>
{
    private String res;
    public SortByAmount(String in)
    {
        this.res = in;
    }
    
    public int compare(Insurance a, Insurance b)
    {
        if(res.equals("ASC"))
        return a.getAmount().compareTo(b.getAmount());
        else
        return b.getAmount().compareTo(a.getAmount());
    }
}