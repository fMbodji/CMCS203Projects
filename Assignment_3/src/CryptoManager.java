/*
 * Class: CMSC203 CRN 23103
 * Instructor: Ahmed Tarek
 * Description: CryptoManager that contains the 05 implemented methods
 * Due: 10/10/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
   
*/
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager { 
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		for (int i=0; i<plainText.length(); i++)
		{
			char c= plainText.charAt(i);
			if (c<LOWER_RANGE || c>UPPER_RANGE)
			{
				return false;
			}
		}
		return true;	
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		String encryptedText="";
		char encryptedChar=' ';	
//		for (int i=0; i<plainText.length(); i++)
//		{
//			char c= plainText.charAt(i);
//			if(c>=LOWER_RANGE && c<=UPPER_RANGE)
//			{
//				
////				encryptedChar = c + key;
////				if (encryptedChar > UPPER_RANGE) {
////					encryptedChar-= 26;
////				}
//			    encryptedText += (char) encryptedChar;
//			}
//			else
//			{
//				encryptedText+= c;
//			}	
//		}
		for (int i=0; i<plainText.length(); i++)
		{
			char c= plainText.charAt(i);
			if(c>=LOWER_RANGE && c<=UPPER_RANGE)
			{
				int encryptedInt= (c-LOWER_RANGE + key)% RANGE + (LOWER_RANGE);
				encryptedText+= (char)encryptedInt;		
				}
			else
			{
				encryptedText+= c;
			}	
						
		}
		return encryptedText;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		String encryptedText="";
		int encryptedChar;
		while (bellasoStr.length() < plainText.length())
		{
			bellasoStr+= bellasoStr;
		}	
		for (int i=0; i<plainText.length(); i++)
		{
			char c= plainText.charAt(i);
			if(c>=LOWER_RANGE && c<=UPPER_RANGE)
			{
				char bellasoChar=bellasoStr.charAt(i);
				encryptedChar = c + bellasoChar;
				while(encryptedChar>UPPER_RANGE)
				{
					encryptedChar-=RANGE;
				}	
				encryptedText+= (char) encryptedChar;
			}
			else
			{
				encryptedText+= c;
			}
		}	
		return encryptedText;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		String decryptedText="";
		char decryptedChar;
		int decryptedInt;
//		for (int i=0; i<encryptedText.length(); i++)
//		{
//			char c= encryptedText.charAt(i);
//			if(c>=LOWER_RANGE && c<=UPPER_RANGE)
//			{
//				decryptedChar= c - key;
//				if (decryptedChar<LOWER_RANGE)
//				{
//					decryptedChar+= 26;
//				}
//				decryptedText+= (char) decryptedChar;
//			}
//			else
//			{
//				decryptedText+= c;
//			}	
		
		for (int i=0; i<encryptedText.length(); i++)
			{
			char c= encryptedText.charAt(i);
			decryptedInt= (int)c - key ;

				while(decryptedInt<LOWER_RANGE)
				{
					decryptedInt+= UPPER_RANGE-LOWER_RANGE+1;
				}
				decryptedText+=(char) decryptedInt;
		}	
		return decryptedText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		String decryptedText="";
		int decryptedChar;
		while (bellasoStr.length() < encryptedText.length())
		{
			bellasoStr+= bellasoStr;
		}	
		for (int i=0; i<encryptedText.length(); i++)
		{
			char c= encryptedText.charAt(i);
			if(c>=LOWER_RANGE && c<=UPPER_RANGE)
			{
				char bellasoChar=bellasoStr.charAt(i);
				decryptedChar = c - bellasoChar;
				while(decryptedChar<LOWER_RANGE)
				{
					decryptedChar+=RANGE;
				}	
				decryptedText+= (char) decryptedChar;
			}
			else
			{
				decryptedText+= c;
			}
		}	
		return decryptedText;
	}
}
