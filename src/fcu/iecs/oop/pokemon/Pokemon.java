package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	public enum PokemonType{
		FIRE,WATER,GRASS
	}
	
	public Pokemon(String name, PokemonType type, int cp) {
		super();
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	private final String name;
	private final PokemonType type;
	private int cp;
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public PokemonType getType() {
		return type;
	}
	public abstract void attack();
	

}
