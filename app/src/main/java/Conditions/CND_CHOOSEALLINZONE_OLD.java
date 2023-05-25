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
// ------------------------------------------------------------------------------
// 
// CND_CHOOSEALLINZONE_OLD
// 
// ------------------------------------------------------------------------------
package Conditions;

import OI.COI;
import Objects.CObject;
import Params.PARAM_ZONE;
import RunLoop.CRun;

public class CND_CHOOSEALLINZONE_OLD extends CCnd
{
    public boolean eva1(CRun rhPtr, CObject hoPtr)
    {
	return eva2(rhPtr);
    }
    public boolean eva2(CRun rhPtr)
    {
	PARAM_ZONE p=(PARAM_ZONE)evtParams[0];
	if (rhPtr.rhEvtProg.select_ZoneTypeObjects(p, COI.OBJ_SPR)!=0) 
	    return true;
	return false;	    
    }
}