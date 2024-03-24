import java.util.Scanner;

public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String nama) {
        super(nama);
    }
    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        scanner.close();
    }
    @Override
    public void luasPermukaan() {
        double luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Permukaan " + getNama() + ": " + luas);
    }
    @Override
    public void volume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume " + getNama() + ": " + volume);
    }
}
