package construction.singleton;

public class TestSingleton {
    public static void main(String[] args) {

        int som = Arithmetique.getInstance().somme(2, 5);
        System.out.printf("la somme est %d \n",som);

        int prod = Arithmetique.getInstance().produit(2, 5);
        System.out.printf("le produit est %d \n",prod);

        int soust = Arithmetique.getInstance().soustraction(2, 5);
        System.out.printf("la soustraction est %d \n",soust);

        float moy = Arithmetique.getInstance().moyenne(2, 5);
        System.out.printf("la moyenne est %f \n",moy);

        Arithmetique s1 = Arithmetique.getInstance(2, 5);
        s1.affiche();

        Arithmetique s2 = Arithmetique.getInstance(8, 3);
        s2.affiche();
    }
}
