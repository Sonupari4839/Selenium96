package com.test.actitime;

import org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi.generic;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic.actitime.BaseTest;

@Listeners(com.generic.actitime.Screenshot.class)
public class LoginLogout extends BaseTest
{
	@Test
	public void login()
	{
		Assert.fail();
		System.out.println("login()is executing");
	}
}
