import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String familyName; // lastName
    private int age;
    //@ManyToOne
   // Klasa;

    /*@ManyToOne(cascade = CascadeType.ALL)
    Klasa klasa;*/

    @ManyToOne(cascade = CascadeType.ALL)
    private Klasa klasa;


    // Klasa ?
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

    // -------------------------------------------

    public Klasa getKlasa()
    {
        return klasa;
    }

    public void setKlasa(Klasa klasa)
    {
        this.klasa = klasa;
    }




    /*public void count()
    {
        count ++;
    }*/
}
