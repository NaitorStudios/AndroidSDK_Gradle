/* Copyright (c) 1996-2019 Clickteam
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
// ------------------------------------------------------------------------------
// 
// RUNNING AS
// 
// ------------------------------------------------------------------------------
package Conditions;

import java.util.ArrayList;
import Objects.CObject;
import Params.CParamExpression;
import Params.PARAM_CHILDEVENT;
import Events.SaveSelection;
import RunLoop.CRun;

public class CND_STARTCHILDEVENT extends CCnd
{
	public boolean eva1(CRun rhPtr, CObject hoPtr)
	{
		return eva2(rhPtr);        
	}
	public boolean eva2(CRun rhPtr)
	{
		PARAM_CHILDEVENT childEventParam = (PARAM_CHILDEVENT)evtParams[0];

        // Restore object selection
        if (childEventParam.ois.length != 0 && rhPtr.rhEvtProg.childEventSelectionStack.size() != 0)
        {
            ArrayList<SaveSelection> selectedObjects = rhPtr.rhEvtProg.childEventSelectionStack.get(rhPtr.rhEvtProg.childEventSelectionStack.size() - 1);
            rhPtr.rhEvtProg.evt_RestoreSelectedObjects(childEventParam.ois, selectedObjects);
        }
		return negaTRUE();
	}
}

