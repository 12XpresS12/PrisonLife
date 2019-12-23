package ScoreBoard;

import java.util.ArrayList;

import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import lombok.Getter;


public class TeamHandler {
	
	@Getter 
	private Scoreboard sb;
	
	@Getter 
	private ArrayList<Team> teams;
	
	public TeamHandler (Scoreboard sb) {
		this.sb = sb;
		this.teams = new ArrayList<Team>();
	}
	
	
	public void registerTeams() {
		registerTeam("prisoner_red", "§c");
		registerTeam("prisoner_yellow", "§e");
		registerTeam("guard", "§9");
		registerTeam("admin", "§cAdmin ");
	}
	
	public void registerTeam(String teamName, String prefix) {
		Team team = sb.getTeam(teamName);
		if(team == null) {
			sb.registerNewTeam(teamName);
		}
		team.setPrefix(prefix);
		teams.add(team);
	}
	
	
	
	/*
    public static void addScoreboard() {
        final Team red = Bukkit.getScoreboardManager().getMainScoreboard().registerNewTeam("prison_red");
        red.setPrefix("Â§c");
        red.setAllowFriendlyFire(false);
        final Team yellow = Bukkit.getScoreboardManager().getMainScoreboard().registerNewTeam("prison_yellow");
        yellow.setPrefix("Â§e");
        yellow.setAllowFriendlyFire(false);
        final Team guard = Bukkit.getScoreboardManager().getMainScoreboard().registerNewTeam("prison_guard");
        guard.setPrefix("Â§9");
        guard.setAllowFriendlyFire(false);
        final Team admin = Bukkit.getScoreboardManager().getMainScoreboard().registerNewTeam("prison_admin");
        admin.setPrefix("Â§aÂ§lAdmin Â§a");
        final Team box = Bukkit.getScoreboardManager().getMainScoreboard().registerNewTeam("prison_box");
        box.setAllowFriendlyFire(true);
        final Team lobby = Bukkit.getScoreboardManager().getMainScoreboard().registerNewTeam("prison_lobby");
        lobby.setPrefix("Â§7Â§o");
        lobby.setAllowFriendlyFire(false);
    }
    */
    
}
