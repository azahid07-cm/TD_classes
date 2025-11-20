package TD_classes.Exercice11.src.com.example.library.model;

public class Book {
    private String isbn;
    private String title;
    private String author;
    public Book(String i,String t,String a){
        this.isbn=i;
        this.title=t;
        this.author=a;
    }
    public String getIsbn(){return this.isbn;}
    public String getTitle(){return this.title;}
    public String getAuthor(){return this.author;}
    @Override
    public String toString(){
        return "Isbn: "+isbn+", Title: "+title+", Author: "+author;
    }

}

