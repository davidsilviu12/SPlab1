public class BookStatistics implements Visitor{
    private int imagesCounter = 0;
    private int tablesCounter = 0;
    private int paragraphsCounter = 0;

    public void visit(Image image){imagesCounter++;}
    public void visit(ImageProxy imageProxy){imagesCounter++;}

    @Override
    public void visit(Section s) {

    }

    public void visit(Paragraph paragraph){paragraphsCounter++;}

    public void visit(Table table){tablesCounter++;}

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("**** number of images: " + imagesCounter);
        System.out.println("**** number of tables: " +tablesCounter);
        System.out.println("*** number of paragraphs: "+ paragraphsCounter);
    }

}
