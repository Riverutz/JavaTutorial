package abstractizareClasaAbstracta;

public abstract class Persoana {

    //RECUNOASTEM O CLASA ABSTRACTA DUPA CUVANTUL ABSTRACT
    //CLASA ABSTRACTA POATE SA NU SA CONTINA METODE ABSTRACTE
    //INTR-O CLASA ABSTRACTA PUTEM AVEA UN CONSTRUCTOR => NU PUTEM FACE UN OBIECT DIN CLASA ABSTRACTA
    //O CLASA POATE MOSTENI DOAR O SINGURA CLASA/CLASA ABSTRACTA
    //O CLASA ABSTRACTA POATE IMPLEMENTA UNA SAU MAI MULTE INTERFETE
    //INTR-O CLASA ABSTRACTA PUTEM AVEA METODA VOID SAU RETURN
    //METODELE ABSTRACTE DINTR-O CLASA ABSTRACTA TREBUIE SA AIBE ACCESS CONTROL

    private String nume;
    private String prenume;
    private Integer varsta;
    private Double inaltime;
    private Character sex;

    public Persoana(String nume, String prenume, Integer varsta, Double inaltime, Character sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.sex = sex;
    }

    public abstract void mananca();

    public abstract void doarme();

    public abstract void iaPauza();

    public abstract void iaSalar();

    public abstract void mergeLaServiciu();

    public abstract void desfasoaraActivitatea();

    public abstract void beaCafea();

    public abstract void incheieActivitatea();

    public abstract void cautaDeLucru();

    public abstract void depuneCV();

    public abstract void staAcasa();

    public abstract void mergeLaFacultate();

    public abstract void invata();

    public abstract void daExamen();

    public abstract void primesteNota();

    public abstract void mergeLaRestante();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Double getInaltime() {
        return inaltime;
    }

    public void setInaltime(Double inaltime) {
        this.inaltime = inaltime;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
