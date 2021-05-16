package Testing;

import org.testng.annotations.Test;

public class GroupTags {

	@Test(groups = { "smoketest", "sanity" })
	public void test1() {
		System.out.println("test1 for smoke and sanity.......");
	}

	@Test(groups = { "automation" })
	public void test2() {
		System.out.println("test2 for automation.........");
	}

	@Test(groups = { "regression", "automation" })
	public void test3() {
		System.out.println("test3 for regression and automation");
	}

	@Test(groups = { "functional", "soak" })
	public void test4() {
		System.out.println("test4 for functional and soak test");
	}

	@Test(groups = { "performance" })
	public void test5() {
		System.out.println("test5 for performance test");
	}

}
