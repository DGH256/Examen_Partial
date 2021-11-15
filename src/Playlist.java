import java.util.ArrayList;

public class Playlist implements Element, Visitee{
    private String titlu;

    ArrayList<Element> elements ;

    public Playlist(String titlu)
    {
        this.elements = new ArrayList<Element>();
        this.titlu=titlu;
    }

    public void addElement(Element el)
    {
        this.elements.add(el);
    }

    public ArrayList<Element> getElements()
    {
        return this.elements;
    }


    @Override
    public void print() {
        System.out.println(String.format("Playlist cu titlu [%s]",titlu));

        for(Element el : elements)
        {
            el.print();
        }
    }

    @Override
    public void download() {
        for(Element el : elements)
        {
            el.download();
        }
    }

    @Override
    public int acceptVisitor(Visitor visitor) {
        visitor.VisitPlaylist(this);
        return 0;
    }
}
