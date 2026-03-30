public class Journal extends Title{
    private String editor;

    public Journal(int id, String title, String editor){
        super(id,title);
        this.editor = editor;
    }

    public void setEditor(String editor){
        this.editor = editor;
    }

    public String getEditor(){
        return editor;
    }

    @Override
    public String toString(){
        return "Journal [id = "+getId()+", title = "+getTitle()+", editor = "+getEditor()+"]";
    }
}
