package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


	public class TennisGame
	{
		private String score;
		
		public TennisGame()
		{
			this.score = "love-all";
		}
		
		public String getScore()
		{
			return this.score;
		}

		public void serverMark() 
		{
			this.score = "fifteen-love";
		}
		
		public void receiverMark() 
		{
			this.score = "love-fifteen";
		}
		
		public void serverAndReceiverMarks()
		{
			
		}
	}
