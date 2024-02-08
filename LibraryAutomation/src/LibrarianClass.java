
// LibrarianClass, PersonClass sınıfından türetilmiş bir sınıf.
public class LibrarianClass extends PersonClass{
    // Kütüphaneciye ait benzersiz bir kimliği temsil eden özel bir int değişkeni.
private int employeeID;
    // Son kullanılan kütüphaneci kimliğini takip etmek için kullanılan statik bir değişken.
private static int lastEmployeeID=-1;
    // LibrarianClass sınıfının constructor'ı ve parametreleri.
public LibrarianClass(String firstName, String lastName, DateClass dateOfBirth,int employeeID){
    // Üst sınıfın constructor'ını çağırarak ad, soyad ve doğum tarihi bilgilerini set et.
    super(firstName, lastName, dateOfBirth);
    // Kütüphaneci kimliğini artırarak atayarak güncelle.
    this.employeeID=++lastEmployeeID;
}
    // Kütüphaneci kimliğini döndüren metot.
public int getEmployeeID(){


    return employeeID;
}
//Kütüphaneci kimliğini set eden metot.
public void setEmployeeID(int employeeID){


    this.employeeID=employeeID;
}
    // toString metotunu üzerine yazarak, kütüphaneci bilgilerini içeren bir metin döndüren metot.
    @Override
    public String toString() {
        // Üst sınıfın toString metotunu çağırır.
   String string= super.toString() ;
   // Kütüphaneci kimliğini ekleyerek tamamlanan metni döndür.
            return string + "employeeID=" + getEmployeeID();
    }

}
