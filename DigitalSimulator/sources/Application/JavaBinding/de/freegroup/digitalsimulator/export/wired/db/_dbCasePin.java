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

class _dbCasePin extends dbObject 
{

	long      x;
	String    description;
	long      number;
	String    caseLayout_id;	// Foreign Key pointing to Table [CaseLayout], Field [id]
	long      y;
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
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.destroyInstance");
			try
			{
					stmt.executeUpdate( "DELETE FROM CasePin WHERE id='"+_key+"'");
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
	 * Method:      getX()
	 * Description: 
	 * Returns:     long
	 */
	public long getX()
	{
		return x;
	}

	/**
	 * Method:      setX(long _x, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setX(long _x, boolean _autoCommit)
	{
		x=_x;
		if(_autoCommit)
		{
			commit();
		}
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
	 * Method:      getNumber()
	 * Description: 
	 * Returns:     long
	 */
	public long getNumber()
	{
		return number;
	}

	/**
	 * Method:      setNumber(long _number, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setNumber(long _number, boolean _autoCommit)
	{
		number=_number;
		if(_autoCommit)
		{
			commit();
		}
	}

	/**
	 * Method:      getY()
	 * Description: 
	 * Returns:     long
	 */
	public long getY()
	{
		return y;
	}

	/**
	 * Method:      setY(long _y, boolean _autoCommit)
	 * Description: 
	 * Returns:     void
	 */
	public void setY(long _y, boolean _autoCommit)
	{
		y=_y;
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
	 * Method:      getCaseLayout()
	 * Description: 
	 * Returns:     CaseLayout
	 */
	public CaseLayout getCaseLayout()
	{
		return CaseLayout.findById(caseLayout_id);
	}

	/**
	 * Method:      setCaseLayout()
	 * Description: 
	 * Returns:     void
	 */
	public void setCaseLayout(CaseLayout _foreigner, boolean _autocommit)
	{
		caseLayout_id= _foreigner.getId();
		if (_autocommit == true)
			commit();
	}

	/**
	 *  Method:      getDependencyPins()
	 *  Description:                              
	 *  Returns:     ArrayList<DependencyPin>
	 */
	public ArrayList getDependencyPins()
	{
		return _dbDependencyPin.findByCasePin(this);
	}


	/**
	 *  Method:      getObjectPins()
	 *  Description:                              
	 *  Returns:     ArrayList<ObjectPin>
	 */
	public ArrayList getObjectPins()
	{
		return _dbObjectPin.findByCasePin(this);
	}


	/**
	 *  Method:      findByX(long _x)
	 *  Description: 
	 *  Returns:     ArrayList<CasePin>
	 */
	public static ArrayList findByX(long _x)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.findByX");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT x, description, number, caseLayout_id, y, id FROM CasePin WHERE x="+_x);
				while(s.next())
				{
					CasePin newObject = new CasePin();
					newObject.x=s.getLong(1);
					newObject.description=s.getString(2);
					newObject.number=s.getLong(3);
					newObject.caseLayout_id=s.getString(4);
					newObject.y=s.getLong(5);
					newObject.id=s.getString(6);
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
	 *  Method:      findByDescription(String _description)
	 *  Description: 
	 *  Returns:     ArrayList<CasePin>
	 */
	public static ArrayList findByDescription(String _description)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.findByDescription");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT x, description, number, caseLayout_id, y, id FROM CasePin WHERE description='"+toSQL(_description)+"'");
				while(s.next())
				{
					CasePin newObject = new CasePin();
					newObject.x=s.getLong(1);
					newObject.description=s.getString(2);
					newObject.number=s.getLong(3);
					newObject.caseLayout_id=s.getString(4);
					newObject.y=s.getLong(5);
					newObject.id=s.getString(6);
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
	 *  Method:      findByNumber(long _number)
	 *  Description: 
	 *  Returns:     ArrayList<CasePin>
	 */
	public static ArrayList findByNumber(long _number)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.findByNumber");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT x, description, number, caseLayout_id, y, id FROM CasePin WHERE number="+_number);
				while(s.next())
				{
					CasePin newObject = new CasePin();
					newObject.x=s.getLong(1);
					newObject.description=s.getString(2);
					newObject.number=s.getLong(3);
					newObject.caseLayout_id=s.getString(4);
					newObject.y=s.getLong(5);
					newObject.id=s.getString(6);
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
	 *  Method:      findByCaseLayout(_dbCaseLayout _caseLayout)
	 *  Description: 
	 *  Returns:     ArrayList<CasePin>
	 */
	public static ArrayList findByCaseLayout(_dbCaseLayout _caseLayout)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.findByCaseLayout");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT x, description, number, caseLayout_id, y, id FROM CasePin WHERE caseLayout_id='"+toSQL(((_caseLayout==null)?"":_caseLayout.getId()))+"'");
				while(s.next())
				{
					CasePin newObject = new CasePin();
					newObject.x=s.getLong(1);
					newObject.description=s.getString(2);
					newObject.number=s.getLong(3);
					newObject.caseLayout_id=s.getString(4);
					newObject.y=s.getLong(5);
					newObject.id=s.getString(6);
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
	 *  Method:      findByY(long _y)
	 *  Description: 
	 *  Returns:     ArrayList<CasePin>
	 */
	public static ArrayList findByY(long _y)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.findByY");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT x, description, number, caseLayout_id, y, id FROM CasePin WHERE y="+_y);
				while(s.next())
				{
					CasePin newObject = new CasePin();
					newObject.x=s.getLong(1);
					newObject.description=s.getString(2);
					newObject.number=s.getLong(3);
					newObject.caseLayout_id=s.getString(4);
					newObject.y=s.getLong(5);
					newObject.id=s.getString(6);
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
	 *  Returns:     CasePin
	 */
	public static CasePin findById(String _id)
	{
		CasePin result = null;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.findById");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT x, description, number, caseLayout_id, y, id FROM CasePin WHERE id='"+toSQL(_id)+"'");
				if(s.next())
				{
					result = new CasePin();
					result.x= s.getLong(1);
					result.description= s.getString(2);
					result.number= s.getLong(3);
					result.caseLayout_id= s.getString(4);
					result.y= s.getLong(5);
					result.id= s.getString(6);
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
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.commit");
			try
			{
				stmt.executeUpdate( "UPDATE CasePin set x= "+x+", description= '"+toSQL(description)+"', number= "+number+", caseLayout_id= '"+toSQL(caseLayout_id)+"', y= "+y+" WHERE id='"+id+"'");
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
	 * returns ArrayList<CasePin>
	 */
	public static ArrayList getAll()
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.getAll");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT x, description, number, caseLayout_id, y, id FROM CasePin");
				while(s.next())
				{
					CasePin newObject = new CasePin();
					newObject.x=s.getLong(1);
					newObject.description=s.getString(2);
					newObject.number=s.getLong(3);
					newObject.caseLayout_id=s.getString(4);
					newObject.y=s.getLong(5);
					newObject.id=s.getString(6);
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
	static public CasePin createInstance( long  _x, String  _description, long  _number, _dbCaseLayout _caseLayout, long  _y )
	{
		CasePin result = null;
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.createInstance");
			try
			{
				String nextGUID = new java.rmi.server.UID().toString();
				stmt.executeUpdate( "INSERT INTO CasePin ( x, description, number, caseLayout_id, y, id) VALUES ("+_x+",  '"+toSQL(_description)+"', "+_number+",  '"+((_caseLayout==null)?"":_caseLayout.getId())+"', "+_y+", '"+nextGUID+"')");
				result = new CasePin();
				result.x= _x;
				result.description= _description;
				result.number= _number;
				result.caseLayout_id= (_caseLayout==null)?"":_caseLayout.getId();
				result.y= _y;
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
	static public void newInstance( long  _x, String  _description, long  _number, _dbCaseLayout _caseLayout, long  _y )
	{
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.newInstance");
			try
			{
				String nextGUID = new java.rmi.server.UID().toString();
				stmt.executeUpdate( "INSERT INTO CasePin ( x, description, number, caseLayout_id, y, id) VALUES ("+_x+",  '"+toSQL(_description)+"', "+_number+",  '"+((_caseLayout==null)?"":_caseLayout.getId())+"', "+_y+", '"+nextGUID+"')");
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
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.destroyInstance");
			try
			{
					stmt.executeUpdate( "DELETE FROM CasePin WHERE id='"+_key+"'");
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
			stmt  = ConnectionManager.getValid().createStatement("_dbCasePin.destroyAll");
			try
			{
					stmt.executeUpdate("DELETE from CasePin" );
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
		result.append(x);
		result.append("|");
		result.append(description);
		result.append("|");
		result.append(number);
		result.append("|");
		result.append(caseLayout_id);
		result.append("|");
		result.append(y);
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
