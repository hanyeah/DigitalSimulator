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

#include "stdafx.h"
//#include "Application\DigitalSimulatorApp.h"
#include "Application\Debug\LogManager.h"
#include "DDEAdviceConv.h"
#include "Application\Objects\buildin\Digital\DDEInputNode.h"

#ifdef _DEBUG
#undef THIS_FILE
static char THIS_FILE[]=__FILE__;
#define new DEBUG_NEW
#endif

//////////////////////////////////////////////////////////////////////
// Konstruktion/Destruktion
//////////////////////////////////////////////////////////////////////

//----------------------------------------------------------------------------
CDDEAdviceConv::CDDEAdviceConv(CDDEServer* pServer,CDDEInputNode* listener):CDDEConv(pServer){
//----------------------------------------------------------------------------
	PROC_TRACE;


   m_listener = listener;
}

//----------------------------------------------------------------------------
CDDEAdviceConv::~CDDEAdviceConv(){
//----------------------------------------------------------------------------
	PROC_TRACE;



}

//----------------------------------------------------------------------------
BOOL CDDEAdviceConv::AdviseData(UINT wFmt, const char* pszTopic, const char* pszItem,void* pData, DWORD dwSize){
//----------------------------------------------------------------------------
	PROC_TRACE;



   ASSERT(m_listener!=NULL);
   
   m_listener->AdviseData(atoi((char*)pData));
   return FALSE;
}

//----------------------------------------------------------------------------
int CDDEAdviceConv::Release(){
//----------------------------------------------------------------------------
	PROC_TRACE;


    int ret;
    if((ret=CDDEConv::Release())==1)
        m_listener->AdviseStopped();
    return ret;
}
