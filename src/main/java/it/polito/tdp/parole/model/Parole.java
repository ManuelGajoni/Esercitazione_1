package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	
	ArrayList <String> ele;
		
	public Parole() 
	{
		ele = new ArrayList <String> ();
	}
	
	public void addParola(String p) 
	{
		ele.add(p);
	}
	
	public List<String> getElenco() 
	{
		Collections.sort(ele);
		return ele;
	}

	public void Cancella (String p)
	{
		ele.remove(p);
	}

	public String Tempo ()
	{
		long a = System.nanoTime();
		return "L'operazione ha occupato "+a+" ms \n";
	}
	
	public void reset() 
	{
		ele.clear();
	}

}
