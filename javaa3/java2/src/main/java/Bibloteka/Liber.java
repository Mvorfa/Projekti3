public abstract class Liber {
    //variabla instance
    
    private String titulli;
    private String autori;
    private int cmimi;
    private int nrfaqe;
    private int nrCmimeFituese;
    //konstruktori
    public Liber(String t, String a, int c, int f , int n) {
        this.titulli = t;
        this.autori = a;
        this.cmimi = c;
        this.nrfaqe = f;
        this.nrCmimeFituese = n;
    }
    
    //get dhe set

    public String getTitulli() {
        return titulli;
    }
    public String getAutori() {
        return this.autori;
    }
    public int getCmimi() {
        return cmimi;
    }

    public int getNrfaqe() {
        return nrfaqe;
    }

    public int getNrCmimeFituese() {
        return nrCmimeFituese;
    }
    
    public void setAutori(String a ) {
        autori = a;
    }

    public void setTitulli(String t ) {
        titulli = t;
    }

    public void setCmimi(int c ) {
        cmimi = c;
    }

    public void setNrfaqe(int f ) {
        nrfaqe = f;
    }
    
    public void setNrCmimeFituese(int n ) {
        nrCmimeFituese = n;
    }
    

}