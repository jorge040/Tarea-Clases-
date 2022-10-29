public class CLASE_DOS  extends CLASE_UNO{

    static String seis;
    static String siete;
    static double ocho;


    public CLASE_DOS(String uno, String dos, int tres, double cuatro, int cinco) {
        super(uno, dos, tres, cuatro, cinco);
        this.seis = seis;
        this.siete = siete;
        this.ocho = ocho;
    }


    public String getseis(){
        return seis;
    }
    public void setseis(){
        this.seis = seis;
    }
    public String getsiete(){
        return siete;
    }
    public void setsiete(){
        this.siete = siete;
    }
    public double ocho(){
        return ocho;
    }
    public void setocho(){
        this.ocho = ocho;
    }

    public static void ccc(){

        System.out.println("UNO"+getUno());
   
    }

    public static String Ci(){
        return "seis" + seis;
    }

    public static String Ce(){
        return "siete" + siete;
    }
    
    
    
    @Override
    public int hashCode(){
        int result = seis != null ? seis.hashCode() : 0;
        seis = 6 * result + siete + (seis != null ? siete.hashCode() : 0);
        return result;

    }
    
    public static void main(String[] args) {
       CLASE_DOS c = new CLASE_DOS(siete, seis, 0, ocho, 0);
       c.ccc();

       System.out.println(seis+siete+ocho);
    }
}
