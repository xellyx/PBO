package com.company;

class Buku{

    String Penulis, Judulbuku, Penerbit;

    Buku(String Penulis,  String Judulbuku,  String Penerbit) {
        this.Penulis = Penulis;
        this.Judulbuku = Judulbuku;
        this.Penerbit = Penerbit;
    }

    void data() {
        System.out.println("Judul Buku: " + Judulbuku);
        System.out.println("Penulis: " + Penulis);
        System.out.println("Penerbit: " + Penerbit);
    }
}

class Pinjam{

    String NamaMahasiswa, NPM, programStudi;
    Buku buku;

    void PinjamBuku(Buku buku){
        this.buku = buku;
    }

    Pinjam(String NamaMahasiswa, String NPM, String programStudi){
        this.NamaMahasiswa = NamaMahasiswa;
        this.NPM = NPM;
        this.programStudi = programStudi;
    }

    void dataPinjam(){
        System.out.println("Nama Mahasiswa: " + NamaMahasiswa);
        System.out.println("NPM: " + NPM);
        System.out.println("Program Studi: " + programStudi);
        buku.data();
    }
}

public class Main {
    public static void main(String[] args){
        Pinjam peminjam1 = new Pinjam("Yusuf Rizky Yuhansyah", "2015061062", "TI");

        Buku bukux = new Buku("Moon atau Bulan","Tere Liye", "PT Gramedia Pustaka Utama");
        peminjam1.PinjamBuku(bukux);
        peminjam1.dataPinjam();
    }
}
