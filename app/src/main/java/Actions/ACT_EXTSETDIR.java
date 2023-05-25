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
// -----------------------------------------------------------------------------
//
// SET DIRECTION
//
// -----------------------------------------------------------------------------
package Actions;

import Objects.CObject;
import Params.CParamExpression;
import Params.PARAM_INT;
import RunLoop.CRun;

public class ACT_EXTSETDIR extends CAct
{
    public void execute(CRun rhPtr)
    {
	CObject pHo=rhPtr.rhEvtProg.get_ActionObjects(this);
	if (pHo==null) 
            return;

	int dir;
	if (evtParams[0].code==29)	// PARAM_NEWDIRECTION)
	    dir=rhPtr.get_Direction(((PARAM_INT)evtParams[0]).value);
	else
	    dir=rhPtr.get_EventExpressionInt((CParamExpression)evtParams[0]);

	dir&=31;
	if (rhPtr.getDir(pHo)!=dir)
	{
	    pHo.roc.rcDir=dir;
	    pHo.roc.rcChanged=true;
	    pHo.rom.rmMovement.setDir(dir);

	    if (pHo.hoType==2)		// OBJ_SPR)
	    {
		pHo.roa.animIn(0);
	    }
	}
    }
}
