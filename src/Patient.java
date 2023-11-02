import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient {

	public String nom;
	public String prenom;
	public String numeroDeTelephone;
	public char sexe;
	public long numSecu;
	public LocalDate dateNaissance;
	public String commentaires;

	public void afficher() {

		System.out.println("### Patient ###");
		System.out.println(prenom + " " + nom);
		System.out.println("\tTel. :" + numeroDeTelephone);
		System.out.println("\tSECU : " + numSecu + " (sexe : " + sexe + ", date naissance : "
				+ dateNaissance.format(DateTimeFormatter.ofPattern("d MMMM yyyy")) + ") ");
		System.out.println("Commentaires : " + commentaires);
//		### Patient ### 
//		Hillary Vambuce 
//		Tel. :0123456789 
//		SECU : 287060244010154 (sexe : F, date naissance : 1987-06-02) 
//		Commentaires : Allergie aux arachides 
	}

}
