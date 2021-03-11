package com.demo.main;

import java.util.List;

import com.demo.model.Player;
import com.demo.playerdao.PlayerDAO;
import com.demo.playerdao.impl.PlayerDAOImpl;

//presentation layer? Where we add new data, delete, read, update data to the database
public class PlayerMain {

	public static void main(String[] args) {
		
		PlayerDAO dao=new PlayerDAOImpl();
		
		//Player p=new Player(110, "Raj", "Bangalore", 23, "M");
		
	//	int c=dao.addPlayer(p);
	//	if(c>0) {
	//		System.out.println("Player registered with below details");
	//		System.out.println(p);
	//	}else {
	//		System.out.println("Failure in registration");
	//	}

	//	List<Player> playerList = dao.getAllPlayers();
	//	if (playerList.size() == 0) {
	//		System.out.println("No players as of now in DB");
	//	} else {
	//		System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
	//		System.out.println("Printing their details");
	//		for (Player p : playerList) {
	//			System.out.println(p);
	//		}
	//	}
		
	//	int c = dao.updatePlayerCity(101, "Bangalore");
	//	if(c>0) {
	//		System.out.println("Player updated");		
	//	}else {
	//		System.out.println("Update Failed");
	//	}
		
	//	int c = dao.deletePlayerById(101);
	//	if(c>0) {
	//		System.out.println(c+" successfully deleted");
	//	}else {
	//		System.out.println("Unable to delete");
	//	}
		
	//	List<Player> playerList = dao.getAllPlayersByAge(23);
	//		if (playerList.size() == 0) {
	//			System.out.println("No players as of now in DB");
	//		} else {
	//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
	//			System.out.println("Printing their details");
	//			for (Player p : playerList) {
	//				System.out.println(p);
	//			}
	//		}
	//	String teamName="ABC Riders";
	//	List<Player> playerList = dao.getAllPlayersByTeamName(teamName);
	//	if (playerList.size() == 0) {
	//		System.out.println("No players as of now from the teamName "+teamName);
	//	} else {
	//		System.out.println("Total there are " + playerList.size() + " no of player/s in DB from team : "+teamName);
	//		System.out.println("Printing their details");
	//		for (Player p : playerList) {
	//			System.out.println(p);
	//		}
	//	}

	//String Location="Bangalore";
	//List<Player> playerList = dao.getAllPlayersByTeamLocation(Location);
	//if (playerList.size() == 0) {
	//	System.out.println("No players as of now from the location "+Location);
	//} else {
	//	System.out.println("Total there are " + playerList.size() + " no of player/s in DB from team : "+Location);
	//	System.out.println("Printing their details");
	//	for (Player p : playerList) {
	//		System.out.println(p);
	//}
	//}
//	String teamid="T0001";
//	List<Player> playerList = dao.getAllPlayersByTeamId(teamid);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now with team id "+teamid);
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from teamid : "+teamid);
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//		}
//		}
		String city="Bangalore";
		List<Player> playerList = dao.getAllPlayersByCity(city);
			if (playerList.size() == 0) {
				System.out.println("No players in "+city);
			} else {
				System.out.println("Total there are " + playerList.size() + " no of player/s in DB from city : "+city);
				System.out.println("Printing their details");
				for (Player p : playerList) {
					System.out.println(p);
			}
			}
		
		
	}
}
