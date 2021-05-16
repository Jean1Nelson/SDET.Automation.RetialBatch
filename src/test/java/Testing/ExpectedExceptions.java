package Testing;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	@Test(expectedExceptions = { IOException.class })
	public void test1() throws IOException {
		System.out.println("test1 ............");
		throw new IOException();
	}

	@Test(expectedExceptions = { NullPointerException.class })
	public void test2() {
		System.out.println("test2....................");
	}

	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass message test")
	public void exceptionTest1() throws IOException {
		throw new IOException("Pass message test");
	}

	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = ".* message .*")
	public void exceptionTest2() throws IOException {
		throw new IOException("Pass message test");
	}

	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = ".* test1")
	public void exceptionTest3() throws IOException {
		throw new IOException("Fail message test");
	}

}
