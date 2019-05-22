package it.sincrono.corso.model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import it.sincrono.corso.dao.Dao;

public class ActorImpl implements AcctorUtility 
{
	private Connection c=null;
	private List<Actor> lista=new ArrayList();
	int x=0;
	@Override
	public int insertActor(String n, String c) {
		this.c=Dao.getConnection();//richiamo il metodo getConnectio
		try {
			Statement s=this.c.createStatement();
			x= s.executeUpdate("INSERT INTO `sakila`.`actor` (`first_name`, `last_name`) VALUES ('"+n+"', '"+c+"');");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return x;
	}

	@Override
	public List<Actor> readAll() {
		c=Dao.getConnection();//richiamo il metodo getConnectio
		try {
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from actor;");
			while(r.next())
			{
				Actor a= new Actor();
				a.setFirst_name(r.getString("first_name"));
				a.setLast_name(r.getString("last_name"));
				lista.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Actor> findByName(String n)
	{
		c=Dao.getConnection();//richiamo il metodo getConnectio
		try {
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from actor where first_name='"+n+"';");
			while(r.next())
			{
				Actor a= new Actor();
				a.setFirst_name(r.getString("first_name"));
				a.setLast_name(r.getString("last_name"));
				lista.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public List<Actor> findById(int id) {
		c=Dao.getConnection();//richiamo il metodo getConnectio
		try {
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from actor where actor_id='"+id+"';");
			while(r.next())
			{
				Actor a= new Actor();
				a.setFirst_name(r.getString("first_name"));
				a.setLast_name(r.getString("last_name"));
				lista.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public int updateActor(String n, String c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteActorByID(int id) {
		c=Dao.getConnection();//richiamo il metodo getConnectio
		try 
		{
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("");
			while(r.next())
			{
				Actor a= new Actor();
				a.setFirst_name(r.getString("first_name"));
				a.setLast_name(r.getString("last_name"));
				lista.add(a);
			}
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

}
