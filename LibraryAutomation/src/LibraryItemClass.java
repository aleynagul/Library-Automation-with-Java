

//LibraryItemClass adında  kütüphane öğelerini temsil eden bir sınıftır.
    public class LibraryItemClass {
//Öğenin başlığını temsil eden String değişkenli "title" adında bir değişken tanımlandı.
    private  String title;
    //Öğenin kimliğini temsil eden özel bir değişken oluşturuldu.
    private int itemID;
  // Öğenin mevcut olup olmadığını belirten boolean değişken.
    private boolean isAvailable;
    // Son kullanılan öğenin  kimliğini takip etmek için kullanılan statik bir değişken.
    private static int lastItemID=-1;

    // LibraryItemClass sınıfının constructor'ı ve parametresi.
    public LibraryItemClass( String title) {
        //İlgili parametreler set edildi.
        this.title=title;
        this.itemID =++lastItemID;
        this. isAvailable=true;

    }
    // Öğenin başlığını döndüren metot.
    public String getTitle() {

        return title;
    }
    //Öğenin başlığını set eden metot.
    public void setTitle(String title) {

            this.title = title;
        }
        //Öğenin kimliğini döndüren metot.
    public int getItemID() {

        return itemID;
    }
    //Öğenin kimşiğini set eden metot.
    public void setItemID(int itemID){

        this.itemID=itemID;
    }
    // Öğenin mevcut olup olmadığını belirten metot.
    public boolean isAvailable() {

        return isAvailable;
    }
    // Öğenin mevcut durumunu set eden metot.
    public void setAvailable(boolean available){

        isAvailable=available;
    }
    // Öğeyi ödünç alma işlemini gerçekleştiren metot.
    public void borrowItem(){
    if(isAvailable){
    isAvailable=false;
    }
}
    // Öğeyi iade alma işlemini gerçekleştiren metot.
    public void returnItem(){
            isAvailable=true;
      }
    // toString metotu, öğe bilgilerini içeren bir metin döndürür.
    public String toString(){

    return  "Title:" +getTitle() + ",itemID:" + getItemID() + ",isAvailable:" + isAvailable() ;

}
}
