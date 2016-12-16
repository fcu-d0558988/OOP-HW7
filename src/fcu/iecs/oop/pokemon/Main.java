package fcu.iecs.oop.pokemon;

import fcu.iecs.oop.pokemon.Pokemon.PokemonType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Psyduck psyduck=new Psyduck("psyduck",PokemonType.WATER,100);
		psyduck.attack();
		Bulbasaur bulbasaur=new Bulbasaur("bulbasaur",PokemonType.FIRE,456);
		bulbasaur.attack();
		Charmander charmander=new Charmander("charmander",PokemonType.GRASS,589);
		charmander.attack();
		

	}

}
