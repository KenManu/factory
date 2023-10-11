package Construction.factory1;

import Construction.factory2.produitA;
import Construction.factory2.produitFactory;

public class Client {
    public  static  void main (String[] args){
        Construction.factory2.produitFactory produitFactory = new produitFactory();

        produitA produitA = null;

        produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUITA1);
        produitA.methodeA();

        produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUITA2);
        produitA.methodeA();

    }
}