public class PremiumKrediKart extends KrediKart {
    protected int bonus;

    public PremiumKrediKart(String isim, String soyisim, int kimlikNo, String anneKizlikSoyadi, int musteriNumarasi, Durum durum, int kartNo, double limit, String date, double ekstre, int bonus) {
        super(isim, soyisim, kimlikNo, anneKizlikSoyadi, musteriNumarasi, durum, kartNo, limit, date, ekstre);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
