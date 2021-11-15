public interface Visitor {
    int VisitPlaylist(Playlist p);
    int VisitVideoclip(Videoclip v);
    int VisitGif(Gif g);
    int VisitMelodie(Melodie m);

}
