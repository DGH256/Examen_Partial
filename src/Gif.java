public class Gif extends PlaylistItem implements Element, Visitee{

    public Gif(int dimensiune, String titlu)
    {
        super(dimensiune,titlu);
        this.setDownloadTime(1);
    }

    @Override
    public void print() {
        System.out.println(String.format("Gif cu dimensiune [%s]Kb si titlu [%s]",this.getDimensiune(),this.getTitlu()));
    }

    @Override
    public void download() {
        this.downloadItem();
    }

    @Override
    public int acceptVisitor(Visitor visitor) {
        visitor.VisitGif(this);
        return this.getDimensiune();
    }

}
