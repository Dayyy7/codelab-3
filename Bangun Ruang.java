public class BangunRuang {
    protected String nama;

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public static void main(String[] args) throws Exception {
        BangunRuang tabung = new Tabung("Tabung");
        BangunRuang kubus = new Kubus("Kubus");
        BangunRuang balok = new Balok("Balok");

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();
    }

    public void inputNilai() {
    }

    public void luasPermukaan() {
    }

    public void volume() {
    }
}
