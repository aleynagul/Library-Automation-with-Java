

// PatronClass, PersonClass sınıfından türetilmiş bir sınıf.
public class PatronClass extends PersonClass{
    // Kütüphane kart numarasını temsil eden özel bir int değişkeni.
    private int libraryCardNumber;
    // Patrondan alınan e-posta adresini temsil eden özel bir String değişkeni.
    private String emailAddress;
    // Kütüphane kart numarasını takip etmek için kullanılan statik bir değişken
    private static int lastLibraryCardNumber=-1;

    // PatronClass sınıfının constructor'ı ve parametreleri.
public PatronClass(String firstName,String lastName,DateClass dateOfBirth, String emailAddress){
    //Üst sınıfın constructor'larını çağırdık.
    super(firstName, lastName, dateOfBirth);
    // E-posta adresini set et ve kütüphane kart numarasını artırarak,güncelle.
    this.emailAddress = emailAddress;
    this.libraryCardNumber = ++lastLibraryCardNumber;

}
//Kütüphane kart numarasını döndüren metot.
public int getLibraryCardNumber(){

    return libraryCardNumber;
}
//E-posta adresini döndüren metot.
public String getEmailAddress(){

    return emailAddress;
    }

    // toString metotunu üzerine yazarak, patron bilgilerini içeren bir metin döndüren metot.
    @Override
    public String toString() {
    //üst sınıfın toString metodu çağrılarak ad,soyad, ve doğum tarihi bilgilerini içeren metini alır.
      String string =super.toString();
        // Kütüphane kart numarası ve e-posta adresi bilgilerini ekleyerek tamamlanan metni döndür.
      return string +"\nlibraryCardNumber:" + getLibraryCardNumber() + "\temailAddress:" + getEmailAddress();
    }

}
