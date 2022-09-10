package com.godoro.league;

import java.util.ArrayList;

public class Test2 {
	
	public static void main(String[] args) {
		
		League league=new League(601,"Süper Lig");
		league.setTeamList(new ArrayList<Team>());
		
		Team teamA=new Team(801,"Godoro Spor");
		teamA.setPlayerList(new ArrayList<>());
		league.getTeamList().add(teamA);
		
		Player playerA1=new Player(401,"Teoman Alpay",4.67);
		teamA.getPlayerList().add(playerA1);
		
		Player playerA2=new Player(402,"Yusuf Nalkesen",7.89);
		teamA.getPlayerList().add(playerA2);
		
		Player playerA3=new Player(404,"Avni Anýl",6.61);
		teamA.getPlayerList().add(playerA3);
		
		Team teamB=new Team(802,"Fibiler Spor");
		teamB.setPlayerList(new ArrayList<>());
		league.getTeamList().add(teamB);
		
		Player playerB1=new Player(403,"Yýldýrým Gürses",2.93);
		teamB.getPlayerList().add(playerB1);
		
		Player playerB2=new Player(405,"Erdoðan Berker",8.11);
		teamB.getPlayerList().add(playerB2);
		
		System.out.println(league.getLeagueId()+" "+league.getLeagueName());
		
		for(Team team:league.getTeamList())
		{
			
			System.out.println("\t"+team.getTeamId()+" "+team.getTeamName());
			
			for(Player player:team.getPlayerList())
			{
				System.out.println("\t\t"+player.getPlayerId()+" "
				+player.getPlayerName()+" "
				+player.getAverageScore());
			}
		}
		
	}

}
