package ma.assemNihal;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProduitServiceTest {

    private ProduitService produitService;

    @Before
    public void setUp() {
        produitService = new ProduitService();
    }

    @Test
    public void testAjouterProduit() {
        Produit produit = new Produit(1L, "Ordinateur", 999.99, 10);
        produitService.Ajouter(produit);
        assertEquals(1, produitService.Selecttous().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAjouterProduitWithNegativePrice() {
        Produit produit = new Produit(1L, "Téléphone", -100.0, 5);
        produitService.Ajouter(produit);
    }

    @Test(expected = IllegalStateException.class)
    public void testAjouterExistingProduit() {
        Produit produit1 = new Produit(1L, "Livre", 20.0, 30);
        Produit produit2 = new Produit(1L, "Cahier", 10.0, 15);

        produitService.Ajouter(produit1);
        produitService.Ajouter(produit2); 
    }

   
    @Test
    public void testSelectParId() {
        Produit produit = new Produit(1L, "Écouteurs", 49.99, 30);
        produitService.Ajouter(produit);

        Produit selectedProduit = produitService.SelectParId(1L);
        assertNotNull(selectedProduit);
        assertEquals("Écouteurs", selectedProduit.getNom());
    }

    @Test
    public void testSelectParIdNonExisting() {
        assertNull(produitService.SelectParId(2L));
    }
    
    @Test
    public void testModifierProduit() {
        Produit produit = new Produit(1L, "Tablette", 199.99, 8);
        produitService.Ajouter(produit);

        Produit modifiedProduit = new Produit(1L, "Tablette Pro", 299.99, 5);
        produitService.Modifier(modifiedProduit);

        assertEquals("Tablette Pro", produitService.SelectParId(1L).getNom());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModifierProduitWithNegativeQuantity() {
        Produit produit = new Produit(1L, "Clavier", 49.99, 20);
        produitService.Ajouter(produit);

        Produit modifiedProduit = new Produit(1L, "Clavier mécanique", 69.99, -5);
        produitService.Modifier(modifiedProduit);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testModifierNonExistingProduit() {
        Produit produit = new Produit(1L, "Enceinte", 79.99, 15);
        produitService.Modifier(produit); 
    }



    
    
    
    
}
