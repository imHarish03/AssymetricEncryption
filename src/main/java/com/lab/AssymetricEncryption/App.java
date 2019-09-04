package com.lab.AssymetricEncryption;

/**
 * Hello world!
 *
 */
import java.security.*;
import java.security.spec.*;
import javax.crypto.*;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		try {
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
			keyPairGenerator.initialize(2048);

			KeyPair keyPair = keyPairGenerator.generateKeyPair();
			PublicKey publicKey = keyPair.getPublic();
			PrivateKey privateKey = keyPair.getPrivate();

			System.out.println(publicKey);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
