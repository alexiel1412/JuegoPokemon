package funciones;

import java.util.ArrayList;

public class Funciones
{
    public static ArrayList<ArrayList<String>> createBasicsData()
    {
    	ArrayList<String> region = new ArrayList<String>();
        region.add("Kanto");
        region.add("Jhoto");
        region.add("Hoenn");
        region.add("Shinno");
        region.add("Teselia");

        ArrayList<String> kanto = new ArrayList<String>();
        kanto.add("Bulbasaur");
        kanto.add("Charmander");
        kanto.add("Squirtle");

        ArrayList<String> jhoto = new ArrayList<String>();
        jhoto.add("Chikorita");
        jhoto.add("Cyndaquil");
        jhoto.add("Totodile");

        ArrayList<String> hoenn = new ArrayList<String>();
        hoenn.add("Trecko");
        hoenn.add("Torchic");
        hoenn.add("Mudkip");

        ArrayList<String> shinno = new ArrayList<String>();
        shinno.add("Tortuig");
        shinno.add("Chimchar");
        shinno.add("Piplup");

        ArrayList<String> teselia = new ArrayList<String>();
        teselia.add("Snivy");
        teselia.add("Tepig");
        teselia.add("Oshawott");

        ArrayList<ArrayList<String>> iniciales = new ArrayList<ArrayList<String>>();
        iniciales.add(kanto);
        iniciales.add(jhoto);
        iniciales.add(hoenn);
        iniciales.add(shinno);
        iniciales.add(teselia);

        ArrayList<String> rivalsNames = new ArrayList<String>();
        rivalsNames.add("Gary");
        rivalsNames.add("Silver");
        rivalsNames.add("Ruby");
        rivalsNames.add("Paul");
        rivalsNames.add("N");

        ArrayList<ArrayList<String>> basicsData = new ArrayList<ArrayList<String>>();
        basicsData.add(region);
        // basicsData.add(iniciales);
        basicsData.add(rivalsNames);

        return basicsData;
    }

}
