package TD_classes.Exercice11.src.com.example.library.service;

import java.util.ArrayList;
import java.util.List;

import TD_classes.Exercice11.src.com.example.library.model.Book;
import TD_classes.Exercice11.src.com.example.library.model.Member;;

public class LibraryService {
    private List <Book> books;
    private List <Member> members;
    public LibraryService(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void addMember(Member member){
        members.add(member);
    }
    public List<Book> getBooks(){return List.copyOf(books);}
    public List<Member> getMembers(){return List.copyOf(members);}
}
