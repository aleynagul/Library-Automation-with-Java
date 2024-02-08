

// DVDClass, LibraryItemClass sınıfından türetilmiş bir sınıf.
public class DVDClass extends LibraryItemClass{
    // DVD'nin yönetmenini temsil eden özel bir PersonClass değişkeni.
    private PersonClass director;
    // DVD'nin süresini temsil eden özel bir int değişkeni
    private int runtimeMinutes;

    // DVDClass sınıfının constructor'ı.
public DVDClass(String title,PersonClass director,int runtimeMinutes){
   //üst sınıfın constructor'ı çağrıldı.
    super(title);
    // Yönetmen ve süre değişkenlerini ilgili parametrelerle set et.
    this.director=director;
    this.runtimeMinutes = runtimeMinutes;
}
// DVD'nin yönetmenini döndürür.
public PersonClass getDirector(){
    return director;
    }
  //DVD'nin süresini dakika cinsinden döndürür.
    public int getRuntimeMinutes(){
    return runtimeMinutes;
    }
    // toString metotunu üzerine yazarak, DVD bilgilerini içeren bir metin döndüren metot.
    public String toString() {
    //Üst sınıfın toString metodu çağrıldı.
        String string = super.toString();
        return string + "\nDirector: " + director + ", \nRuntime Minutes: " + runtimeMinutes;
    }

}
