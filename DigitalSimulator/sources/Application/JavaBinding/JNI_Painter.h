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

/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class Painter */

#ifndef _Included_Painter
#define _Included_Painter
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     Painter
 * Method:    drawLine
 * Signature: (IIII)V
 */
void JNICALL Java_Painter_drawLine   (JNIEnv *, jclass, jint, jint, jint, jint);
void JNICALL Java_Painter_drawLineRGB(JNIEnv *, jclass, jint, jint, jint, jint, jint, jint, jint);

/*
 * Class:     Painter
 * Method:    drawOval
 * Signature: (IIII)V
 */
void JNICALL Java_Painter_drawOval   (JNIEnv *, jclass, jint, jint, jint, jint);
void JNICALL Java_Painter_drawOvalRGB(JNIEnv *, jclass, jint, jint, jint, jint, jint, jint, jint);

/*
 * Class:     Painter
 * Method:    fillOval
 * Signature: (IIII)V
 */
void JNICALL Java_Painter_fillOval(JNIEnv *, jclass, jint, jint, jint, jint, jint, jint, jint, jint borderSize, jint br, jint bg, jint bb);

/*
 * Class:     Painter
 * Method:    drawRect
 * Signature: (IIII)V
 */
void JNICALL Java_Painter_drawRect   (JNIEnv *, jclass, jint, jint, jint, jint);
void JNICALL Java_Painter_drawRectRGB(JNIEnv *, jclass, jint, jint, jint, jint, jint, jint, jint);


/*
 * Class:     Painter
 * Method:    drawRect
 * Signature: (IIII)V
 */
void JNICALL Java_Painter_fillRect(JNIEnv *, jclass, jint, jint, jint, jint, jint, jint,jint, jint borderSize, jint br, jint bg, jint bb);

/*
 * Class:     Painter
 * Method:    drawRect
 * Signature: (IIII)V
 */
void JNICALL Java_Painter_drawText   (JNIEnv *, jclass, jstring, jint, jint, jint);
void JNICALL Java_Painter_drawTextRGB(JNIEnv *, jclass, jstring, jint, jint, jint, jint, jint, jint);

#ifdef __cplusplus
}
#endif
#endif