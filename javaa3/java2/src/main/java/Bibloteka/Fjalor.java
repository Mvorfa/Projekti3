import java.time.LocalDate;
public class Fjalor extends Liber {
    private String ribotim;
    private int perkthime;
    public Fjalor(String t, String a, int c, int f, int n,String r,int p) {
        super(t, a, c, f, n);
        this.ribotim = r;
        this.perkthime = p;
    }
    
    LocalDate newDate1 =  LocalDate.now().plusDays(28);
    public int getPerkthime() {
        return perkthime;
    }
    public void setPerkthime(int p ) {
        perkthime = p;
    }

    public String toString(){
        return ribotim ;
    }
   
   
    public String getRibotim() {
        return this.ribotim;
    }
    
    public void setRibotim(String r ) {
        ribotim = r;
    }
    public void afisho(){
        System.out.println("Titulli i librit eshte :  " + getTitulli() + " . ");
        System.out.println("Autori i librit eshte :  " + getAutori() + " . ");
        System.out.println("Numri i fjaleve te perkthyera :  " + getPerkthime() + " fjale. ");
        System.out.println("Cmimi i librit eshte :  " + getCmimi() + " Euro . ");
        System.out.println("Numri i faqeve te librit eshte :  " + getNrfaqe() + "faqe . ");
        System.out.println("Numri i cmimeve fituese te librit eshte :  " + getNrCmimeFituese() + " . ");
        System.out.println("Dita e marrjes e librit : " + LocalDate.now());
        System.out.println("Dita e dorezimit te librit pas 28 ditesh : " + newDate1);
        
    }
    
}
