package TD_classes.Exercice12.src.com.example.library.model;

public final class Member {
    private final String id;
    private final String name;
    private final String email;
    public Member(String i,String n,String e){
        this.id=i;
        if (n== null ||n.isBlank())
            throw new IllegalArgumentException("Name cannot be empty");
        else
            this.name=n;
        if (e == null || !e.contains("@"))
            throw new IllegalArgumentException("Invalid email");
        else
            this.email=e;
    }
    public String getId(){return this.id;}
    public String getName(){return this.name;}
    public String getEmail(){return this.email;}
    @Override
    public String toString(){
        return "Id: "+id+", Name: "+name+", Email: "+email;
    }

}
