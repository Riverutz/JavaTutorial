package tema6;

import org.testng.annotations.Test;

public class Nationala extends Persoana implements FotbalistInterface, PortarInterface, AtacantCentral, AtacantLateral, FundasCentral, FundasLateral, MijlocasCentral, MijlocasLateral, MijlocasOfensiv, MijlocasDefensiv, AntrenorPrincipal, AntrenortSecund, MedicInterface, Fizioterapeut, AnalistVideo, PersonalAdministrativ {
    public Nationala(String nume, String prenume, String sex, Integer varsta, Integer inaltime) {
        super(nume, prenume, sex, varsta, inaltime);
    }

    @Override
    public void analizeazaMeciuri() {

    }

    @Override
    public void indruma() {
        System.out.println("Antrenorul indruma jucatorii.");
    }

    @Override
    public void antreneaza() {
        System.out.println("Antrenorul antreneaza jucatorii");
    }

    @Override
    public void organizeaza() {

    }

    @Override
    public void antreneazaFitness() {

    }

    @Override
    public void joacaInFataPortiiAdversarului() {

    }

    @Override
    public void creeazaOcazii() {

    }

    @Override
    public void atacaMingea() {

    }

    @Override
    public void faceAssisturi() {

    }

    @Override
    public void reabiliteazaJucătoriiAccidentați() {

    }

    @Override
    public void previneLeziunile() {

    }

    @Override
    public void joacaPeCentrulTerenului() {

    }

    @Override
    public void deposedeaza() {

    }

    @Override
    public void intercepțeazaMingea() {

    }

    @Override
    public void blocheazaAtacuri() {

    }

    @Override
    public void acoperaFlancurileTerenului() {

    }

    @Override
    public void ataca() {

    }

    @Override
    public void opresteAtacantii() {

    }

    @Override
    public void controleazaMijloculTerenului() {

    }

    @Override
    public void ajutaInAparare() {

    }

    @Override
    public void initeazaAtacul() {

    }

    @Override
    public void protejeazaApararea() {

    }

    @Override
    public void centreazaMingea() {

    }

    @Override
    public void joacaPeFlancuri() {

    }

    @Override
    public void creeazaOcaziiDeGol() {

    }

    @Override
    public void recupereazaMingea() {

    }

    @Override
    public void mentinePosesiaMingii() {

    }

    @Override
    public void apara() {
        Persoana persoana = new Persoana("Florin", "Nita", "Masculin", 37, 185);
        System.out.println("Portarul nationalei este " + getNume() + getPrenume());


    }

    @Override
    public void alearga() {

    }

    @Override
    public void paseaza() {

    }

    @Override
    public void suteaza() {

    }

    @Override
    public void dribleaza() {

    }

    @Override
    public void faulteaza() {

    }

    @Override
    public void marcheaza() {

    }

    @Override
    public void iaPauza() {

    }

    @Override
    public void oferaIngrijiriMedicale() {

    }

    @Override
    public void gestioneazaRecuperareaJucatorilor() {

    }

    @Override
    public void coordoneaza() {

    }

    @Override
    public void gestioneazaLogistica() {

    }

    @Override
    public void gestioneazaProgrameleDeMeciuri() {

    }
}
