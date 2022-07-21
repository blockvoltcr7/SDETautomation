package Lib;

import java.util.Random;

public class Lib {

	
	public static String generateRandom_TestUser() {
		String mychars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder stringBuildr = new StringBuilder();
		Random rnd = new Random();
		while (stringBuildr.length() < 8) { // length of the random string.
			int index = (int) (rnd.nextFloat() * mychars.length());
			stringBuildr.append(mychars.charAt(index));
		}

		String characters = stringBuildr.toString();
		String sxmTestUser = "Test";
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
		String randomPass = "pass";
		StringBuilder stringBuilder = new StringBuilder(randomPass);

		String randomTestUser = stringBuilder.append(characters).toString();
		
		
		return randomPass;
	}
}
