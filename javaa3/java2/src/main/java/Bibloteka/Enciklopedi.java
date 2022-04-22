import java.time.LocalDate;
public class Enciklopedi extends Liber {
    private String lloji;
    public Enciklopedi(String t, String a, int c, int f, int n, String l) {
        super(t, a, c, f, n);
        this.lloji = l;
    }

    
    LocalDate newDate1 =  LocalDate.now().plusDays(21);
    public String toString(){
    return lloji ;
    }
    public String getLloji() {
        return this.lloji;
    }

    public void setLloji(String l ) {
        lloji = l;
    }
   
    public void afisho(){
        System.out.println("Titulli i librit eshte :  " + getTitulli() + " . ");
        System.out.println("Autori i librit eshte :  " + getAutori() + " . ");
        System.out.println("Cmimi i librit eshte :  " + getCmimi() + " Euro . ");
        System.out.println("Numri i faqeve te librit eshte :  " + getNrfaqe() + " faqe . ");
        System.out.println("Numri i cmimeve fituese te librit eshte :  " + getNrCmimeFituese() + " . ");
        System.out.println("Dita e marrjes e librit : " + LocalDate.now());
        System.out.println("Dita e dorezmit te librit pas 21 ditesh: " + newDate1 );
      
        
    }
}
