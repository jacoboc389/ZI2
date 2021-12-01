<?php

namespace Jakub\Zi2Lab09;

use Doctrine\ORM\Mapping as ORM;  //metadane

/**
 * @Entity
 */
class Uczen
{
    /**
     * @Id
     * @Column(type="integer")
     * @GeneratedValue
     */
    protected $id;
    /**
     * @Column(type="string")
     */
    protected $name;
    /**
     * @Column(type="string")
     */
    protected $surname;
    /**
     * @Column(type="integer")
     */
    protected $age;

    /**
     * @ManyToOne(targetEntity="Klasa", inversedBy="uczniowie")
     */
    protected $klasa;

    public function getId()
    {
        return $this->id;
    }
    /*public function setId($id) // ! NIE POWINNIŚMY USTAWIAĆ ID !           // ID autoincrement
    {
        $this->id = $id;
    }*/

    public function getName()
    {
        return $this->name;
    }
    public function setName($name)
    {
        $this->name = $name;
    }
    public function getSurname()
    {
        return $this->surname;
    }
    public function setSurname($surname)
    {
        $this->surname = $surname;
    }
    public function getAge()
    {
        return $this->age;
    }
    public function setAge($age)
    {
        $this->age = $age;
    }

    /*public function addKlasa(Klasa $klasa)
    {
        $this->klasa = $klasa;
    }*/

    /*public function setKlasa(Klasa $klasa)
    {
        $this->klasa = klasa;
    }

    public function getKlasa()
    {
        return $klasa;
    }*/

    public function setKlasa(Klasa $klasa)
    {
        $klasa->addUczen($this);
        $this->klasa = $klasa;
    }
    public function getKlasa()
    {
        return $this->klasa;
    }
}