// Java Program to Implement the RSA Algorithm
import java.math.*;
import java.util.*;

class RSA {
	public static void main(String args[])
	{
		int p, q, n, z, pvt_key = 0, pub_key, i;

		// The number to be encrypted and decrypted
		int msg = 10;
		double cipher;
		BigInteger plain;

		// 1st prime number p
		p = 3;

		// 2nd prime number q
		q = 11;
		n = p * q;
		z = (p - 1) * (q - 1);
		System.out.println("the value of z = " + z);

		for (pub_key = 2; pub_key < z; pub_key++) {

			
			if (gcd(pub_key, z) == 1) {
				break;
			}
		}
		System.out.println("the value of public key = " + pub_key);
		for (i = 0; i <=9 ; i++) {
			int x = 1 + (i * z);

			if (x % pub_key == 0) {
				pvt_key = x / pub_key;
				break;
			}
		}
		System.out.println("the value of private key = " + pvt_key);
		cipher = (Math.pow(msg, pub_key)) % n;
		System.out.println("Encrypted message is : " + cipher);

		// converting int value of n to BigInteger
		BigInteger N = BigInteger.valueOf(n);

		// converting float value of c to BigInteger
	BigInteger C = BigDecimal.valueOf(cipher).toBigInteger();
		plain = (C.pow(pvt_key)).mod(N);

System.out.println("Decrypted message is : "+ plain);
	}

	static int gcd(int e, int z)
	{
		if (e == 0)
			return z;
		else
			return gcd(z % e, e);
	}
}
