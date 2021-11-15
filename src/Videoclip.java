public class Videoclip extends PlaylistItem implements Element, Visitee {

    public Videoclip(int dimensiune, String titlu)
    {
        super(dimensiune,titlu);
        this.setDownloadTime(5);
    }

    @Override
    public void print() {
        System.out.println(String.format("Videoclip cu dimensiune [%s]Kb si titlu [%s]",this.getDimensiune(),this.getTitlu()));
    }

    @Override
    public void download() {
        this.downloadItem();
    }


    @Override
    public int acceptVisitor(Visitor visitor) {
        visitor.VisitVideoclip(this);
        return this.getDimensiune();
    }
}
