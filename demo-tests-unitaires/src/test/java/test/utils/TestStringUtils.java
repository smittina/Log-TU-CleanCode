package test.utils;
import org.junit.Test;

import dev.utils.StringUtils;
import org.junit.Assert;

/**
 * Classe permettant de tester la classe dev.utils.StringUtils
 * @author Formation
 *
 */
public class TestStringUtils {

	/**
	 * Teste le bon fonctionnement du calcul de la distance de Leveinstein
	 */
	@Test
	public void testLevenshteinDistance() {
		int valeurObtenue = StringUtils.levenshteinDistance("Chien", "Chine");
		Assert.assertEquals(2,valeurObtenue);
		valeurObtenue = StringUtils.levenshteinDistance("Chien", "Chien");
		Assert.assertEquals(0, valeurObtenue);	
		valeurObtenue = StringUtils.levenshteinDistance("    ", "chat");
		Assert.assertEquals(4, valeurObtenue);
	}
	
	/**
	 * Permet de tester le comportement du calcul de la distance de Levenshtein dans le cas où un paramètre null est passé
	 */
	@Test
	public void testNullLevenshteinDistance() {
		int valeurObtenue = StringUtils.levenshteinDistance(null, "chat");
		Assert.assertEquals(-1, valeurObtenue);
	}
	
	
}
