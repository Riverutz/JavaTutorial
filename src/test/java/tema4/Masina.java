package tema4;

public class Masina {
    public String marca;
    public String model;
    public Integer pret;
    public String caroserie;
    public Integer anulFabricatiei;
    public Float nrKm;
    public String combustibil;
    public Integer capacitateCilindrica;
    public Integer putere;
    public String transmisie;
    public Boolean esteInmatriculata;

    public Masina(String marca, String model, Integer pret, String caroserie, Integer anulFabricatiei, Float nrKm, String combustibil,
                  Integer capacitateCilindrica, Integer putere, String transmisie, Boolean esteInmatriculata) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.caroserie = caroserie;
        this.anulFabricatiei = anulFabricatiei;
        this.nrKm = nrKm;
        this.combustibil = combustibil;
        this.capacitateCilindrica = capacitateCilindrica;
        this.putere = putere;
        this.transmisie = transmisie;
        this.esteInmatriculata = esteInmatriculata;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este de " + pret + " EURO");
        System.out.println("Tipul carasoriei: " + caroserie);
        System.out.println("Anul fabricatiei: " + anulFabricatiei);
        System.out.println("Kilometraj: " + nrKm + " de KM");
        System.out.println("Combustibilul folosit este " + combustibil);
        System.out.println("Capacitatea cilindrica a motorului este de " + capacitateCilindrica + " cm3");
        System.out.println("Putere: " + putere + " CP");
        System.out.println("Transmisie: " + transmisie);
        System.out.println("Masina este inmatriculata? " + esteInmatriculata);
    }

    public void verificareKm() {
        if (nrKm > 243.251f) {
            System.out.println("Masina este foarte uzata.");
        } else {
            System.out.println("Masina nu este uzata.");
        }
    }

    public void verificareImpozit() {
        if (anulFabricatiei > 2010) {
            System.out.println("Masina are un impozit de 2%");
        } else {
            System.out.println("Masina are un impozit de 15%");

        }
    }
}





