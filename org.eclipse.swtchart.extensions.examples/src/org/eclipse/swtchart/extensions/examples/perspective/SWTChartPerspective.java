package org.eclipse.swtchart.extensions.examples.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;


public class SWTChartPerspective implements IPerspectiveFactory {

	public static final String ID = "org.eclipse.swtchart.extensions.examples.perspective.swtchart";
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView(SWTChartView.ID, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
	}
}
