package com.demo.playerdao;

import java.util.List;

import com.demo.model.Player;

//Abstract layer with empty methods, needs the import of the encapsulated global instance class.

public interface PlayerDAO {

	public int addPlayer(Player player); // Player player points to the class Player to use their private variables, and use the get and set method, and string method
	//player variable is what we would input our new data to the database
	
	public int updatePlayerCity(int id, String newCity); //done
	public int deletePlayerById(int id);//done
	public Player getPlayerById(int id); //done
	public List<Player> getAllPlayers(); // done
	public List<Player> getAllPlayersByAge(int age); //done
	
	public List<Player> getAllPlayersByTeamName(String teamname);// done
	public List<Player> getAllPlayersByTeamLocation(String location); // done
	public List<Player> getAllPlayersByTeamId(String teamid);//done
	public List<Player> getAllPlayersByCity(String city);

}
