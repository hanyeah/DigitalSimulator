package de.freegroup.digitalsimulator.export.wired.db;

/**
 * Class generated by automatic ClassGenerator
 * Date: Fri Sep 20 08:33:57 GMT+02:00 2002
 */
import de.freegroup.digitalsimulator.db.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*;
import Trace;

public class Connection extends _dbConnection
{

	public static ArrayList findByElectricObject( _dbElectricObject _obj)
	{
		ArrayList result = new ArrayList();
		SaveStatement  stmt;

		try
		{
			stmt  = ConnectionManager.getValid().createStatement("_dbConnection.findByToRelatedObject");
			try
			{
				ResultSet s = stmt.executeQuery( "SELECT distinct fromRelatedObject_id, fromPinNuum, toRelatedObject_id, toPinNum, Connection.id FROM Connection, RelatedObject "+
                                             " WHERE masterObject_id='"+toSQL(((_obj==null)?"":_obj.getId()))+"' "+
                                             " AND  ((relatedObject.id = connection.fromRelatedObject_id) OR (relatedObject.id= connection.toRelatedObject_id))");
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

}
