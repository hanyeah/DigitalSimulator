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
#ifndef AFX_DIALOGOPTION_H__1433096A_A80B_11D3_B6F3_000629C18114__INCLUDED_
#define AFX_DIALOGOPTION_H__1433096A_A80B_11D3_B6F3_000629C18114__INCLUDED_

// DialogOption.h : Header-Datei
//
#include "resource.h"
#include "../SysColorStatic.h"

/////////////////////////////////////////////////////////////////////////////
// Dialogfeld CDialogOption 

class CDialogOption : public CDialog
{
// Konstruktion
public:
   CDialogOption(CWnd* pParent = NULL);   // Standardkonstruktor

// Dialogfelddaten
   //{{AFX_DATA(CDialogOption)
   enum { IDD = IDD_DIALOG_OPTION };
   CSysColStatic  m_interfaceBitmap;
   CComboBox      m_portCombo;
   CStatic        m_noPortStatic;
   int            m_portNr;
   //}}AFX_DATA


// Überschreibungen
   // Vom Klassen-Assistenten generierte virtuelle Funktionsüberschreibungen
   //{{AFX_VIRTUAL(CDialogOption)
   protected:
   virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV-Unterstützung
   //}}AFX_VIRTUAL

// Implementierung
protected:

   // Generierte Nachrichtenzuordnungsfunktionen
   //{{AFX_MSG(CDialogOption)
   virtual BOOL OnInitDialog();
   virtual void OnOK();
   //}}AFX_MSG
   DECLARE_MESSAGE_MAP()
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Developer Studio fügt zusätzliche Deklarationen unmittelbar vor der vorhergehenden Zeile ein.

#endif // AFX_DIALOGOPTION_H__1433096A_A80B_11D3_B6F3_000629C18114__INCLUDED_
