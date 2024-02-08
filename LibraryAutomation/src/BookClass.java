

// LibraryItemClass sınıfından türetilmiş olan BookClass sınıfı
public class BookClass extends LibraryItemClass{

    // Kitabın yazarını temsil eden PersonClass tipinde özel bir değişken
    private final PersonClass author;

    // Kitabın isbn numarasını temsil eden String tipinde özel bir değişken
    private final String isbn;

   //BookClass sınıfının Constructor'ı
    //parametre olarak title,yazar(author),isbn numarasını ekledim
    public BookClass(String title,PersonClass author, String isbn) {
       //Üst sınıfın yani LibraryItemClass sınıfının constructor'ını çağırarak tiitle bilgisini ekledim
        super(title);
        this.author = author;
        this.isbn = isbn;
    }
// Author ile ilgili bilgileri döndüren metot.
    public PersonClass getAuthor(){

        return author;
    }
    //ISBN numarasını döndüren metot.
    public String getIsbn(){

        return isbn;
    }
    // toString metotunu üzerine yazarak, kitabın bilgilerini içeren ve onları döndüren metot
    @Override
    public String toString() {
        // Üst sınıfın yani LibraryItemClass'ın toString metodunu çağırarak başlık bilgisini içerir.
        String string = super.toString();
        //Yazar ve isbn bilgileri eklenerek metni döndürür.
        return string + " \nAuthor: " + this.author + "\nISBN: " + this.isbn;
    }



}
