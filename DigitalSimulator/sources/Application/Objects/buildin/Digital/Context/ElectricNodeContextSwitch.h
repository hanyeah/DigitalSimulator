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

#if !defined(AFX_ELECTRICNODECONTEXTSWITCH_H__37C9A681_A407_11D2_99FA_0080C7304F8F__INCLUDED_)
#define AFX_ELECTRICNODECONTEXTSWITCH_H__37C9A681_A407_11D2_99FA_0080C7304F8F__INCLUDED_
#pragma warning(disable : 4786)

#include "Application\Objects\buildin\digital\ElectricNodeContext.h"

class CElectricNodeContextSwitchAUS : public CElectricNodeContext  {
   typedef CElectricNodeContext inherited;

public:
   // DoCalculateer group
   //
   virtual void DoCalculate(CElectricNode::CElectricNodeDokument& data);

   virtual void OnLButtonClick(CElectricNode::CElectricNodeDokument& data);

   virtual CSize GetInputCountRange() const {return CSize(1,1);}; // genau einen Eingang
   virtual CSize GetOutputCountRange() const {return CSize(1,1);};// genau einen Ausgang
   virtual CSize GetSize(CElectricNode::CElectricNodeDokument& data) const {return CSize(50,0);};
   virtual CString GetGroup()const{return CString("OBJECTGROUP.SWITCH");};
   virtual CString GetName()const{return CString("OBJECT.SWITCH.OFF");};

   enum ParamMeaning
   {
      CurrentState = 0,
      MAX_PARAM
   };
   virtual DWORD GetParamCount() const {return MAX_PARAM;};

   virtual char * const GetClassName(){return "CElectricNodeContextSwitchAUS";};
protected:
   CElectricNodeContextSwitchAUS();

   virtual CString GetIconName(CElectricNode::CElectricNodeDokument& data) const ;

private:
   DECLARE_REGISTER(OBJ_SWITCH_AUS,CElectricNodeContextSwitchAUS)

};

#endif // !defined(AFX_ELECTRICNODECONTEXTSWITCH_H__37C9A681_A407_11D2_99FA_0080C7304F8F__INCLUDED_)
