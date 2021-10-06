public class DataBuku {
    private final String isbn;
    private String judul,pengarang, tahunTerbit, harga;
    private float rating;

    public DataBuku(String isbn, String judul, String pengarang, String tahun, String harga, float rating){
        this.isbn = isbn;
        this.judul = this.judul;
        this.pengarang = this.pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = this.harga;
        this.rating = rating;
    }

    public String getIsbn(){
        return isbn;}

    public String getJudul(){
        return judul;}

    public void setJudul(String judul){
        this.judul = judul;}

    public String getPengarang(){
        return pengarang;}

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;}

    public String getTahunTerbit(){
        return tahunTerbit;}

    public void setTahunTerbit(String tahunTerbit){
        this.tahunTerbit = tahunTerbit;}

    public String getHarga(){
        return harga;}

    public void setHarga(String harga){
        this.harga = harga;}

    public float getRating() {
        return rating; }

    public void setRating( float rating) {
        this.rating = rating;}
}


