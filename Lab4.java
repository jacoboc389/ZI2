import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Lab4 // nazwa klasy zawsze wielką literą
{
    public static void main(String[] args)
    {
        EntityManager en = Persistence.createEntityManagerFactory("moja-baza").createEntityManager();

        Klasa k_3 = new Klasa();
        k_3.setclassName("Klasa trzecia");
        k_3.setclassLevel("3a");

        Klasa k_1 = new Klasa();
        k_1.setclassName("Klasa pierwsza");
        k_1.setclassLevel("1c");

        Klasa k_2 = new Klasa();
        k_2.setclassName("Klasa druga");
        k_2.setclassLevel("2b");
        //k.setStudents(new ArrayList<>());

        Student s1 = new Student();
        s1.setfirstName("Adam");
        s1.setFamilyName("Kowalski");
        s1.setAge(18);

        Student s2 = new Student();
        s2.setfirstName("Jan");
        s2.setFamilyName("Błaszczykowski");
        s2.setAge(17);

        Student s3 = new Student();
        s3.setfirstName("Olaf");
        s3.setFamilyName("Wysocki");
        s3.setAge(16);

        Student s4 = new Student();
        s4.setfirstName("Aleksander");
        s4.setFamilyName("Chmielewski");
        s4.setAge(18);

        Student s5 = new Student();
        s5.setfirstName("Cezary");
        s5.setFamilyName("Lewandowski");
        s5.setAge(17);

        Student s6 = new Student();
        s6.setfirstName("Hubert");
        s6.setFamilyName("Szczepański");
        s6.setAge(16);

        Student s7 = new Student();
        s7.setfirstName("Michał");
        s7.setFamilyName("Witkowski");
        s7.setAge(18);

        Student s8 = new Student();
        s8.setfirstName("Arek");
        s8.setFamilyName("Sadowski");
        s8.setAge(17);

        Student s9 = new Student();
        s9.setfirstName("Dominik");
        s9.setFamilyName("Makowski");
        s9.setAge(16);

        Student s10 = new Student();
        s10.setfirstName("Grzegorz");
        s10.setFamilyName("Czarnecki");
        s10.setAge(18);

        Student s11 = new Student();
        s11.setfirstName("Albert");
        s11.setFamilyName("Pawlak");
        s11.setAge(17);

        Student s12 = new Student();
        s12.setfirstName("Kamil");
        s12.setFamilyName("Szewczyk");
        s12.setAge(16);

        Student s13 = new Student();
        s13.setfirstName("Oskar");
        s13.setFamilyName("Pietrzak");
        s13.setAge(18);

        Student s14 = new Student();
        s14.setfirstName("Edward");
        s14.setFamilyName("Krajewski");
        s14.setAge(17);

        Student s15 = new Student();
        s15.setfirstName("Juliusz");
        s15.setFamilyName("Ubraniak");
        s15.setAge(16);

        s1.setKlasa(k_3); // przypisanie uczniów do klas
        s2.setKlasa(k_2);
        s3.setKlasa(k_1);
        s4.setKlasa(k_3);
        s5.setKlasa(k_2);
        s6.setKlasa(k_1);
        s7.setKlasa(k_3);
        s8.setKlasa(k_2);
        s9.setKlasa(k_1);
        s10.setKlasa(k_3);
        s11.setKlasa(k_2);
        s12.setKlasa(k_1);
        s13.setKlasa(k_3);
        s14.setKlasa(k_2);
        s15.setKlasa(k_1);

        k_1.getStudents().add(s3); // określenie jacy uczniowie są w klasie
        k_1.getStudents().add(s6);
        k_1.getStudents().add(s9);
        k_1.getStudents().add(s12);
        k_1.getStudents().add(s15);

        k_2.getStudents().add(s2);
        k_2.getStudents().add(s5);
        k_2.getStudents().add(s8);
        k_2.getStudents().add(s11);
        k_2.getStudents().add(s14);

        k_3.getStudents().add(s1);
        k_3.getStudents().add(s4);
        k_3.getStudents().add(s7);
        k_3.getStudents().add(s10);
        k_3.getStudents().add(s13);

            en.getTransaction().begin();
            en.persist(k_1);
            en.persist(k_2);
            en.persist(k_3);
            en.getTransaction().commit();

        Teacher t1 = new Teacher(); // dodawanie nauczycieli
        t1.setfirstName("Ryszard");
        t1.setFamilyName("Nowak");
        t1.setAge(48);

        t1.setKlasa(k_1);
        k_1.setTeacher(t1);

        Teacher t2 = new Teacher();
        t2.setfirstName("Krystian");
        t2.setFamilyName("Włodarczyk");
        t2.setAge(37);

        t2.setKlasa(k_2);
        k_2.setTeacher(t2);

        Teacher t3 = new Teacher();
        t3.setfirstName("Igor");
        t3.setFamilyName("Polański");
        t3.setAge(42);

        t3.setKlasa(k_3);
        k_3.setTeacher(t3);

            en.getTransaction().begin();
            en.persist(k_1);
            en.persist(k_2);
            en.persist(k_3);
            en.getTransaction().commit();

        Subject sb1 = new Subject(); // dodawanie przedmiotów
        sb1.setsubjectName("Język polski");
        sb1.setTeacher(t1);
        sb1.setKlasa(k_1);

        Subject sb2 = new Subject();
        sb2.setsubjectName("Język Angielski");
        sb2.setTeacher(t1);
        sb2.setKlasa(k_1);

        Subject sb3 = new Subject();
        sb3.setsubjectName("WF");
        sb3.setTeacher(t1);
        sb3.setKlasa(k_1);

        Subject sb4 = new Subject();
        sb4.setsubjectName("Matematyka");
        sb4.setTeacher(t1);
        sb4.setKlasa(k_1);

        Subject sb5 = new Subject();
        sb5.setsubjectName("Historia");
        sb5.setTeacher(t2);
        sb5.setKlasa(k_2);

        Subject sb6 = new Subject();
        sb6.setsubjectName("Niemiecki");
        sb6.setTeacher(t2);
        sb6.setKlasa(k_2);

        Subject sb7 = new Subject();
        sb7.setsubjectName("Francuski");
        sb7.setTeacher(t2);
        sb7.setKlasa(k_2);

        Subject sb8 = new Subject();
        sb8.setsubjectName("Włoski");
        sb8.setTeacher(t2);
        sb8.setKlasa(k_2);

        Subject sb9 = new Subject();
        sb9.setsubjectName("Fizyka");
        sb9.setTeacher(t3);
        sb9.setKlasa(k_3);

        Subject sb10 = new Subject();
        sb10.setsubjectName("Technika");
        sb10.setTeacher(t3);
        sb10.setKlasa(k_3);

        Subject sb11 = new Subject();
        sb11.setsubjectName("Plastyka");
        sb11.setTeacher(t3);
        sb11.setKlasa(k_3);

        Subject sb12 = new Subject();
        sb12.setsubjectName("Religia");
        sb12.setTeacher(t3);
        sb12.setKlasa(k_3);

        k_1.getSubjects().add(sb1);  // określenie jakie przedmioty ma dana klasa
        k_1.getSubjects().add(sb2);
        k_1.getSubjects().add(sb3);
        k_1.getSubjects().add(sb4);

        k_2.getSubjects().add(sb5);
        k_2.getSubjects().add(sb6);
        k_2.getSubjects().add(sb7);
        k_2.getSubjects().add(sb8);

        k_3.getSubjects().add(sb9);
        k_3.getSubjects().add(sb10);
        k_3.getSubjects().add(sb11);
        k_3.getSubjects().add(sb12);


        en.getTransaction().begin();
        en.persist(k_1);
        en.persist(k_2);
        en.persist(k_3);
        en.getTransaction().commit();

        /*sb1.setTeacher(t1);
        sb2.setTeacher(t2);
        sb3.setTeacher(t3);
        sb4.setTeacher(t1);*/

        t1.getSubjects().add(sb1);
        t1.getSubjects().add(sb2);
        t1.getSubjects().add(sb3);
        t1.getSubjects().add(sb4);
        t2.getSubjects().add(sb5);
        t2.getSubjects().add(sb6);
        t2.getSubjects().add(sb7);
        t2.getSubjects().add(sb8);
        t3.getSubjects().add(sb9);
        t3.getSubjects().add(sb10);
        t3.getSubjects().add(sb11);
        t3.getSubjects().add(sb12);


        en.getTransaction().begin();
        en.persist(k_1);
        en.persist(k_2);
        en.persist(k_3);
        en.getTransaction().commit();

                    //Query q1 = en.createQuery("SELECT u.firstName, u.familyName, u.klasa_id FROM student u, klasa k, subject s WHERE u.klasa_id = k.klasa_id AND k.id = s.klasa_id")

                    //Query q1 = en.createQuery("SELECT u FROM Student u INNER JOIN Klasa k ON u.klasa.id = k.id WHERE u.klasa.id = 1", Student.class);
        //Query q1 = en.createQuery("SELECT DISTINCT u FROM Student u JOIN Klasa k ON u.klasa.id = k.id JOIN Subject s ON s.klasa.id = k.id", Student.class);
                    //Query q1 = en.createQuery("SELECT DISTINCT p FROM Student u JOIN u.firstName e JOIN e. d", Student.class);
        //List<Student> students = q1.getResultList();

            //en.getTransaction().begin();
        //Query q = en.createNativeQuery("SELECT s.firstName FROM student s");
            //List<Object[]> students = q.getResultList();
       // List<Student> students = q.getResultList();

       // for(Student std : students)
        //{
        ///    System.out.println(std.getAge());
            //log.info(s[0]);
        //}
         //en.getTransaction().commit();

        //
            // SELECT DISTINCT s.firstName, s.familyName, klasa.id, sb.subjectName FROM student, klasa, subject WHERE student.klasa_id = klasa.id AND klasa.id = subject.klasa_id HAVING student.firstName = "olaf"
            // Query q1 = en.createNativeQuery("SELECT DISTINCT s.firstName, s.familyName FROM student s JOIN klasa k WHERE s.klasa_id = k.id");
        //Query q1 = en.createNativeQuery("SELECT DISTINCT s.firstName, s.familyName FROM student s JOIN klasa k WHERE s.klasa_id = k.id");
        Query q1 = en.createNativeQuery("SELECT DISTINCT student.firstName, student.familyName, klasa.id, subject.subjectName FROM student, klasa, subject WHERE student.klasa_id = klasa.id AND klasa.id = subject.klasa_id HAVING student.firstName=\"Olaf\"");
                /*List<Student> students = q1.getResultList();
                for (Student s : students) {
                    System.out.println("Author " + s.getfirstName());
                }*/
        List<Object[]> students = q1.getResultList();
        for (Object[] s : students)
        {
            System.out.println(s[0] + " " + s[1] + " " + s[2] + " " + s[3]);
            //System.out.println("Author "+ s[0] + " "+ s[1]);
        }



        /*List resultList = q1.getResultList();
        for (Object s : resultList)
        {
            System.out.println(s);
        }*/












        //System.out.println(q2.getResultList());

        //.get


        /*for(Student std : students)
        {
            //System.out.println(std.getfirstName() + " " + std.getFamilyName());
            System.out.println(std.toString());
        }*/

        System.out.println(" \n ");








        /*

        Student s2 = new Student();
        s2.setfirstName("Jan");
        s2.setFamilyName("Błaszczykowski");
        s2.setAge(16);
         */









        // --------------

        /*k.setTeacher(new Teacher());

        Teacher t1 = new Teacher();
        t1.setfirstName("Ryszard");
        t1.setFamilyName("Nowak");
        t1.setAge(48);
        t1.setKlasa(k);

        k.getTeacher(t1);

            en.getTransaction().begin();
            en.persist(k);
            en.getTransaction().commit();*/
















        /*// zad 6 :
        Query q = en.createQuery("SELECT p FROM Student p", Student.class);
        List<Student> people = q.getResultList();

        for(Student prsn : people)
        {
            System.out.println(prsn.getfirstName() + " " + prsn.getFamilyName());
        }

        System.out.println(" \n ");

        // zad 7 :

        Query up = en.createQuery("UPDATE Student p SET p.age=18 WHERE p.age<18");

        en.getTransaction().begin();
        up.executeUpdate();
        en.getTransaction().commit();


        // 8
                 System.out.println("\n zadanie 8: \n");

        System.out.println("\n count (object) =  \n" + Student.count);
        Object count = en.createQuery("select count(p) from Student p").getSingleResult();
        System.out.println("\n count (object) =  \n" + count);

        // 9
                System.out.println("\n zadanie 9: \n");
        Query qa = en.createQuery("SELECT p FROM Student p WHERE p.firstName LIKE 'A%'", Student.class);
        List<Student> people_a = qa.getResultList();

        for(Student prsn : people_a)
        {
            System.out.println(prsn.getfirstName() + " " + prsn.getFamilyName());
        }*/








    }
}
