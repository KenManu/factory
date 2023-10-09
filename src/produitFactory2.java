public class produitFactory2 extends produitFactory {
    protected produitA createProduitA(){
        return new produitA2();
    }
}