public class NakitKart extends Musteri {
    protected int kartNo;
    protected double bakiye;

    public NakitKart(String isim, String soyisim, int kimlikNo, String anneKizlikSoyadi, int musteriNumarasi, Durum durum, int kartNo, double bakiye) {
        super(isim, soyisim, kimlikNo, anneKizlikSoyadi, musteriNumarasi, durum);
        this.kartNo = kartNo;
        this.bakiye = bakiye;
    }

    public int getKartNo() {
        return kartNo;
    }

    public void setKartNo(int kartNo) {
        this.kartNo = kartNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
