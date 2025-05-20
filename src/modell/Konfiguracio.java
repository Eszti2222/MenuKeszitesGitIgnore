
package modell;

public class Konfiguracio {
    //adattagok
    private String nev;
    private int szakIndex;
    private boolean hirlevel;

    //generálhato ALT+INSERT vagy jobb click ->insert code
    public Konfiguracio(String nev, int szakIndex, boolean hirlevel) {
        this.nev = nev;
        this.szakIndex = szakIndex;
        this.hirlevel = hirlevel;
    }

    public boolean isHirlevel() {
        return hirlevel;
    }

    public String getNev() {
        return nev;
    }

    public int getSzakIndex() {
        return szakIndex;
    }
    //toString az obj. szöveges reprezentációja
    @Override
    public String toString() {
        return "Konfiguracio{" + "nev=" + nev + ", szakIndex=" + szakIndex + ", hirlevel=" + hirlevel + '}';
    }
    
    
    
}
