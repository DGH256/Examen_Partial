public class TotalSizeVisitor implements Visitor{

    private int total_size_playlist=0;
    private int total_size_videoclip=0;
    private int total_size_melodie=0;
    private int total_size_gif=0;

    @Override
    public int VisitPlaylist(Playlist p) {
        int size_playlist=0;

        for(Element element :p.getElements())
        {
            Visitee casted = (Visitee) element;

            size_playlist+=casted.acceptVisitor(this);
        }

        total_size_playlist+=size_playlist;
        return size_playlist;
    }

    @Override
    public int VisitVideoclip(Videoclip v) {
        total_size_videoclip+= v.getDimensiune();
        return v.getDimensiune();
    }

    @Override
    public int VisitGif(Gif g) {
        total_size_gif+=g.getDimensiune();
        return g.getDimensiune();
    }

    @Override
    public int VisitMelodie(Melodie m) {
        total_size_melodie+=m.getDimensiune();
        return m.getDimensiune();
    }

    public void printStatistics()
    {
        System.out.println(String.format("Total playlist dimension: %d", total_size_playlist));
        System.out.println(String.format("Total videoclip dimension: %d", total_size_videoclip));
        System.out.println(String.format("Total melodie dimension: %d", total_size_melodie));
        System.out.println(String.format("Total gif dimension: %d", total_size_gif));

    }
}
