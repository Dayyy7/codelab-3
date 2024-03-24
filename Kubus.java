import java.util.Scanner;
import java.lang.Math;

public class Kubus extends BangunRuang {
    private double tinggi;

    public Kubus(String nama) {
        super(nama);
    }
    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sisi: ");
        tinggi = scanner.nextDouble();

    }
    @Override
    public void luasPermukaan() {
        double luas = 6 * Math.pow(tinggi, 2);
        System.out.println("Luas Permukaan " + getNama() + ": " + luas);
    }
    @Override
    public void volume() {
        double volume = Math.pow(tinggi, 3);
        System.out.println("Volume " + getNama() + ": " + volume);
    }
}
