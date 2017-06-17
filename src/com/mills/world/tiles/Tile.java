package com.mills.world.tiles;

import com.mills.world.World;

public abstract class Tile {

	protected String name;
	protected TileType type;
	protected int x;
	protected int y;
	protected int oX;
	protected int oY;
	protected int tileX;
	protected int tileY;
	protected World world;
	protected java.awt.Color TILECOLOR;
	public static final int TILEWIDTH = 50;
	public static final int TILEHEIGHT = 50;
	
	public Tile(TileType type, World world, int x, int y)
	{
		this.type = type;
		this.world = world;
		this.oX = x;
		this.oY = y;
		tileX = x / TILEWIDTH;
		tileY = y / TILEHEIGHT;
	}

	public boolean contains(int x, int y)
	{
		if((x >= this.x && x < Tile.TILEWIDTH) && (y >= this.y && y < Tile.TILEHEIGHT))
				return true;
		return false;
	}
	
	public void setType(TileType type)
	{
		this.type = type;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getTileX()
	{
		return tileX;
	}
	
	public int getY()
	{
		return y;
	}

	public int getTileY()
	{
		return tileY;
	}
	
	public World getWorld()
	{
		return world;
	}
	
	public TileType getType()
	{
		return type;
	}
	
	public abstract void render(java.awt.Graphics g);
	public abstract void tick();
	
}
