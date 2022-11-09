
/**
 *
 * @author tokri
 */
public class Szavazat {

    private int korzet;
    private int szavazat;
    private String veznev;
    private String kernev;
    private String part;

    public Szavazat(String[] adat) {
        this.korzet = Integer.parseInt(adat[0]);
        this.szavazat = Integer.parseInt(adat[1]);
        this.veznev = adat[2];
        this.kernev = adat[3];
        this.part = adat[4];
    }

    public int getKorzet() {
        return korzet;
    }

    public void setKorzet(int korzet) {
        this.korzet = korzet;
    }

    public int getSzavazat() {
        return szavazat;
    }

    public void setSzavazat(int szavazat) {
        this.szavazat = szavazat;
    }

    public String getVeznev() {
        return veznev;
    }

    public void setVeznev(String veznev) {
        this.veznev = veznev;
    }

    public String getKernev() {
        return kernev;
    }

    public void setKernev(String kernev) {
        this.kernev = kernev;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}