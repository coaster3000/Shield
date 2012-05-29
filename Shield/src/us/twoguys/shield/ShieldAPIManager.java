package us.twoguys.shield;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import us.twoguys.shield.flags.Flag;

public class ShieldAPIManager implements ShieldAPI{
	
	Shield plugin;
	
	public ShieldAPIManager(Shield instance){
		plugin = instance;
	}
	
	/*
	 * Plugin Methods
	 */
	
	@Override
	public ArrayList<String> getRegions(){
		return plugin.pm.getRegions();
	}
	
	@Override
	public ArrayList<String> getRegions(Entity entity) {
		return plugin.pm.getRegions(entity);
	}

	@Override
	public ArrayList<String> getRegions(Location loc) {
		return plugin.pm.getRegions(loc);
	}

	@Override
	public boolean isInRegion(Entity entity) {
		return plugin.pm.isInRegion(entity);
	}

	@Override
	public boolean isInRegion(Location loc) {
		return plugin.pm.isInRegion(loc);
	}
	
	@Override
	public boolean canBuild(Player player) {
		return plugin.pm.canBuild(player);
	}

	@Override
	public boolean canBuild(Player player, Location loc) {
		return plugin.pm.canBuild(player, loc);
	}

	@Override
	public boolean canUse(Player player) {
		return plugin.pm.canUse(player);
	}

	@Override
	public boolean canUse(Player player, Location loc) {
		return plugin.pm.canUse(player, loc);
	}

	@Override
	public boolean canOpen(Player player) {
		return plugin.pm.canOpen(player);
	}

	@Override
	public boolean canOpen(Player player, Location loc) {
		return plugin.pm.canOpen(player, loc);
	}

	/*
	 * Flag Methods
	 */
	
	@Override
	public void addValidFlag(String flag){
		plugin.fm.addValidFlag(flag);
	}
	
	@Override 
	public boolean isValidFlag(String flag){
		return plugin.fm.isValidFlag(flag);
	}

	@Override
	public void createFlag(String flag, String region, ArrayList<Player> players, boolean value) {
		plugin.fm.createFlag(flag, region, players, value);
	}

	@Override
	public boolean hasFlag(Player player, String flag, String region) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Flag getFlag(String flag, String region) {
		// TODO Auto-generated method stub
		return null;
	}

}
