
public class Image implements Element {

    private final Visitor v;
    private String imageName;

    public Image(String name) {
        this.imageName = name;
        public void accept (Visitor v){
            v.visit(this);
        }

        public void print () {
            System.out.println("models.Image with name: " + this.imageName);
        }

    }

}