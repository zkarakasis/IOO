public class BookCopy
{
    private int id;
    private boolean available;

    public BookCopy(int id, boolean available)
    {
        this.id=id;
        this.available=available;

    }

    public void setId(int id)
    {
        this.id=id;
    }

    public void setAvailable()
    {
        this.available=available;
    }

    public int getId()
    {
        return id;
    }

    public boolean getAvailable()
    {
        return available;
    }
}