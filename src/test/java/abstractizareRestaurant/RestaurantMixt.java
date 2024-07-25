package abstractizareRestaurant;

public class RestaurantMixt extends Restaurant implements VeganInterface, NonVeganInterface{
    public RestaurantMixt(String numeRestaurant, String adresa, String meniu, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, meniu, delivery, tipRestaurant);
    }

    @Override
    public void gatesteNonVegan() {

    }

    @Override
    public void gatesteVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
    //de incercat sa reproduc o nationala de fotbal
    // primul nivel este persoana(clasa)
    //mai departe mergem la fotbalist/antrenor/medic
    //antrenor are comportament specific antreneaza, incurajeaza, (o interfata)
    //medic interfata consulta, tratamente,
    //fotbalist (mai multe tipuri de fotbalisti) prin pozitii si actiuni. toate actiunile sa fie puse intr-o clasa nationala
    //toti portarii
}
