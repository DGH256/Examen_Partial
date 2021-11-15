public class Melodie extends PlaylistItem implements Element, Visitee {

    public Melodie(int dimensiune, String titlu)
    {
        super(dimensiune,titlu);
        this.setDownloadTime(3);
    }

    @Override
    public void print() {
        System.out.println(String.format("Melodie cu dimensiune [%s]Kb si titlu [%s]",this.getDimensiune(),this.getTitlu()));
    }

    @Override
    public void download() {
        this.downloadItem();
    }

    @Override
    public int acceptVisitor(Visitor visitor) {
        visitor.VisitMelodie(this);
        return this.getDimensiune();
    }

}
