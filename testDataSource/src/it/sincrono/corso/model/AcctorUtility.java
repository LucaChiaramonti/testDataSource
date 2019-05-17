package it.sincrono.corso.model;

import java.util.List;

public interface AcctorUtility 
{
	public int insertActor(String n,String c);
	public List<Actor> readAll();
	public List<Actor> findByName(String n);
	public List<Actor> findById(int id);
	public int updateActor(String n,String c);
	public int deleteActorByID(int id);
}
