
package modell;


public class Konfiguracio {
    private String nev;
    private String szak;
    private boolean hirlevel;

    // ALT+INSERT
    public Konfiguracio(String teljesSor) {
        String[] sorok = teljesSor.split(" ");
        nev = sorok[0];
        szak = sorok[1];
        hirlevel = Boolean.parseBoolean(sorok[2]);
    }

    public Konfiguracio(String nev, String szak, boolean hirlevel) {
        this.nev = nev;
        this.szak = szak;
        this.hirlevel = hirlevel;
    }
    
    
    
    public String getNev() {
        return this.nev;
    }
    public String getSzakIndex() {
        return this.szak;
    }
    public boolean getHirlevel() {
        return this.hirlevel;
    }
    
    // ez itt az objektum szöveges reprezentációja
    // örököltük az Object-ből és felülírjuk
    // ha nem lenne felülvírva, akkor memóriacímet adna vissza
    @Override
    public String toString() {
        return "Konfiguracio{"
                + "nev=" + nev 
                + ", szak=" 
                + szak + ", hirlevel=" 
                + hirlevel + '}';
    }
    
    
}
