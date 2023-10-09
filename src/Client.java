

    public class Client {
        public  static  void main (String[] args){
            produitFactory produitFactory = new produitFactory();

            produitA produitA = null;
            produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUITA1);
            produitA.methodeA();

            produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUITA2);
            produitA.methodeA();

            produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUITA3);
            produitA.methodeA();

        }
    }
