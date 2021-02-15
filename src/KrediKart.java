public class KrediKart extends Musteri {
    protected int kartNo;
    protected double limit;
    protected String date;
    protected double ekstre;

    public KrediKart(String isim, String soyisim, int kimlikNo, String anneKizlikSoyadi, int musteriNumarasi, Durum durum, int kartNo, double limit, String date, double ekstre) {
        super(isim, soyisim, kimlikNo, anneKizlikSoyadi, musteriNumarasi, durum);
        this.kartNo = kartNo;
        this.limit = limit;
        this.date = date;
        this.ekstre = ekstre;
    }

    public int getKartNo() {
        return kartNo;
    }

    public void setKartNo(int kartNo) {
        this.kartNo = kartNo;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getEkstre() {
        return ekstre;
    }

    public void setEkstre(double ekstre) {
        this.ekstre = ekstre;
    }
}
