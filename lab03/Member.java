public class Member 
{
    private String name;
    private int id;

    private static final int MAX_ON_LOAN=6;

    public Member(int id, String name)
    {
        setId(id);
        setName(name);

    }

    public Member(){}
    
    public int getMaxOnLoan(){
        return MAX_ON_LOAN;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Member [id=" + id + ",name="+ name+"]";
    }
}

