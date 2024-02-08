
//DateClass adında tarih bilgileri içeren bir sınıf oluşturdum.
public class DateClass {
    //Tarihin gün bilgisini temsil eden özel bir int değişkeni tanımladım.
    private int day;
    //Tarihin ay bilgisini temsil eden özel bir int değişkeni tanımladım
    private int month;
    //Tarihin yıl bilgisini temsil eden özel bir int değişkeni tanımladım
    private int year;
    // DateClass sınıfının constructor'ı ve bu sınıfın parametreleri.
    public DateClass(int day, int month, int year) {
        //ilgili parametrelerle özel değişkenleri set et.
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //Tarihin gün bilgisini döndüren metot.
    public int getDay() {
        return day;
    }
    //Tarihin ay bilgisini döndüren metot.
    public int getMonth() {
        return month;
    }
    //Tarihin yıl bilgisini döndüren metot.
    public int getYear() {
        return year;
    }
    // toString metotu, tarih bilgilerini içeren bir metin döndürür.
    @Override
    public String toString() {
//Tarih bilgilerini get metodu ile bir metin oluştururuz.
        return  "Date:" +getDay() + "/" + getMonth() + "/" + getYear();
    }}
