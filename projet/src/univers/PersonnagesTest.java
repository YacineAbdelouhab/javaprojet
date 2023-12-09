package univers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PersonnagesTest {

	Personnages perso_test;
	
	@BeforeEach
	public void init_perso_test() {
		perso_test = new Personnages(Personnages_du_jeu.Pere);
	}
	
	@Test
	public void to_String_test() {
		perso_test.to_String();
		assertEquals(true,true);
	}
	
	@Test
	public void maj_naturelle_attributs_generaux_Personnages_Test_tjr_vivant(){
		this.perso_test.maj_naturelle_attributs_generaux_Personnages();
		boolean verif = false;
		if(this.perso_test.get_barre_eau() == 67 && this.perso_test.get_barre_nourriture() == 80 && this.perso_test.get_barre_mentale() == 75 && this.perso_test.get_barre_energie() == 90  ) {
			verif = true;
		}
		assertEquals(true,verif);
	}
	
}
