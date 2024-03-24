import java.util.Scanner;
import java.lang.Math;

public class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(String nama) {
        super(nama);
    }

    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input jari-jari: ");
        jariJari = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();

    }
    @Override
    public void luasPermukaan() {
        double luas = 2 * Math.PI * jariJari * (jariJari + tinggi);
        System.out.println("Luas Permukaan " + getNama() + ": " + luas);
    }
    @Override
    public void volume() {
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        System.out.println("Volume " + getNama() + ": " + volume);
    }
}
