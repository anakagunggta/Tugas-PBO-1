class Buku{

    String judul;
    String pengarang;
    double harga;

    Buku(String judul, String pengarang, double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public double getHarga() {
        return harga;
    }
    public void print(){
        System.out.println(getJudul()+" | "+getPengarang()+" | "+getHarga());
    }
}

public class Soal2 {
    public static void main(String[] args) {
        Buku b1 = new Buku("Harry Potter","J.K. Rowling",300000);
        Buku b2 = new Buku("UML","Ivar Jacobson",400000);
        b1.print();
        b2.print();
    }
}
