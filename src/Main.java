public class Main {
    public double angka1;
    public double angka2;

    public Main(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
    void inputan()
    {
        System.out.println("Angka Pertama : " + angka1);
        System.out.println("Angka Kedua   : " + angka2);
    }
    public double Jumlah(){
        double jumlah = angka1+angka2;
        System.out.println("Total Penjumlahan : "+jumlah);
        return jumlah;
    }
    public static void main(String[] args) {
        Main obj = new Main(10, 20);
        obj.inputan();
        obj.Jumlah();

    }
}