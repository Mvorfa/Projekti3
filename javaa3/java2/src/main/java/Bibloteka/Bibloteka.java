public class Bibloteka {
    public static void main(String[] args) {

        LetersiArtistike la1 = new LetersiArtistike( "Atje ku pemet takojne yjet.","Glendy Vanderah", 10, 150,2,"Roman");
        LetersiArtistike la2 = new LetersiArtistike( "Letra per mbretin.","Tonke Dragt", 20, 120, 3,"Roman");
        LetersiArtistike la3 = new LetersiArtistike( "Miqesi e ndaluar","Anne-Marie Conway", 30, 166, 3,"Roman");
       
        Fjalor lb1 = new Fjalor( "Italisht-Shqip","Ferdinand Leka", 17, 190,1,"Ribotuar ne vitin 2008",40000);
        Fjalor lb2 = new Fjalor( "Anglisht-Shqip","Shpetim Cucka", 27, 300,2,"Ribotuar ne vitin 2010",35000);
        Fjalor lb3 = new Fjalor( "Turqisht-Shqip","Hysen Voci", 20, 382, 3,"Ribotuar ne vitin 2009",30000);
        
        Enciklopedi lc1 = new Enciklopedi("Po sikur?","Randall Munroe",  22, 144, 4,"Fakte mbi natyren");
        Enciklopedi lc2 = new Enciklopedi( "Cfare? Perse? Si?","Asli Kaplan", 12, 250,1,"Fakte per jeten e perditshme");
        Enciklopedi lc3 = new Enciklopedi( "I fundmi i Kastrioteve","Bedri Dedja", 23, 220, 1,"Fakte mbi historine");

        System.out.println("Bibloteka permban keto lloje librash:\n");

        LetersiArtistike[] la = {la1,la2,la3};
        Fjalor[] lf = {lb1,lb2,lb3};
        Enciklopedi[] le = {lc1,lc2,lc3};
       
        System.out.println("\n1.....Libra te letersis artistike ");
        System.out.println("\n");
        for (int i = 0 ; i<la.length ; i++){
            la[i].afisho();
            System.out.println(la[i].toString());
            System.out.println("\n");
        }
        
        System.out.println("\n2.....Libra te llojit fjalor ");
        System.out.println("\n");
        for (int i = 0 ; i<lf.length ; i++){
            lf[i].afisho();
            System.out.println(lf[i].toString());
            System.out.println("\n");
        }
        
        System.out.println("\n3.....Libra Enciklopedik ");
        System.out.println("\n");
        for (int i = 0 ; i<le.length ; i++){
            le[i].afisho();
            System.out.println(le[i].toString());
            System.out.println("\n");
        }
    }
}
