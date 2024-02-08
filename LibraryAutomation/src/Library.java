

// Library sınıfı, kütüphane öğelerini oluşturarak ve bu öğeler üzerinde işlemler yaparak bir kütüphane simülasyonu gerçekleştirir.
  public class Library {
    public static void main(String[] args) {
        //BookClass testi.
        BookClass book1 = new BookClass("Masumiyet Müzesi", new PersonClass("Orhan", "Pamuk", new DateClass(1980, 1, 1)), "9789750826146");
        BookClass book2 = new BookClass("İntibah", new PersonClass("Namık", "Kemal", new DateClass(1987, 3, 11)), "9782340676146");
        BookClass book3 = new BookClass("Piraye'ye Mektuplar", new PersonClass("Nazım", "Hikmet", new DateClass(1067, 3, 11)), "9700751829846");
        System.out.println(book1.toString()+"\n");
        System.out.println(book2.toString()+"\n");
        System.out.println(book3.toString()+"\n");
        //MagazineClass testi.
        MagazineClass magazine1 = new MagazineClass("Kafa", "Issue 110", new DateClass(01, 11, 2023));
        MagazineClass magazine2 = new MagazineClass("OT", "Issue 127", new DateClass(10, 11, 2023));
        MagazineClass magazine3 = new MagazineClass("Edebiyatist", "Issue 50", new DateClass(24, 11, 2023));
        System.out.println(magazine1.toString()+"\n");
        System.out.println(magazine2.toString()+"\n");
        System.out.println(magazine3.toString()+"\n");
        //DVD nesnelerini oluşturarak,bigilerini ekler.
        DVDClass dvd1 = new DVDClass("Inception", new PersonClass("Christopher", "Nolan", new DateClass(23, 03, 1970)), 148);
        DVDClass dvd2 = new DVDClass("The Dark Knight", new PersonClass("Christopher", "Nolan", new DateClass(23, 03, 1970)), 152);
        DVDClass dvd3 = new DVDClass("Interstellar", new PersonClass("Christopher", "Nolan", new DateClass(23, 03, 1970)), 169);
        System.out.println(dvd1.toString()+"\n");
        System.out.println(dvd2.toString()+"\n");
        System.out.println(dvd3.toString()+"\n");

        //LibraryItemClass testi.
        LibraryItemClass object = new LibraryItemClass("Titanic");
        object.borrowItem();
        System.out.println(object.toString()+"\n");
        object.returnItem();
        System.out.println(object.toString()+"\n");

        //PersonClass test.
        PersonClass person = new PersonClass("Kübra", "Akdoğan", new DateClass(19, 12, 2000));
        System.out.println(person.toString()+"\n");

        //LibrarianClass test.
        LibrarianClass librarian = new LibrarianClass("Sümeyye", "Alemdar", new DateClass(21, 01, 2003), 150201);
        System.out.println(librarian.toString()+"\n");

        //PatronClass test.
        PatronClass patron=new PatronClass("Aleynagül","Kazdal",new DateClass(07,03,2002),"aleynakazdal75@gmail.com");
        System.out.println(patron.toString()+"\n");
        // DateClass test.
        DateClass date = new DateClass(19, 11, 2023);
        System.out.println(date.toString());

    }
}