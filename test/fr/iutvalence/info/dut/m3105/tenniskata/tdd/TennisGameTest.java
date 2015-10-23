package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	
	TennisGame tennisgame = new TennisGame();

	@Test
	public void testIfStartGameLove_All()
	{
		Assert.assertEquals(this.tennisgame.getScore(), "love-all");
	}
	
	@Test
	public void testIfServerMarkFifteen_Love()
	{
		this.tennisgame.serverMark();
		Assert.assertEquals(this.tennisgame.getScore(), "fifteen-love");
	}
	
	@Test
	public void testIfReceiverMarkLove_Fifteen()
	{
		this.tennisgame.receiverMark();
		Assert.assertEquals(this.tennisgame.getScore(), "love-fifteen");
	}
}
