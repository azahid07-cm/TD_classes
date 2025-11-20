package TD_classes.Exercice11.src.com.example.library.model;

public class Member {
    private String id;
    private String name;
    private String email;
    public Member(String i,String n,String e){
        this.id=i;
        this.name=n;
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
