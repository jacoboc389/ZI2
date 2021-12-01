    <?php

    // Ten skrypt ma wykonywać operacje na bazie danych

    use Jakub\Zi2Lab09\Uczen;
    use Jakub\Zi2Lab09\Klasa;
    use Jakub\Zi2Lab09\Nauczyciel;
    use Jakub\Zi2Lab09\Przedmiot;

    require_once __DIR__ . '/bootstrap.php';

    $imie = array("Jakub", "Wojtek", "Michał", "Kamil", "Marcin", "Stefan");
    $nazwisko = array("Kowalski", "Nowak", "Jakubowski", "Woźniak", "Marciniak", "Zięba");

    $u1 = new Uczen();
    $u2 = new Uczen();
    $u3 = new Uczen();
    $u4 = new Uczen();
    $u5 = new Uczen();
    $u6 = new Uczen();

    //$u -> setId(1);
    $u1 -> setName($imie[0]);
    $u1 -> setSurname($nazwisko[0]);
    $u1 -> setAge(19);

    $u2 -> setName($imie[1]);
    $u2 -> setSurname($nazwisko[1]);
    $u2 -> setAge(21);

    $u3 -> setName($imie[2]);
    $u3 -> setSurname($nazwisko[2]);
    $u3 -> setAge(16);

    $u4 -> setName($imie[3]);
    $u4 -> setSurname($nazwisko[3]);
    $u4 -> setAge(18);

    $u5 -> setName($imie[4]);
    $u5 -> setSurname($nazwisko[4]);
    $u5 -> setAge(17);

    $u6 -> setName($imie[5]);
    $u6 -> setSurname($nazwisko[5]);
    $u6 -> setAge(19);

    /* echo 'Name utworzonego obiektu: ' . $u1->getName(); echo "\n";
    echo 'Surname utworzonego obiektu: ' . $u1->getSurname(); echo "\n";
    echo 'Age utworzonego obiektu: ' . $u1->getAge(); echo "\n\n";

    echo 'Name utworzonego obiektu: ' . $u2->getName(); echo "\n";
    echo 'Surname utworzonego obiektu: ' . $u2->getSurname(); echo "\n";
    echo 'Age utworzonego obiektu: ' . $u2->getAge(); echo "\n";*/

    $k1 = new Klasa();
    $k1->setName("Klasa 5c");
    $k1->setNumber(5);

    $k2 = new Klasa();
    $k2->setName("Klasa 1d");
    $k2->setNumber(1);

    $k3 = new Klasa();
    $k3->setName("Klasa 3a");
    $k3->setNumber(3);

    /*$k->addUczen()[] = $u1;
    $k->addUczen()[] = $u2;*/

    // Dodawanie uczniów do klas :

    $k1->addUczen($u1);
    $k1->addUczen($u2);

    $k2->addUczen($u1);
    $k2->addUczen($u2);

    $k3->addUczen($u1);
    $k3->addUczen($u2);

    $u1->setKlasa($k1);
    $u2->setKlasa($k1);

    $u3->setKlasa($k2);
    $u4->setKlasa($k2);

    $u5->setKlasa($k3);
    $u6->setKlasa($k3);

    // Nauczyciele :

    $t1 = new Nauczyciel();
    $t1 -> setName("Paweł");
    $t1 -> setSurname("Sikorski");
    $t1 -> setAge(38);
    $t1->setKlasa($k1);

    $t2 = new Nauczyciel();
    $t2 -> setName("Bogdan");
    $t2 -> setSurname("Grochowski");
    $t2 -> setAge(42);
    $t2->setKlasa($k2);

    $t3 = new Nauczyciel();
    $t3 -> setName("Hubert");
    $t3 -> setSurname("Wawrzyniak");
    $t3 -> setAge(42);
    $t3->setKlasa($k3);

    // Przedmiot :

    $p1 = new Przedmiot();
    $p2 = new Przedmiot();
    $p3 = new Przedmiot();
    $p4 = new Przedmiot();
    $p5 = new Przedmiot();
    $p6 = new Przedmiot();

    $p1->setName("Matematyka");
    $p2->setName("Angielski");
    $p3->setName("Historia");
    $p4->setName("WF");
    $p5->setName("Religia");
    $p6->setName("Informatyka");

    $p1->setNauczyciel($t1);
    $p2->setNauczyciel($t1);

    $p3->setNauczyciel($t2);
    $p4->setNauczyciel($t2);

    $p5->setNauczyciel($t3);
    $p6->setNauczyciel($t3);

    $t1->addPrzedmiot($p1);
    $t1->addPrzedmiot($p2);

    $t2->addPrzedmiot($p3);
    $t2->addPrzedmiot($p4);

    $t3->addPrzedmiot($p4);
    $t3->addPrzedmiot($p5);

    // Klasa - przedmiot

    $k1->addPrzedmiot($p1);
    $k1->addPrzedmiot($p2);

    $p1->setKlasa($k1);
    $p2->setKlasa($k1);

    $k2->addPrzedmiot($p3);
    $k2->addPrzedmiot($p4);

    $p3->setKlasa($k2);
    $p4->setKlasa($k2);

    $k3->addPrzedmiot($p5);
    $k3->addPrzedmiot($p6);

    $p5->setKlasa($k3);
    $p6->setKlasa($k3);

    $em->persist($u1);
    $em->persist($u2);
    $em->persist($u3);
    $em->persist($u4);
    $em->persist($u5);
    $em->persist($u6);

    $em->persist($k1);
    $em->persist($k2);
    $em->persist($k3);

    $em->persist($t1);
    $em->persist($t2);
    $em->persist($t3);

    $em->persist($p1);
    $em->persist($p2);
    $em->persist($p3);
    $em->persist($p4);
    $em->persist($p5);
    $em->persist($p6);
    $em->flush();