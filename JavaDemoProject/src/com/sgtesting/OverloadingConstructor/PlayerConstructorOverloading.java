package com.sgtesting.OverloadingConstructor;
class Player
{
	Player(String name)
	{
		System.out.println("Player Name:"+name);
	}
	Player(int noofmatches)
	{
		System.out.println("Player No of ODI Matches Played:"+noofmatches);
	}
	Player(String nickname,int noofruns)
		{
			System.out.println("Player Nickname:"+nickname+"Number of runs scored in IPL:"+noofruns);
		}

}


public class PlayerConstructorOverloading {

	public static void main(String[] args) {
		Player P1=new Player(226);
		Player P2=new Player("SURESH RAINA");
		Player P3=new Player("Mr.IPL",5528);
	}
		

	}


