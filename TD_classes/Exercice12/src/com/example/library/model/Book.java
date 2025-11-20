package TD_classes.Exercice12.src.com.example.library.model;

public final class Book {
    private final String isbn;
    private final String title;
    private final String author;
    public Book(String i,String t,String a){
        this.isbn=i;
        if (t == null||t.isBlank())
            throw new IllegalArgumentException("Title doit etre non vide!");
        else
            this.title=t;
        if (a == null||a.isBlank())
            throw new IllegalArgumentException("Author doit etre non vide!");
        else
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

