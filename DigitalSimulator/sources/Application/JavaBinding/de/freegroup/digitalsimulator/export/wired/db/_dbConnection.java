package de.freegroup.digitalsimulator.export.wired.db;

/**
 * Class generated by automatic ClassGenerator
 * Date: Fri Oct 04 16:35:33 GMT+02:00 2002
 */
import de.freegroup.digitalsimulator.db.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*;
import Trace;

class _dbConnection extends dbObject 
{

	String    fromRelatedObject_id;	// Foreign Key pointing to Table [RelatedObject], Field [id]
	int       fromPinNuum;
	String    toRelatedObject_id;	// Foreign Key pointing to Table [RelatedObject], Field [id]
	int       toPinNum;
	String    id;	// Key


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
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.destroyInstance");
			try
			{
					stmt.executeUpdate( "DELETE FROM Connection WHERE id='"+_key+"'");
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
	 * Method:      getFromPinNuum()
	 * Description: 
	 * Returns:     int
	 */
	public int getFromPinNuum()
	{
		return fromPinNuum;
	}

	/**
	 * Method:      setFromPinNuum(int _fromPinNuum, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setFromPinNuum(int _fromPinNuum, boolean _autoCommit)
	{
		fromPinNuum=_fromPinNuum;
		if(_autoCommit)
		{
			commit();
		}
	}

	/**
	 * Method:      getToPinNum()
	 * Description: 
	 * Returns:     int
	 */
	public int getToPinNum()
	{
		return toPinNum;
	}

	/**
	 * Method:      setToPinNum(int _toPinNum, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setToPinNum(int _toPinNum, boolean _autoCommit)
	{
		toPinNum=_toPinNum;
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
	 * Method:      getFromRelatedObject()
	 * Description: 
	 * Returns:     RelatedObject
	 */
	public RelatedObject getFromRelatedObject()
	{
		return RelatedObject.findById(fromRelatedObject_id);
	}

	/**
	 * Method:      setFromRelatedObject()
	 * Description: 
	 * Returns:     void
	 */
	public void setFromRelatedObject(RelatedObject _foreigner, boolean _autocommit)
	{
		fromRelatedObject_id= _foreigner.getId();
		if (_autocommit == true)
			commit();
	}

	/**
	 * Method:      getToRelatedObject()
	 * Description: 
	 * Returns:     RelatedObject
	 */
	public RelatedObject getToRelatedObject()
	{
		return RelatedObject.findById(toRelatedObject_id);
	}

	/**
	 * Method:      setToRelatedObject()
	 * Description: 
	 * Returns:     void
	 */
	public void setToRelatedObject(RelatedObject _foreigner, boolean _autocommit)
	{
		toRelatedObject_id= _foreigner.getId();
		if (_autocommit == true)
			commit();
	}

	/**
	 *  Method:      findByFromRelatedObject(_dbRelatedObject _fromRelatedObject)
	 *  Description: 
	 *  Returns:     ArrayList<Connection>
	 */
	public static ArrayList findByFromRelatedObject(_dbRelatedObject _fromRelatedObject)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.findByFromRelatedObject");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, id FROM Connection WHERE fromRelatedObject_id='"+toSQL(((_fromRelatedObject==null)?"":_fromRelatedObject.getId()))+"'");
				while(s.next())
				{
					Connection newObject = new Connection();
					newObject.fromRelatedObject_id=s.getString(1);
					newObject.fromPinNuum=s.getInt(2);
					newObject.toRelatedObject_id=s.getString(3);
					newObject.toPinNum=s.getInt(4);
					newObject.id=s.getString(5);
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
	 *  Method:      findByFromPinNuum(int _fromPinNuum)
	 *  Description: 
	 *  Returns:     ArrayList<Connection>
	 */
	public static ArrayList findByFromPinNuum(int _fromPinNuum)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.findByFromPinNuum");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, id FROM Connection WHERE fromPinNuum="+_fromPinNuum);
				while(s.next())
				{
					Connection newObject = new Connection();
					newObject.fromRelatedObject_id=s.getString(1);
					newObject.fromPinNuum=s.getInt(2);
					newObject.toRelatedObject_id=s.getString(3);
					newObject.toPinNum=s.getInt(4);
					newObject.id=s.getString(5);
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
	 *  Method:      findByToRelatedObject(_dbRelatedObject _toRelatedObject)
	 *  Description: 
	 *  Returns:     ArrayList<Connection>
	 */
	public static ArrayList findByToRelatedObject(_dbRelatedObject _toRelatedObject)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.findByToRelatedObject");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, id FROM Connection WHERE toRelatedObject_id='"+toSQL(((_toRelatedObject==null)?"":_toRelatedObject.getId()))+"'");
				while(s.next())
				{
					Connection newObject = new Connection();
					newObject.fromRelatedObject_id=s.getString(1);
					newObject.fromPinNuum=s.getInt(2);
					newObject.toRelatedObject_id=s.getString(3);
					newObject.toPinNum=s.getInt(4);
					newObject.id=s.getString(5);
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
	 *  Method:      findByToPinNum(int _toPinNum)
	 *  Description: 
	 *  Returns:     ArrayList<Connection>
	 */
	public static ArrayList findByToPinNum(int _toPinNum)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.findByToPinNum");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, id FROM Connection WHERE toPinNum="+_toPinNum);
				while(s.next())
				{
					Connection newObject = new Connection();
					newObject.fromRelatedObject_id=s.getString(1);
					newObject.fromPinNuum=s.getInt(2);
					newObject.toRelatedObject_id=s.getString(3);
					newObject.toPinNum=s.getInt(4);
					newObject.id=s.getString(5);
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
	 *  Returns:     Connection
	 */
	public static Connection findById(String _id)
	{
		Connection result = null;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.findById");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, id FROM Connection WHERE id='"+toSQL(_id)+"'");
				if(s.next())
				{
					result = new Connection();
					result.fromRelatedObject_id= s.getString(1);
					result.fromPinNuum= s.getInt(2);
					result.toRelatedObject_id= s.getString(3);
					result.toPinNum= s.getInt(4);
					result.id= s.getString(5);
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
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.commit");
			try
			{
				stmt.executeUpdate( "UPDATE Connection set fromRelatedObject_id= '"+toSQL(fromRelatedObject_id)+"', fromPinNuum= "+fromPinNuum+", toRelatedObject_id= '"+toSQL(toRelatedObject_id)+"', toPinNum= "+toPinNum+" WHERE id='"+id+"'");
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
	 * returns ArrayList<Connection>
	 */
	public static ArrayList getAll()
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.getAll");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, id FROM Connection");
				while(s.next())
				{
					Connection newObject = new Connection();
					newObject.fromRelatedObject_id=s.getString(1);
					newObject.fromPinNuum=s.getInt(2);
					newObject.toRelatedObject_id=s.getString(3);
					newObject.toPinNum=s.getInt(4);
					newObject.id=s.getString(5);
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
	static public Connection createInstance( _dbRelatedObject _fromRelatedObject, int  _fromPinNuum, _dbRelatedObject _toRelatedObject, int  _toPinNum )
	{
		Connection result = null;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.createInstance");
			try
			{
				String nextGUID = new java.rmi.server.UID().toString();
				stmt.executeUpdate( "INSERT INTO Connection ( fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, id) VALUES ( '"+((_fromRelatedObject==null)?"":_fromRelatedObject.getId())+"', "+_fromPinNuum+",  '"+((_toRelatedObject==null)?"":_toRelatedObject.getId())+"', "+_toPinNum+", '"+nextGUID+"')");
				result = new Connection();
				result.fromRelatedObject_id= (_fromRelatedObject==null)?"":_fromRelatedObject.getId();
				result.fromPinNuum= _fromPinNuum;
				result.toRelatedObject_id= (_toRelatedObject==null)?"":_toRelatedObject.getId();
				result.toPinNum= _toPinNum;
				result.id= nextGUID;
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
	static public void newInstance( _dbRelatedObject _fromRelatedObject, int  _fromPinNuum, _dbRelatedObject _toRelatedObject, int  _toPinNum )
	{
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.newInstance");
			try
			{
				String nextGUID = new java.rmi.server.UID().toString();
				stmt.executeUpdate( "INSERT INTO Connection ( fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, id) VALUES ( '"+((_fromRelatedObject==null)?"":_fromRelatedObject.getId())+"', "+_fromPinNuum+",  '"+((_toRelatedObject==null)?"":_toRelatedObject.getId())+"', "+_toPinNum+", '"+nextGUID+"')");
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
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.destroyInstance");
			try
			{
					stmt.executeUpdate( "DELETE FROM Connection WHERE id='"+_key+"'");
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
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.destroyAll");
			try
			{
					stmt.executeUpdate("DELETE from Connection" );
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
		result.append(fromRelatedObject_id);
		result.append("|");
		result.append(fromPinNuum);
		result.append("|");
		result.append(toRelatedObject_id);
		result.append("|");
		result.append(toPinNum);
		result.append("|");
		result.append(id);
		return result.toString();
	}


	/**
	 * init the class
	 */
	static
	{
	}


}
