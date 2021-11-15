public abstract class PlaylistItem {
    private int dimensiune; // in Kb
    private String titlu;
    private String url;
    private Boolean wasDownloaded=false;
    private int downloadTime=0;//seconds

    public PlaylistItem(int dimensiune, String titlu)
    {
        this.dimensiune=dimensiune;
        this.titlu=titlu;
    }

    public PlaylistItem(int dimensiune, String titlu, String url)
    {
        this.dimensiune=dimensiune;
        this.titlu=titlu;
        this.url=url;
    }

    public int getDimensiune()
    {
        return this.dimensiune;
    }

    public String getTitlu()
    {
        return this.titlu;
    }

    public void setDownloadTime(int downloadTime)
    {
        this.downloadTime=downloadTime;
    }

    public void downloadItem()
    {
        //I should have made a ProxyElement or ProxyPlaylistItem
        if(!wasDownloaded)
        {
            try {
                Thread.sleep(1000 * downloadTime);
            }
            catch (Exception ex){ }

            wasDownloaded=true;
        }
    }
}
