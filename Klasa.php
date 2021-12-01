<?php

namespace Jakub\Zi2Lab09;

use Doctrine\ORM\Mapping as ORM;  //metadane
//use \Doctrine\Common\Collections;

/**
 * @Entity
 */
class Klasa
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
     * @Column(type="integer")
     */
    protected $number;
    /**
     * @OneToMany(targetEntity="Uczen", mappedBy="klasa")
     */
    protected $uczniowie;

    /**
     * @OneToOne(targetEntity="Nauczyciel", mappedBy="nauczyciel")
     */
    protected $nauczyciel;

    /**
     * @OneToMany(targetEntity="Przedmiot", mappedBy="klasa")
     */
    protected $przedmioty;



    // get set ...

    /*public function __construct()
    {
        $this->uczniowie = new \Doctrine\Common\Collections\ArrayCollection();
    }*/


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
    public function getNumber()
    {
        return $this->number;
    }
    public function setNumber($number)
    {
        $this->number = $number;
    }

    public function addUczen(Uczen $uczen)
    {
        $this->uczniowie[] = $uczen;
    }

    public function addNauczyciel(Nauczyciel $nauczyciel)
    {
        $this->nauczyciel = $nauczyciel;
    }

    public function addPrzedmiot(Przedmiot $przedmiot)
    {
        $this->przedmioty[] = $przedmiot;
    }


}