package oop;

public class MasinaConfigurator {

    public String marca;
    public String model;
    public Integer an;
    public Double pretStandard;
    public Double pretFinal;

    public MasinaConfigurator(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;

    }

    //OOP = PROGRAMARE ORIENTATA OBIECT
    //OOP = 4 PRINCIPII => MOSTENIRE, INCAPSULARE, POLIMORFISMUL, ABSTRACTIZARE
    //MOSTENIREA: CONCEPTUL PRIN CARE O CLASA MOSTENESTE O ALTA CLASA
    //CLASA CARE ESTE MOSTENITA = PARINTE
    //CLASA CARE MOSTENESTE = COPIL
    //IN JAVA PUTEM MOSTENI O SINGURA CLASA
    //MOSTENIREA SE REALIZEAZA CU CUVANTUL "EXTENDS"
    //CAND COPILUL MOSTENESTE PARINTELE, COPILUL TREBUIE SA APELEZE CONSTRUCTORUL DIN PARINTE
    //COPILUL VA AVEA ACCES LA PROPRIETATILE/METODELE DIN CLASA PARINTE (DACA SE FOLOSESTE PUBLIC/PROTECTED/DEFAULT)
    //CA SA APELAM CONSTRUCTORUL DIN PARINTE IN COPIL SE FOLOSESTE CUVANTUL "SUPER"

    public void infoMasina(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul fabricatiei este: " + an);


    }
}
