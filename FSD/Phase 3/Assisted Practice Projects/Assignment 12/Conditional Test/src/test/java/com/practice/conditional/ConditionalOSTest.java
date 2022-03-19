package com.practice.conditional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Conditiona Test")
@RunWith(JUnitPlatform.class)
public class ConditionalOSTest 
{
	
	@Test
	@EnabledOnOs(value = OS.WINDOWS)
	void runonwindows()
	{
		System.out.println("Run on windows");
	}
	@Test
	@EnabledOnOs(value = OS.LINUX)
	void runonLinux()
	{
		System.out.println("Run on Linux");
	}
	@EnabledOnOs(value = OS.MAC)
	void runOnMac()
	{
		System.out.println("Run on Mac");
	}
	@Test
	@EnabledOnJre(value =)
	void runOnJRE()
	{
		System.out.println("This Program is runnion on jre 8");
	}
}
