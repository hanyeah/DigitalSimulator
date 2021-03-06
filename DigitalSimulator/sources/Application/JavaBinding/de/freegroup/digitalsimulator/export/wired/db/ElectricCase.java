package de.freegroup.digitalsimulator.export.wired.db;

/**
 * Class generated by automatic ClassGenerator
 * Date: Wed Feb 27 18:01:51 GMT+01:00 2002
 */
import de.freegroup.digitalsimulator.db.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*;
import Trace;
import java.util.ArrayList;

import de.freegroup.digitalsimulator.export.wired.db.*;

public class ElectricCase extends _dbElectricCase
{
    ArrayList  object2CaseList  = null;
    CaseLayout caseLayout  = null;

    int partNum;


    public void setPartNum(int num)
    {
      partNum = num;
    }

    public int getPartNum()
    {
      return partNum;
    }

    /**
     *
     */
    public ArrayList getObject2Cases()
    {
        if(object2CaseList!=null)
           return object2CaseList;

//        ArrayList result = new ArrayList();
//        ArrayList c2o = getObject2Cases();
//        Iterator iter = c2o.iterator();
//        while(iter.hasNext())
//        {
//            Object2Case eobj = (Object2Case)iter.next();
//            result.add(eobj.getObject());
//        }
//
        return super.getObject2Cases();
    }

    /**
     *
     */
    public CasePin getPin(long number)
    {
        Iterator iter = getCaseLayout().getCasePins().iterator();
        while(iter.hasNext())
        {
            CasePin opin= (CasePin)iter.next();
            if(opin.getNumber()==number)
                return opin;
        }
        return null;
    }

    /**
     *
     */
    public void reserveResources()
    {
//        System.out.println("reserve "+getClass().getName()+"@"+this.hashCode());
        caseLayout = super.getCaseLayout();
        caseLayout.reserveResources(this);

        object2CaseList = getObject2Cases();
        Iterator iter  = object2CaseList.iterator();
        while(iter.hasNext())
        {
          Object2Case    o2c  = (Object2Case)iter.next();
          //ElectricObject eobj = o2c.getObject();
          o2c.reserveResources(this);
        }
    }

    public CaseLayout getCaseLayout()
    {
      if(caseLayout!=null)
         return caseLayout;

      return super.getCaseLayout();
    }


    public String toString()
    {
        return "["+super.getName()+"]@"+ java.lang.Long.toHexString( this.hashCode()).toUpperCase();
    }
}
