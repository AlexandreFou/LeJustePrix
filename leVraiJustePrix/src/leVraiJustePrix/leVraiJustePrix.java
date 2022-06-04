package leVraiJustePrix;

import java.util.Scanner;

public class leVraiJustePrix {

	public static void main(String[] args) {
		//je crée un nombre random entre O et 100 compris 
		//que l'utilisateur doit trouver
		double nbrRandom = Math.random();
		int nbrATrouver = (int)(nbrRandom * 100 + 1);
	
		//je crée une boucle qui se termine une fois que l'utilisateur
		// à trouver le bon nombre
		int i = 0;
		while(i == 0) {
	
			//je demande à l'utilisateur un nombre entre 1 et 100
			System.out.println("Donnez un nombre entre 1 et 100.");
			Scanner nbr = new Scanner(System.in);
			int nbrUtilisateur = nbr.nextInt();
	
			//je dis à l'utilsateur si c'est plus grand, plus petit ou le bon nombre
			if(nbrUtilisateur < nbrATrouver) {
				System.out.println("Le nombre a trouver est plus grand.");
			} 
			else if(nbrUtilisateur > nbrATrouver) {
				System.out.println("Le nombre a trouver est plus petit.");
			}
			else {
				System.out.println("Gagne! Vous avez trouve le nombre qui etait " 
				+ nbrATrouver + " :)");
				//si l'utilisateur à trouver le bon nombre je termine
				//la boucle
				i = 1;
			}
		}
		
	

	}
	

}
