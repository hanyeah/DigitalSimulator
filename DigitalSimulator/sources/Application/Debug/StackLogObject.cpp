/* NO WARRANTY
 *
 *    BECAUSE THE PROGRAM IS IN THE PUBLIC DOMAIN, THERE IS NO
 *    WARRANTY FOR THE PROGRAM, TO THE EXTENT PERMITTED BY APPLICABLE
 *    LAW.  EXCEPT WHEN OTHERWISE STATED IN WRITING THE AUTHORS
 *    AND/OR OTHER PARTIES PROVIDE THE PROGRAM "AS IS" WITHOUT
 *    WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING,
 *    BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 *    AND FITNESS FOR A PARTICULAR PURPOSE.  THE ENTIRE RISK AS TO
 *    THE QUALITY AND PERFORMANCE OF THE PROGRAM IS WITH YOU.  SHOULD
 *    THE PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF ALL
 *    NECESSARY SERVICING, REPAIR OR CORRECTION.
 *
 *    IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN
 *    WRITING WILL ANY AUTHOR, OR ANY OTHER PARTY WHO MAY MODIFY
 *    AND/OR REDISTRIBUTE THE PROGRAM, BE LIABLE TO YOU FOR DAMAGES,
 *    INCLUDING ANY GENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL
 *    DAMAGES ARISING OUT OF THE USE OR INABILITY TO USE THE PROGRAM
 *    (INCLUDING BUT NOT LIMITED TO LOSS OF DATA OR DATA BEING
 *    RENDERED INACCURATE OR LOSSES SUSTAINED BY YOU OR THIRD PARTIES
 *    OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY OTHER
 *    PROGRAMS), EVEN IF SUCH AUTHOR OR OTHER PARTY HAS BEEN ADVISED
 *    OF THE POSSIBILITY OF SUCH DAMAGES.
 */

#include  <io.h>
#include <stdio.h>
#include "stdafx.h"
#include <afx.h>
#include <tchar.h>
#include <imagehlp.h>
#include <strstream>
#include <stack>

#include "Application\Configuration\ParameterManager.h"

#include "ExceptionStackTrace.h"
#include "Application\Debug\LogManager.h"


#include "StackLogObject.h"

//----------------------------------------------------------------------------
StackLogObject::StackLogObject(const char * logMsg ){
//----------------------------------------------------------------------------
//	PROC_TRACE; Don't do that.....recursion


   m_logMsg = strdup(logMsg);
   LogManager::log(LogManager::debug3,(char*)(LPCSTR)(CString("+++ ")+m_logMsg));
  // GlobalExceptionHandler::push(CString(logMsg));
}

//----------------------------------------------------------------------------
StackLogObject::~StackLogObject(){
//----------------------------------------------------------------------------
//	PROC_TRACE; Don't do that.....recursion

   LogManager::log(LogManager::debug3,(char*)(LPCSTR)(CString("--- ")+m_logMsg));
   delete (m_logMsg);
  // GlobalExceptionHandler::pop();
}
