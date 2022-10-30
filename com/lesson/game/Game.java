package com.lesson.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Game 
{
	private HashMap<String,Character> entities = new HashMap<String,Character>();
	private Character player;
	private Character treasure;
	private GridCell[][] grid;
	
	public Game() {
		// use init function for consistency if other constructors are added
		init();
	}
	
	//comment
	public void entitySpawn(Character entity) {
		Random rand = new Random();
		entity.setPosX( rand.nextInt(grid.length) );
		entity.setPosY( rand.nextInt(grid[0].length) );
	}
	
	public void init() {
		setGrid(10,10);
		entities.put("player", new Character());
		entities.put("treasure", new Character());
	}
	
	public void setGrid(int width, int height) {
		grid = new GridCell[ width ][ height ];
	}
	
	public void setCell(int x, int y, GridCell cell) {
		grid[x][y] = cell;
	}
   
   
}
