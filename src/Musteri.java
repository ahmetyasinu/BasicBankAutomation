public class Musteri {

    protected String isim;
    protected String soyisim;
    protected int kimlikNo;
    protected String anneKizlikSoyadi;
    protected int musteriNumarasi;
    protected Durum durum;

    public Musteri(String isim, String soyisim, int kimlikNo, String anneKizlikSoyadi, int musteriNumarasi, Durum durum) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.kimlikNo = kimlikNo;
        this.anneKizlikSoyadi = anneKizlikSoyadi;
        this.musteriNumarasi = musteriNumarasi;
        this.durum = durum;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAnneKizlikSoyadi() {
        return anneKizlikSoyadi;
    }

    public void setAnneKizlikSoyadi(String anneKizlikSoyadi) {
        this.anneKizlikSoyadi = anneKizlikSoyadi;
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }
}
