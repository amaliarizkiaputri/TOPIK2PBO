import  java.util.*;

public class Bagian1 {

    static Scanner in = new Scanner(System.in);
    static ArrayList<DataBuku> katalog = new ArrayList<>();
    private static String isbn1;

    public static void tambahBuku(){
        System.out.print("ISBN : ");
        String isbn = in.next();
        System.out.print("Judul Buku: ");
        String judul = in.next();
        System.out.print("Pengarang : ");
        String pengarang = in.next();
        System.out.print("Tahun Terbit : ");
        String tahun = in.next();
        System.out.print("Harga Buku: ");
        String harga = in.next();
        System.out.print("Rating : ");
        float rating = in.nextFloat();
        katalog.add(new DataBuku( isbn, judul, pengarang,tahun, harga, rating));
    }

    public static  void tampilBuku() {
        for (DataBuku buku : katalog){
            System.out.println("ISBN :" + buku.getIsbn());
            System.out.println("Judul Buku:" + buku.getJudul());
            System.out.println("Pengarang :" + buku.getPengarang());
            System.out.println("Tahun Terbit :" + buku.getTahunTerbit());
            System.out.println("Harga Buku:" + buku.getHarga());
            System.out.println("Rating :" + buku.getRating());
        }
    }

    public static void editBuku(String judul) {
        for (DataBuku buku : katalog){
            if (judul.equals(buku.getIsbn())){
                System.out.print("Judul : ");
                String judulBaru = in.next();
                buku.setJudul(judulBaru);
                System.out.print("Pengarang : ");
                String pengarangBaru = in.next();
                buku.setPengarang(pengarangBaru);
                System.out.print("Tahun : ");
                String tahunBaru = in.next();
                buku.setPengarang(tahunBaru);
                System.out.print("Harga : ");
                String hargaBaru = in.next();
                buku.setPengarang(hargaBaru);
                System.out.print("Rating : ");
                float ratingBaru = in.nextFloat();
                buku.setRating(ratingBaru);
            } else {
                System.out.println("Buku Tidak Ditemukan");
            }
        }
    }

    static void cariBuku(){
        katalog.sort(Comparator.comparing(DataBuku::getIsbn));
        for (DataBuku buku : katalog){
            if (isbn1.equals(buku.getIsbn())){
                System.out.println("ISBN : " + buku.getIsbn());
                System.out.println("Judul Buku: " + buku.getJudul());
                System.out.println("Pengarang : " + buku.getPengarang());
                System.out.println("Tahun Terbit : " + buku.getTahunTerbit());
                System.out.println("Harga Buku: " + buku.getHarga());
                System.out.println("Rating : " + buku.getRating());
            } else{
                System.out.println("Tidak Ada Buku");
            }
        }
    }

    public static void hapusBuku() {
        for (int i = 0; i < katalog.size(); i++){
            String isbnBuku = null;
            if (isbnBuku.equals(katalog.get(i).getIsbn())){
                katalog.remove(katalog.get(i));
                System.out.println("Buku sudah dihapus");
            } else{
                System.out.println("Buku tidak ditemukan");
            }
        }
    }

    public static void main(String args[]){
        int menu;
        do {
            System.out.println("1. Tambah Buku");
            System.out.println("2. Edit Buku");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Cari Buku");
            System.out.println("5. Hapus Buku");
            System.out.println("6. Exit");
            menu = in.nextInt();
            switch (menu){
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    System.out.print("Masukkan ISBN : ");
                    String isbn = in.next();
                    editBuku(isbn);
                    break;
                case 3:
                    tampilBuku();
                    break;
                case 4:
                    cariBuku();
                    break;
                case 5:
                    hapusBuku();
                    break;
            }
        } while ( menu != 6);
    }
}
