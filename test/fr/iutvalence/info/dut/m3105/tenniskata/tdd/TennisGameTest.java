package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	
	TennisGame tennisgame = new TennisGame();

	@Test
	public void testSiScore0A0EtLoveAll()
	{
		Assert.assertEquals(this.tennisgame.getScore(), "love-all");
	}

	
}
