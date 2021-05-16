package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTags {

	@Test(groups = { "smoketest" })
	public void test01() {
		System.out.println("test1 for smoke and sanity.......");
		Assert.assertEquals(false, true);
	}

	@Test(groups = { "automation" })
	public void test02() {
		System.out.println("test2 for automation.......");
	}

	@Test(dependsOnGroups = { "smoketest" }, groups = { "regression" })
	public void test03() {
		System.out.println("test 03 is dependent on group tag: smoke test");
	}

	@Test(dependsOnMethods = { "test03" })
	public void test04() {
		System.out.println("test 4 is dependent on method test03");
	}
}
