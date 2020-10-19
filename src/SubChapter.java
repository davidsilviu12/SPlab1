//import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;
    public ArrayList<Paragraph> paragraphs=new ArrayList<Paragraph>();
    public ArrayList<Table> tables=new ArrayList<Table>();
    public ArrayList<Image> images=new ArrayList<Image>();
    public SubChapter(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubChapter{" + "name=" + name + "}";
    }
    public void print(){
        System.out.println("Subchapter: "+this.name);
        for (Paragraph par: paragraphs){
            par.print();
        }
        for (Table t: tables){
            t.print();
        }
        for (Image i: images){
            i.print();
        }
    }

    public void createNewParagraph(String p) {
        Paragraph par=new Paragraph(p);
        paragraphs.add(par);
    }
    public void createNewTable(String t){
        Table tab=new Table(t);
        tables.add(tab);
    }
    public void createNewImage(String i){
        Image img=new Image(i);
        images.add(img);
    }
}