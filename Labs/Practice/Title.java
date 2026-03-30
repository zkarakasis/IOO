public class Title {
    private int id;
    private String title;

    public Title(int id, String title){
        setId(id);
        setTitle(title);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(int title){
        this.title = title;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString()
    {
        return "Title [id=" + id + ",title="+ name+"]";
    }

}
