package ma.assemNihal;

import java.util.ArrayList;
import java.util.List;

public class ProduitService {

	private List<Produit> produits;

	public ProduitService() {
		this.produits = new ArrayList<>();
	}

	public void Ajouter(Produit produit) {
		boolean verifid = false;
		boolean verifnom = false;

		for (Produit exProduit : produits) {
			if (exProduit.getId()==(produit.getId())) {
				verifid = true;
				break;
			}

			if (exProduit.getNom().equals(produit.getNom())) {
				verifnom = true;
				break;
			}
		}

		if (!verifid && !verifnom) {
			if (produit.getPrix() >= 0 && produit.getQuantite() >= 0) {
				produits.add(produit);
			} else {
				throw new IllegalArgumentException("Le prix et la quantité doivent être positifs.");
			}

		} else {
			throw new IllegalStateException("Le produit existe déjà.");
		}
	}

	

	public List<Produit> Selecttous() {
		return new ArrayList<>(produits);
	}

	public Produit SelectParId(Long id) {
		for (Produit produit : produits) {
			if (produit.getId()==id) {
				return produit;
			}
		}
		return null;
	}

}
