package ma.ensa.model;

public class Article {
	int code;
	String designation;
	int stock;
	double prix;
	String categorie;
	String photo;
	public Article(int code, String designation, int stock, double prix, String categorie, String photo) {
		super();
		this.code = code;
		this.designation = designation;
		this.stock = stock;
		this.prix = prix;
		this.categorie = categorie;
		this.photo = photo;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	@Override
	public String toString() {
		return "Article [code=" + code + ", designation=" + designation + ", stock=" + stock + ", prix=" + prix
				+ ", categorie=" + categorie + "]";
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
