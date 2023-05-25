/* Copyright (c) 1996-2013 Clickteam
 *
 * This source code is part of the Android exporter for Clickteam Multimedia Fusion 2.
 * 
 * Permission is hereby granted to any person obtaining a legal copy 
 * of Clickteam Multimedia Fusion 2 to use or modify this source code for 
 * debugging, optimizing, or customizing applications created with 
 * Clickteam Multimedia Fusion 2.  Any other use of this source code is prohibited.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
//----------------------------------------------------------------------------------
//
// LIMITE A DROITE TERRAIN
//
//----------------------------------------------------------------------------------
package Expressions;

import RunLoop.*;

public class EXP_PLAYXRIGHT extends CExp
{
    public void evaluate(CRun rhPtr)
    {        
	int r=rhPtr.rhWindowX;
	if ((rhPtr.rh3Scrolling & CRun.RH3SCROLLING_SCROLL) != 0)
	    r=rhPtr.rh3DisplayX;
	r+=rhPtr.rh3WindowSx;
	if (r>rhPtr.rhLevelSx)
	    r=rhPtr.rhLevelSx;

	rhPtr.rh4Results[rhPtr.rh4PosPile].forceInt(r);
    }    
}
