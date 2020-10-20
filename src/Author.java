public class Author
{
    protected String name;

    public Author(String name)
    {
        this.name=name;
    }

    public String toString()
    {
        return "Author [name=" + name + "]";
    }


    public void print()

    {
        System.out.println("Author : " + this.name);
    }
}