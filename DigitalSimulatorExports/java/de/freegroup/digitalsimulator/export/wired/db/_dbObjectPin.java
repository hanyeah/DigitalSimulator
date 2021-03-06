package de.freegroup.digitalsimulator.export.wired.db;

/**
 * Class generated by automatic ClassGenerator
 * Date: Mon Feb 02 16:30:54 CET 2004
 */
import de.freegroup.digitalsimulator.db.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*;
import de.freegroup.digitalsimulator.Trace;

class _dbObjectPin extends dbObject 
{

	String    description;
	int       y;
	int       x;
	String    id;	// Key
	String    objectLayout_id;	// Foreign Key pointing to Table [ObjectLayout], Field [id]
	int       number;


	/**
	 * destroy a object in the database
	 */
	public boolean destroy()
	{
		boolean result = false;
		String    _key   = id;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.destroyInstance");
			try
			{
					stmt.executeUpdate( "DELETE FROM ObjectPin WHERE id='"+_key+"'");
					result = true;
					id     = null;
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}



	/**
	 * Method:      getDescription()
	 * Description: 
	 * Returns:     String
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Method:      setDescription(String _description, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setDescription(String _description, boolean _autoCommit)
	{
		description=_description;
		if(_autoCommit)
		{
			commit();
		}
	}

	/**
	 * Method:      getY()
	 * Description: 
	 * Returns:     int
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * Method:      setY(int _y, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setY(int _y, boolean _autoCommit)
	{
		y=_y;
		if(_autoCommit)
		{
			commit();
		}
	}

	/**
	 * Method:      getX()
	 * Description: 
	 * Returns:     int
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * Method:      setX(int _x, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setX(int _x, boolean _autoCommit)
	{
		x=_x;
		if(_autoCommit)
		{
			commit();
		}
	}

	/**
	 * Method:      getId()
	 * Description: 
	 * Returns:     String
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Method:      getNumber()
	 * Description: 
	 * Returns:     int
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * Method:      setNumber(int _number, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setNumber(int _number, boolean _autoCommit)
	{
		number=_number;
		if(_autoCommit)
		{
			commit();
		}
	}

	/**
	 * Method:      getObjectLayout()
	 * Description: 
	 * Returns:     ObjectLayout
	 */
	public ObjectLayout getObjectLayout()
	{
		return ObjectLayout.findById(objectLayout_id);
	}

	/**
	 * Method:      setObjectLayout()
	 * Description: 
	 * Returns:     void
	 */
	public void setObjectLayout(ObjectLayout _foreigner, boolean _autocommit)
	{
		objectLayout_id= _foreigner.getId();
		if (_autocommit == true)
			commit();
	}

	/**
	 *  Method:      getObjectPin2CasePins()
	 *  Description:                              
	 *  Returns:     ArrayList<ObjectPin2CasePin>
	 */
	public ArrayList getObjectPin2CasePins()
	{
		return _dbObjectPin2CasePin.findByObjectPin(this);
	}


	/**
	 *  Method:      findByDescription(String _description)
	 *  Description: 
	 *  Returns:     ArrayList<ObjectPin>
	 */
	public static ArrayList findByDescription(String _description)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.findByDescription");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT description, y, x, id, objectLayout_id, number FROM ObjectPin WHERE description='"+toSQL(_description)+"'");
				while(s.next())
				{
					ObjectPin newObject = new ObjectPin();
					newObject.description=s.getString(1);
					newObject.y=s.getInt(2);
					newObject.x=s.getInt(3);
					newObject.id=s.getString(4);
					newObject.objectLayout_id=s.getString(5);
					newObject.number=s.getInt(6);
					result.add(newObject);
				}
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}

	/**
	 *  Method:      findByY(int _y)
	 *  Description: 
	 *  Returns:     ArrayList<ObjectPin>
	 */
	public static ArrayList findByY(int _y)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.findByY");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT description, y, x, id, objectLayout_id, number FROM ObjectPin WHERE y="+_y);
				while(s.next())
				{
					ObjectPin newObject = new ObjectPin();
					newObject.description=s.getString(1);
					newObject.y=s.getInt(2);
					newObject.x=s.getInt(3);
					newObject.id=s.getString(4);
					newObject.objectLayout_id=s.getString(5);
					newObject.number=s.getInt(6);
					result.add(newObject);
				}
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}

	/**
	 *  Method:      findByX(int _x)
	 *  Description: 
	 *  Returns:     ArrayList<ObjectPin>
	 */
	public static ArrayList findByX(int _x)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.findByX");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT description, y, x, id, objectLayout_id, number FROM ObjectPin WHERE x="+_x);
				while(s.next())
				{
					ObjectPin newObject = new ObjectPin();
					newObject.description=s.getString(1);
					newObject.y=s.getInt(2);
					newObject.x=s.getInt(3);
					newObject.id=s.getString(4);
					newObject.objectLayout_id=s.getString(5);
					newObject.number=s.getInt(6);
					result.add(newObject);
				}
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}

	/**
	 *  Method:      findById(String _id)
	 *  Description: 
	 *  Returns:     ObjectPin
	 */
	public static ObjectPin findById(String _id)
	{
		ObjectPin result = null;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.findById");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT description, y, x, id, objectLayout_id, number FROM ObjectPin WHERE id='"+toSQL(_id)+"'");
				if(s.next())
				{
					result = new ObjectPin();
					result.description= s.getString(1);
					result.y= s.getInt(2);
					result.x= s.getInt(3);
					result.id= s.getString(4);
					result.objectLayout_id= s.getString(5);
					result.number= s.getInt(6);
				}
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}

	/**
	 *  Method:      findByObjectLayout(_dbObjectLayout _objectLayout)
	 *  Description: 
	 *  Returns:     ArrayList<ObjectPin>
	 */
	public static ArrayList findByObjectLayout(_dbObjectLayout _objectLayout)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.findByObjectLayout");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT description, y, x, id, objectLayout_id, number FROM ObjectPin WHERE objectLayout_id='"+toSQL(((_objectLayout==null)?"":_objectLayout.getId()))+"'");
				while(s.next())
				{
					ObjectPin newObject = new ObjectPin();
					newObject.description=s.getString(1);
					newObject.y=s.getInt(2);
					newObject.x=s.getInt(3);
					newObject.id=s.getString(4);
					newObject.objectLayout_id=s.getString(5);
					newObject.number=s.getInt(6);
					result.add(newObject);
				}
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}

	/**
	 *  Method:      findByNumber(int _number)
	 *  Description: 
	 *  Returns:     ArrayList<ObjectPin>
	 */
	public static ArrayList findByNumber(int _number)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.findByNumber");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT description, y, x, id, objectLayout_id, number FROM ObjectPin WHERE number="+_number);
				while(s.next())
				{
					ObjectPin newObject = new ObjectPin();
					newObject.description=s.getString(1);
					newObject.y=s.getInt(2);
					newObject.x=s.getInt(3);
					newObject.id=s.getString(4);
					newObject.objectLayout_id=s.getString(5);
					newObject.number=s.getInt(6);
					result.add(newObject);
				}
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}

	/**
	 * returns boolean
	 */
	public boolean commit()
	{
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.commit");
			try
			{
				stmt.executeUpdate( "UPDATE ObjectPin set description= '"+toSQL(description)+"', y= "+y+", x= "+x+", objectLayout_id= '"+toSQL(objectLayout_id)+"', number= "+number+" WHERE id='"+id+"'");
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return true;
	}


	/**
	 * returns ArrayList<ObjectPin>
	 */
	public static ArrayList getAll()
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.getAll");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT description, y, x, id, objectLayout_id, number FROM ObjectPin");
				while(s.next())
				{
					ObjectPin newObject = new ObjectPin();
					newObject.description=s.getString(1);
					newObject.y=s.getInt(2);
					newObject.x=s.getInt(3);
					newObject.id=s.getString(4);
					newObject.objectLayout_id=s.getString(5);
					newObject.number=s.getInt(6);
					result.add(newObject);
				}
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}


	/**
	 * create a new object in the database
	 */
	static public ObjectPin createInstance( String  _description, int  _y, int  _x, _dbObjectLayout _objectLayout, int  _number )
	{
		ObjectPin result = null;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.createInstance");
			try
			{
				String nextGUID = new java.rmi.server.UID().toString();
				stmt.executeUpdate( "INSERT INTO ObjectPin ( description, y, x, id, objectLayout_id, number) VALUES ( '"+toSQL(_description)+"', "+_y+", "+_x+", '"+nextGUID+"',  '"+((_objectLayout==null)?"":_objectLayout.getId())+"', "+_number+")");
				result = new ObjectPin();
				result.description= _description;
				result.y= _y;
				result.x= _x;
				result.id= nextGUID;
				result.objectLayout_id= (_objectLayout==null)?"":_objectLayout.getId();
				result.number= _number;
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}


	/**
	 * create a new object in the database
	 */
	static public void newInstance( String  _description, int  _y, int  _x, _dbObjectLayout _objectLayout, int  _number )
	{
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.newInstance");
			try
			{
				String nextGUID = new java.rmi.server.UID().toString();
				stmt.executeUpdate( "INSERT INTO ObjectPin ( description, y, x, id, objectLayout_id, number) VALUES ( '"+toSQL(_description)+"', "+_y+", "+_x+", '"+nextGUID+"',  '"+((_objectLayout==null)?"":_objectLayout.getId())+"', "+_number+")");
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
	}


	/**
	 * destroy a object in the database
	 */
	static public boolean destroyInstance( String  _key)
	{
		boolean result = false;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.destroyInstance");
			try
			{
					stmt.executeUpdate( "DELETE FROM ObjectPin WHERE id='"+_key+"'");
					result = true;
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}


	/**
	 * destroy ALL objects in the database
	 */
	static public boolean destroyAll()
	{
		boolean result = false;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbObjectPin.destroyAll");
			try
			{
					stmt.executeUpdate("DELETE from ObjectPin" );
					result = true;
			}
			catch(Exception exc)
			{
				Trace.error(exc);
			}
			stmt.close();
		
		}
		catch (Exception ex)
		{
			Trace.error(ex);
		}
		return result;
	}


	/**
	 */
	public String toString()
	{
		StringBuffer result = new StringBuffer(1024);
		result.append(description);
		result.append("|");
		result.append(y);
		result.append("|");
		result.append(x);
		result.append("|");
		result.append(id);
		result.append("|");
		result.append(objectLayout_id);
		result.append("|");
		result.append(number);
		return result.toString();
	}


	/**
	 * init the class
	 */
	static
	{
	}


}
