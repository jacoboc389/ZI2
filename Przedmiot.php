<?php

namespace Jakub\Zi2Lab09;

use Doctrine\ORM\Mapping as ORM;

/**
 * @Entity
 */
class Przedmiot
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
     * @ManyToOne(targetEntity="Nauczyciel", inversedBy="przedmioty")
     */
    protected $nauczyciel;
    /**
     * @ManyToOne(targetEntity="Klasa", inversedBy="przedmioty")
     */
    protected $klasa;

    public function getName()
    {
        return $this->name;
    }
    public function setName($name)
    {
        $this->name = $name;
    }
    public function setNauczyciel(Nauczyciel $nauczyciel)
    {
        $nauczyciel->addPrzedmiot($this);
        $this->nauczyciel = $nauczyciel;
    }
    public function getNauczyciel()
    {
        return $this->nauczyciel;
    }
    public function setKlasa(Klasa $klasa)
    {
        $klasa->addPrzedmiot($this);
        $this->klasa = $klasa;
    }
    public function getKlasa()
    {
        return $this->klasa;
    }
}