package de.freegroup.digitalsimulator.export.wired.db;

/**
 * Class generated by automatic ClassGenerator
 * Date: Wed Feb 27 17:58:17 GMT+01:00 2002
 */
import de.freegroup.digitalsimulator.db.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*;
import Trace;

public class DependencyPin extends _dbDependencyPin
{
    public String toString()
    {
        return "["+super.toString()+"]@"+ this.hashCode();
    }
}
