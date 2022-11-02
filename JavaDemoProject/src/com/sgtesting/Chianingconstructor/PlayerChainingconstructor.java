package com.sgtesting.Chianingconstructor;
class Player
{
	Player(String name)
	{
		System.out.println("Player Name:"+name);
	}
	Player(int noofmatches)
	{
		this("M S DHONI");
		System.out.println("Player No of ODI Matches Played:"+noofmatches);
	}
	Player(String nickname,int noofruns)
	{
		this(538);
		System.out.println("Player Nickname:"+nickname+"Number of runs scored in IPL:"+noofruns);
	}

}


public class PlayerChainingconstructor {

	public static void main(String[] args) {

		Player P1=new Player("CAPTAIN COOL",4978);
	}


}


