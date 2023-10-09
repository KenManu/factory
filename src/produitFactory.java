public abstract class produitFactory {
    public produitA getProduitA(){
        return createProduitA();
    }
    protected abstract  produitA createProduitA();
}
