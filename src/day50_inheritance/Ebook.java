package day50_inheritance;

public class Ebook  extends Book{
    int size;
    int pages;

    public void readBook(){
        System.out.println("Reaing Book: ");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
    }



}
