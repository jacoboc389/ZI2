import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Subject implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subjectName;
    //private String classLevel; //poziom (rok) nauczania
    //private String familyName; // lastName
    //private int classNumber; // Określa numer klasy (1,2,3 ...)

        //@OneToMany
        //private List<Student> students;

    //@OneToMany
    //private List<Teacher> teachers;


    @ManyToOne(cascade = CascadeType.ALL)
    private Teacher teacher;

    @ManyToOne(cascade = CascadeType.ALL)
    private Klasa klasa;




        //@OneToMany
        //private List<Subject> subjects;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getsubjectName()
    {
        return subjectName;
    }

    public void setsubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }


    // -------------------------------------------

    public Teacher getTeacher()
    {
        return teacher;
    }

    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }

    // ------------------------------------------

    // -------------------------------------------

    public Klasa getKlasa()
    {
        return klasa;
    }

    public void setKlasa(Klasa klasa)
    {
        this.klasa = klasa;
    }




}
