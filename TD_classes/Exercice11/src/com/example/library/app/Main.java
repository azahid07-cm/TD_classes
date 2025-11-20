package TD_classes.Exercice11.src.com.example.library.app;

import TD_classes.Exercice11.src.com.example.library.service.LibraryService;
import TD_classes.Exercice11.src.com.example.library.model.Book;
import TD_classes.Exercice11.src.com.example.library.model.Member;

public class Main {
    public static void main(String args[]){
        LibraryService L=new LibraryService();

        Book B1=new Book("001","fff","ahmed sefrioui");
        Book B2=new Book("002","ddd","victor hugo");
        Member M1=new Member("1","xxx","aaa@gmail.com");
        Member M2=new Member("2","zzz","bbb@gmail.com");

        L.addBook(B1);
        L.addBook(B2);
        L.addMember(M1);
        L.addMember(M2);
        
        System.out.println("Books: ");
        for(Book b:L.getBooks())
            System.out.println(b);
        System.out.println("Members: ");
        for(Member m:L.getMembers())
            System.out.println(m);
    }
}
