import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	CryptoManager cryptoManager;
	
	/**
	 * Test method for {@link CryptoManager#CeaserEncryption()}.
	 */
	@Test
	void testCeaserEncrypt() {
		String encryptedText=cryptoManager.caesarEncryption("FATIMA",6);
		assertEquals("LGZOSG", encryptedText );
	}

	/**
	 * Test method for {@link CryptoManager#CeaserDecryption()}.
	 */
	@Test
	void testCeaserDecrypt() {
		String decryptedText=cryptoManager.caesarDecryption("LGZOSG",6);
		assertEquals("FATIMA", decryptedText );
	}
	
	/**
	 * Test method for {@link CryptoManager#BellasoEncrypt()}.
	 */
	@Test
	void testBellasoEncrypt() {
		String encryptedText=cryptoManager.bellasoEncryption("HELLO","ABC");
		assertEquals("IGOMQ", encryptedText );
	}
	
	/**
	 * Test method for {@link CryptoManager#BellasoDecrypt()}.
	 */
	@Test
	void testBellasoDecrypt() {
		String decryptedText=cryptoManager.bellasoDecryption("IGOMQ","ABC");
		assertEquals("HELLO", decryptedText );
	}


}
