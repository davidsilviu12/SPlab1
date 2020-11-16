
public class Image implements Element {

    private Visitor v;
    private String imageName;

    public Image(String name) {
        this.imageName = name;

    }

    @Override
    public void print() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    };
}