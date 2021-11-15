public class Main {

    public static void main(String[] args) {

        Playlist p1 = new Playlist("Playlist1");
        Playlist p2= new Playlist("Playlist2");

        Videoclip v1= new Videoclip(20,"Videoclip1");
        Videoclip v2= new Videoclip(30, "Videoclip2");

        Gif g1= new Gif(15,"Gif1");
        Gif g2= new Gif(25,"Gif2");

        Melodie m1 = new Melodie(10,"Melodie1");
        Melodie m2= new Melodie(30,"Melodie 2");

        p2.addElement(v1); p2.addElement(v2);
        p2.addElement(g1);

        p1.addElement(m1); p1.addElement(m2);
        p1.addElement(p2); p1.addElement(g2);

        p1.print();

        TotalSizeVisitor visitor = new TotalSizeVisitor();
        p1.acceptVisitor(visitor);

        System.out.println();
        visitor.printStatistics();

        //Uncommenting this will lead to a long wait time!
        //p1.download();
    }
}
