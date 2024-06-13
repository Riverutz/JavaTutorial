package obiect;

public class Sportiv {

    //Programarea moderna funcționează pe conceptul de programarea orientata obiect (OOP).
    //Programarea orientata obiect se bazează pe interacțiunea cu obiecte
    //OBIECT = instanța unei clase
    //Putem defini un obiect doar daca avem un constructor.
    //CONSTRUCTORUL = are ca rol sa inițializeze atributele unei
    //Într-o clasa recunoaștem un constructor dupa numele acesteia
    //Constructorul este de cele mai multe ori public
    //Într-o clasa pot sa fie mai mulţi constructori diferențiați dupa numarul sau tipul de parametrii
    //Într-o clasa avem un constructor by default.
    //In momentul când se definește un obiect se apelează constructorul dintr-o clasa putem defini mai multe obiecte
    //Obiectele se diferențiază prin nume si valorile date
    //Un obiect se instanteaza folosind cuvantul „new
    //Un obiect se poate defini in orice clasa din orice pachet
    //In momentul cand instantiem un obiect, putem avea acces la toate variabilele/metodele din clasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public Character sex;
    public String sportPracticat;
    public Boolean teamEvent;
    public Integer salariu;

    //CONSTRUCTOR / comanda rapida = click-dreapta>generate>constructor>selectam toti parametrii


    public Sportiv(String nume, String prenume, Integer varsta, Character sex, String sportPracticat, Boolean teamEvent) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.teamEvent = teamEvent;
    }

    public Sportiv(String nume, String prenume, Integer varsta, Character sex, String sportPracticat, Boolean teamEvent, Integer salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.teamEvent = teamEvent;
        this.salariu = salariu;
    }

    public void prezentareSportiv(){
        System.out.println("Numele sportivului este " + nume);
        System.out.println("Prenumele sportivului este " + prenume);
        System.out.println("Varsta sportivului este " + varsta);
        System.out.println("Sportivul este de sex " + sex);
        System.out.println("Sportul practicat de catre sportiv este " + sportPracticat);
        System.out.println("Este un sport de echipa? "+ teamEvent);
        if (salariu!=null){
        System.out.println("Salariul sportivului este " + salariu);
        }


    }

    public void verificareVarsta(){
        if (varsta>=18){
            System.out.println("Sportivul este major. ");
        }else {
            System.out.println("Sportivul este minor. ");
        }
    }
    public void marireSalar(Integer procent){
        if (salariu!=null){
            Integer marire = (salariu * procent)/100;
            salariu = salariu+marire;
            System.out.println("Noul salar este " + salariu);
        }else{
            System.out.println("Sportivul nu are salar ");
        }

    }

}





