package tema6;

public class Persoana {
    private String nume;
    private String prenume;
    private String sex;
    private Integer varsta;
    private Integer inaltime;

    public Persoana(String nume, String prenume, String sex, Integer varsta, Integer inaltime) {
        this.nume = nume;
        this.prenume = prenume;
        this.sex = sex;
        this.varsta = varsta;
        this.inaltime = inaltime;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Integer getInaltime() {
        return inaltime;
    }

    public void setInaltime(Integer inaltime) {
        this.inaltime = inaltime;
    }
}
