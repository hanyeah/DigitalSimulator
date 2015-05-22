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

#ifndef AFX_CUSTOMFONTDIALOG_H__22CDE051_B50A_11D2_9A13_0080C7304F8F__INCLUDED_
#define AFX_CUSTOMFONTDIALOG_H__22CDE051_B50A_11D2_9A13_0080C7304F8F__INCLUDED_
#pragma warning(disable : 4786)

// CustomFontDialog.h : Header-Datei
//
#include "Application\Controls\URLStatic\URLStatic.h"

/////////////////////////////////////////////////////////////////////////////
// Dialogfeld CCustomFontDialog 

class CCustomFontDialog : public CFontDialog{
   typedef CFontDialog inherited;

public:
    CCustomFontDialog(LPLOGFONT f=NULL, LPCSTR sampletext="sample", CWnd* pParentWnd= NULL);

    void SetSampleText(CString s) {m_sampletext=s;};
    void SetTextColor(COLORREF rgbColor){m_cf.rgbColors = rgbColor;};
    COLORREF GetTextColor(){return m_cf.rgbColors;};

   virtual char * const GetClassName(){return "CCustomFontDialog";};
protected:
    CString m_sampletext;

	//{{AFX_MSG(CCustomFontDialog)
	virtual BOOL OnInitDialog();
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
	DECLARE_DYNAMIC(CCustomFontDialog)
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Developer Studio f�gt zus�tzliche Deklarationen unmittelbar vor der vorhergehenden Zeile ein.

#endif // AFX_CUSTOMFONTDIALOG_H__22CDE051_B50A_11D2_9A13_0080C7304F8F__INCLUDED_
