public class App {
    public static void main(String[] args) {

    //polymorphisme
    DataPelanggan pelanggan1 = new Pelanggan();
 
    //exception    
    try {
        pelanggan1.inputDataPelanggan();
    } 
    catch (Exception e){
        System.out.println("Error, kesalahan input");
    }
        pelanggan1.struk();

    }
}
