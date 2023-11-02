import java.time.LocalDate;

public class Application {

	public static void main(String[] args) {
		Patient hillary = new Patient();
		hillary.nom = "Vambuce";
		hillary.prenom = "Hillary";
		hillary.numeroDeTelephone = "0123456789";
		hillary.sexe = 'F';
		hillary.numSecu = 287060244010154L;
		hillary.dateNaissance = LocalDate.of(1987, 6, 2);
		hillary.commentaires = "Allergie aux arachides";
		hillary.afficher();
	}
}
