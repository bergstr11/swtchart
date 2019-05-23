package org.eclipse.swtchart.extensions.examples.perspective;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;


public class ShowSecondHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			PlatformUI.getWorkbench().showPerspective(SecondPerspective.ID, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
		} catch(WorkbenchException e) {
			e.printStackTrace();
		}
		return null;
	}
}
