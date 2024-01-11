package ma.assemNihal;

public class Produit {
	private long id;
	private String nom;
	private double prix;
	private int quantite;
	
	public Produit(long id,String nom,double prix,int quantite) 
	{
		this.id=id;
		this.nom=nom;
		this.prix=prix;
		this.quantite=quantite;
		
	}
	
	public Produit() 
	{
		
	}
	
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	

}
}
