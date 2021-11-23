import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String familyName; // lastName
    private int age;

    @OneToOne(cascade = CascadeType.ALL) // relacja 1:1 do klasy
    private Klasa klasa;

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "klasa")
    //private List<Student> students = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher") // (?) ManyToMany ????
    private List<Subject> subjects = new ArrayList<>(); // Naucza kilka

    //@ManyToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    //private List<Subject> subjects = new ArrayList<>();

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getfirstName()
    {
        return firstName;
    }

    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFamilyName()
    {
        return familyName;
    }

    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }

    public int getAge() {return age;}

    public void setAge(int age)
    {
        this.age = age;
    }

    // --------------------------

    public Klasa getKlasa()
    {
        return klasa;
    }

    public void setKlasa(Klasa klasa)
    {
        this.klasa = klasa;
    }

    // --------------------------

    public List<Subject> getSubjects() {return subjects;}

    public void setSubjects(List<Subject> subjects) {this.subjects = subjects;}




    /*public void count()
    {
        count ++;
    }*/
}
