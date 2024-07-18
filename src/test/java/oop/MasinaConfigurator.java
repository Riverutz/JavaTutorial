package oop;

public class MasinaConfigurator {

    private String marca;
    private String model;
    private Integer an;

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
    //INCAPSULARE = CONCEPTUL PRIN CARE SA SETAM ANUMITE RESTRICTII DE VIZIBILITATE PENTRU PROPRIETATI/METODE
    //POLIMORFISM= CONCEPTULPRIN CARE O METODA POATE AVEA IMPLEMENTARI DIFERITE
    //POLIMORFISMUL POATE SA FIE DE 2 FELURI: DINAMIC(OVERRIDE) SI STATIC(OVERLOAD)
    //POLIMORFISM DINAMIC: INTR-O IERARHIE DE CLASE OBTINUTE PRIN MOSTENIRE,
    // O METODA POATE AVEA IMPLEMENTARI DIFERITE

    //POLIMORFISMUL DINAMIC ESTE PREZENT DOAR LA MOSTENIRE
    //POLIMORFISMUL STATIC: DACA AVEM NEVOIE CA O METODA
    // SA FIE FOLOSITA IN DIFERITE CIRCUMSTANTE PUTEM DEFINI
    // MAI MULTE METODE CU ACELASI NUME AVAND UN NR DE PARAMETRI/TIP PARAMETRI DIFERITI

    public void infoMasina() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul fabricatiei este: " + an);
    }

    //POLIMORFISM DINAMIC
    public void pornesteMotor(){
        System.out.println("Masina se porneste cu ajutorul cheii");
    }
    public void deschidereGeam(){
        System.out.println("Geamurile masinii se deschid electric");
    }

    //POLIFORMISM STATIC
    public void promotieDacia(){
        System.out.println("Pentru luna iulie, Dacia nu are promotie.");
    }

    public void promotieDacia(String ticket){
        System.out.println("Daca ai " + ticket + ", primesti reducere!");
    }

    public void promotieDacia(Integer reducere){
        System.out.println("In luna Decembrie, Dacia primeste " + reducere + "% reducere!");
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public Integer getAn() {
        return an;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
