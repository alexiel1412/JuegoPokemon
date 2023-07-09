package funciones;

import clases.Pokemon;
import clases.Region;
import clases.Trainer;

public class Funciones
{
    public static Region createBasicsData(String cad)
    {
    	cad = cad.toLowerCase();
    	
    	if (cad.equals("kanto") || cad.equals("1"))
            return new Region("Kanto",
					new Trainer("Gary"),
					new Pokemon("Bulbasaur"),
					new Pokemon("Charmander"),
					new Pokemon("Squirtle"));
    	
		else if (cad.equals("jhoto") || cad.equals("2"))
	        return new Region("Jhoto",
								new Trainer("Silver"),
								new Pokemon("Chikorita"),
								new Pokemon("Cyndaquil"),
								new Pokemon("Totodile"));
    	
		else if (cad.equals("hoenn") || cad.equals("3"))
			return new Region("Hoenn",
								new Trainer("Ruby"),
								new Pokemon("Trecko"),
								new Pokemon("Torchic"),
								new Pokemon("Mudkip"));
    	
		else if (cad.equals("shinno") || cad.equals("4"))
			return new Region("Shinno",
								new Trainer("Paul"),
								new Pokemon("Tortuig"),
								new Pokemon("Chimchar"),
								new Pokemon("Piplup"));
    	
		else if (cad.equals("teselia") || cad.equals("5"))
			return new Region("Teselia",
								new Trainer("N"),
								new Pokemon("Snivy"),
								new Pokemon("Tepig"),
								new Pokemon("Oshawott"));
    	
		else if (cad.equals("kalos") || cad.equals("6"))
			return new Region("Kalos",
								new Trainer("Serena"),
								new Pokemon("Chespin"),
								new Pokemon("Fennekin"),
								new Pokemon("Froakie"));
    	
		else if (cad.equals("alola") || cad.equals("7"))
			return new Region("Alola",
								new Trainer("Gladion"),
								new Pokemon("Rowlet"),
								new Pokemon("Litten"),
								new Pokemon("Poppplio"));
    	
		else if (cad.equals("galar") || cad.equals("8"))
			return new Region("Galar",
								new Trainer("Lionel"),
								new Pokemon("Grookey"),
								new Pokemon("Scorbunny"),
								new Pokemon("Sobble"));

		else if (cad.equals("paldea") || cad.equals("9"))
			return new Region("Paldea",
								new Trainer("Mencia"),
								new Pokemon("Sprigatito"),
								new Pokemon("Fuecoco"),
								new Pokemon("Quaxly"));
    	
    	return new Region();
    }

}
