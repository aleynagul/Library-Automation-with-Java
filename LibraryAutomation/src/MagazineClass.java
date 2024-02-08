

// MagazineClass, LibraryItemClass sınıfından türetilmiş bir sınıf.
public class MagazineClass extends LibraryItemClass{
// Derginin sayı numarasını temsil eden özel bir sınıf.
    private String issueNumber;
    // Derginin yayın tarihini temsil eden özel bir sınıf.
    private DateClass publicationDate;

    // MagazineClass sınıfının constructor'ı.Ve parametrelerini ekliyoruz.
    public MagazineClass(String title, String issueNumber, DateClass publicationDate) {
       //Üst sınıfın constructor'ını çağırıyoruz.
        super(title);
        // Sayı numarası ve yayın tarihi değişkenlerini ilgili parametrelerle set et.
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;

    }
   //Derginin sayı numarasını döndüren metot.
    public String getIssueNumber(){

        return this.issueNumber;
}
//Derginin yayın tarihini döndüren metot.
    public DateClass getPublicationDate(){

        return publicationDate;
}
    // toString metotunu üzerine yazarak, dergi bilgilerini içeren bir metin döndüren metot.
    public String toString(){
        String string= super.toString();
        return string + "\nPublication Date: " + publicationDate + ", \nIssue Number: " + issueNumber;
    }

    }



