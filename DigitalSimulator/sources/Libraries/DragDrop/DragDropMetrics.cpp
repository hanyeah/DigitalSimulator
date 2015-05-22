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

#include "DragDropStdafx.H"
#include "DragDrop.h" 
#include "DragDropMetrics.h"

CSize Metrics::m_szResolution;
long  Metrics::m_nPixelsPerUnit;
long  Metrics::m_nPortGravity;


//----------------------------------------------------------------------------
void Metrics::Init(){
//----------------------------------------------------------------------------
	PROC_TRACE;

   m_nPortGravity    = 45;   
   m_nPixelsPerUnit  = 100/*32*/;   
   m_szResolution.cx = 32;
   m_szResolution.cy = 32;
}

//----------------------------------------------------------------------------
CSize Metrics::getPixelsPerCM(){
//----------------------------------------------------------------------------
	PROC_TRACE;

   return m_szResolution;
}

//----------------------------------------------------------------------------
void Metrics::setPixelsPerCM(CSize szRes){
//----------------------------------------------------------------------------
	PROC_TRACE;

   m_szResolution = szRes;
}                


//----------------------------------------------------------------------------
long Metrics::getPixelsPerUnit(){
//----------------------------------------------------------------------------
	PROC_TRACE;

   return m_nPixelsPerUnit;
}

//----------------------------------------------------------------------------
void Metrics::setPixelsPerUnit(long szRes){
//----------------------------------------------------------------------------
	PROC_TRACE;

   m_nPixelsPerUnit = szRes;
}                

//----------------------------------------------------------------------------
long Metrics::getPortGravity(){
//----------------------------------------------------------------------------
	PROC_TRACE;

   return m_nPortGravity;
}

//----------------------------------------------------------------------------
void Metrics::setPortGravity(long szRes){
//----------------------------------------------------------------------------
	PROC_TRACE;

   m_nPortGravity = szRes;
}                

