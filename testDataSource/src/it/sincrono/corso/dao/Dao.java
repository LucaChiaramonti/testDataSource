package it.sincrono.corso.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Dao 
{
	//SINGLETON 
	//FACTORY METHOD
	private static Dao d=null;
	private static DataSource ds;
	private static Connection c=null;//Connection sql
	private Dao()
	{
		try
		{
			Context initCtx=new InitialContext();//genera un contesto, è possibile che generi una eccezione 
			Context envCtx = (Context) initCtx.lookup("java:comp/env");//questa stringa va a leggere nell'context.xml i componenti a livello di ambiente enviroment, visto che restituisce un Object si fa il casting 
			ds = (DataSource)envCtx.lookup("jdbc/sakila");//nel contesto va a cercare nel jdbc il database sakila
		} 
		catch (NamingException e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnection() 
	{
		if(ds==null)
		{
			new Dao();//viene istanziato solo la prima volta in modo da avere solo un riferimento alla classe connection
		}
		try
		{
			c=ds.getConnection();
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	
	public Dao getDao()
	{
		return d;
	}
}
