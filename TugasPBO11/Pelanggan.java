import java.util.Scanner;

public class Pelanggan extends DataPelanggan {

    //method untuk mengisi data pelanggan
    public void inputDataPelanggan(){
        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        System.out.println("Masukkan no faktur = ");
        noFaktur = scanString.next();
        System.out.println("Masukkan nama pelanggan = ");
        nama = scanString.next();
        System.out.println("Masukkan nama barang = ");
        namaBarang = scanString.next();
        System.out.println("Masukkan harga barang = ");
        hargaBarang = scanInt.nextInt();
        System.out.println("Masukkan jumlah barang = ");
        jumlahBarang = scanInt.nextInt();
        scanString.close();
        scanInt.close();
    }

    //menthod untuk mencetak struk
    @Override
    public void struk() {
        Integer totalBayar = hargaBarang*jumlahBarang;
        this.totalBayar = totalBayar;

        System.out.println("------- Struk -------");
        System.out.println("No Faktur = " + noFaktur);
        System.out.println("Nama Pelanggan = " + nama);
        System.out.println("Nama Barang = " + namaBarang);
        System.out.println("Harga = " + hargaBarang);
        System.out.println("Jumlah = " + jumlahBarang);
        System.out.println("Total Bayar = " + this.totalBayar);
        System.out.println("---------------------");
    }
    

}
