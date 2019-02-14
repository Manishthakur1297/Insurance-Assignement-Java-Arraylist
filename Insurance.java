class Insurance
{
    private Integer policyNumber;
    private String policyName;
    private String holderName;
    private String address;
    private String amount;
    
    public Insurance(){}
    
    public Insurance(Integer policyNumber,String policyName,String holderName,String address,String amount)
    {
        this.policyNumber = policyNumber;
        this.policyName = policyName;
        this.holderName = holderName;
        this.address = address;
        this.amount = amount;
    }
    
    public Integer getPolicyNumber()
    {
        return this.policyNumber;
    }
    
    public void setpolicyNumber(Integer pn)
    {
        this.policyNumber = pn;
    }
    
    
    
    
    public String getPolicyName()
    {
        return this.policyName;
    }
    
    public void setpolicyName(String pn)
    {
        this.policyName = pn;
    }
    
    
    
    
    public String getHolderName()
    {
        return this.holderName;
    }
    
    public void setHolderName(String pn)
    {
        this.holderName = pn;
    }
    
    
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String pn)
    {
        this.address = pn;
    }
    
    
    
    public String getAmount()
    {
        return this.amount;
    }
    
    public void setAmount(String pn)
    {
        this.amount = pn;
    }
    
}