package Programs_IQ;

import java.util.Random;

import org.testng.annotations.Test;

public class GenerateRandomUsername_Pass {

	
	public static String generateRandom_SXM_TestUser() {
		String mychars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder stringBuildr = new StringBuilder();
		Random rnd = new Random();
		while (stringBuildr.length() < 8) { // length of the random string.
			int index = (int) (rnd.nextFloat() * mychars.length());
			stringBuildr.append(mychars.charAt(index));
		}

		String characters = stringBuildr.toString();
		String sxmTestUser = "TestUser";
		StringBuilder stringBuilder = new StringBuilder(sxmTestUser);

		String randomTestUser = stringBuilder.append(characters).toString();

		return randomTestUser;

	}

	public static String generateRandomPassword() {
		
		String mychars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder stringBuildr = new StringBuilder();
		Random rnd = new Random();
		while (stringBuildr.length() < 8) { // length of the random string.
			int index = (int) (rnd.nextFloat() * mychars.length());
			stringBuildr.append(mychars.charAt(index));
		}

		String characters = stringBuildr.toString();
		String password = "password";
		StringBuilder stringBuilder = new StringBuilder(password);

		String randomPassword = stringBuilder.append(characters).toString();

		return randomPassword;
	}
	
	@Test(enabled = true)
	public void testGenerator() {
		
		String randomUser = generateRandom_SXM_TestUser();
		String randomPass = generateRandomPassword();
	
		System.out.println("randomUser : "+randomUser);
		System.out.println("randomPass : "+ randomPass);
	}
	
	
}
