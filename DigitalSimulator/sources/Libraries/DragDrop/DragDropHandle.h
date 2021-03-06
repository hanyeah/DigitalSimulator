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

#ifndef _DRAGDROPHANDLE_H_
#define _DRAGDROPHANDLE_H_

#include "DragDroprect.h"
#include "DragDropapp.h"


class DragDropHandle : public DragDropRectangle{
    typedef DragDropRectangle inherited ;
public:
    DragDropHandle();
    DragDropHandle(CRect* pRect, CM::Type  nCursor = CM::ARROW);
    DragDropHandle(CPoint location, CSize size,  CM::Type  nCursor = CM::ARROW);
    virtual ~DragDropHandle();

    virtual BOOL DoUncapturedMouseMove(UINT nFlags, CPoint pointDP, CPoint pointLP, CClientDC* pDC, DragDropView* pView);
    
    virtual void       SetHandleFor (DragDropObject* pObject) {m_pHandleFor = pObject; }
    virtual DragDropObject* GetHandleFor () {return m_pHandleFor;}

    virtual void SetHandleType (int nHandleType) {m_nHandleType = nHandleType;}
    virtual int  GetHandleType () {return m_nHandleType;}

    virtual void      SetCursor ( CM::Type  nCursor ) {m_nHandleCursor = nCursor;}
    virtual CM::Type  GetCursor() {return m_nHandleCursor;}
    virtual DragDropObject* Clone() const;


protected:


    DragDropObject* m_pHandleFor;
    int        m_nHandleType;
    CM::Type   m_nHandleCursor;
    
private:
    virtual void Init(CM::Type  nCursor);
    
    DECLARE_SERIAL(DragDropHandle)
};

#endif 
