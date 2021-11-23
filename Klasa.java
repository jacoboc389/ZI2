import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Klasa
{
    /* jest to encja, obiekty tej klasy da się  zapisać w bazie danych

    Klasa musi mieć ID

    pobieranie wartości z danego pola, i ustawienie jej : są to gettery i settery */
    //static int count = 0;

    @Id
    @GeneratedValue
    private Long id;
    private String className;
    private String classLevel; //poziom (rok) nauczania
    //private int classNumber; // Określa numer klasy (1,2,3 ...)


    // nowe relacje :
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "klasa")
    private List<Student> students = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "klasa")
    private Teacher teachers; // klasa ma wychowawcę/nauczyciela

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "klasa")
    private List<Subject> subjects = new ArrayList<>();








    // stare :
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "klasa")
    private List<Student> students; // klasa ma listę uczniów

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "teacher")
    //private List<Teacher> teachers;
    private Teacher teacher; // klasa ma wychowawcę/nauczyciela

    @OneToMany
    private List<Subject> subjects; // klasa ma listę przedmiotów*/


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getclassName()
    {
        return className;
    }

    public void setclassName(String className)
    {
        this.className = className;
    }

    public String getclassLevel()
    {
        return classLevel;
    }
    public void setclassLevel(String classLevel)
    {
        this.classLevel = classLevel;
    }

    public List<Student> getStudents() {return students;}

    public void setStudents(List<Student> students) {this.students = students;}

    // --------------------------------------------------

    public Teacher getTeacher()
    {
        return teachers;
    }

    public void setTeacher(Teacher teachers)
    {
        this.teachers = teachers;
    }

    // ---------------------------------------------------

    public List<Subject> getSubjects() {return subjects;}

    public void setSubjects(List<Subject> subjects) {this.subjects = subjects;}

    /*public String getclassLevel() {return classLevel;}*/

    /*public void setclassNumber(int classNumber)
    {
        this.classNumber = classNumber;
    }*/


}
