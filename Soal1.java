class Soal1{
    String idProduk;
    String nama;
    double harga;

    Soal1(String idProduk, String nama, double harga){
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    Soal1(String idProduk, String nama){
        this.idProduk = idProduk;
        this.nama = nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }
    public String getIdProduk() {
        return idProduk;
    }
    public void print(){
        System.out.println(getIdProduk()+" | "+getNama()+" | "+getHarga());
    }
}

class Soal01{
    public static void main(String[] args) {
        Soal1 b1 = new Soal1("BRG-001","Tas Gucci");
        b1.setHarga(1200);

        Soal1 b2 = new Soal1("BRG-002","Printer Epson L355");
        b2.setHarga(200);

        b1.print();

        Soal1 b3 = new Soal1("BRG-003","Koper",150);
        Soal1 b4 = new Soal1("BRG-004","Helm",20);

        b3.print();
        b4.print();

        System.out.println(b1.getHarga()+b3.getHarga()+b4.getHarga());
    }
}