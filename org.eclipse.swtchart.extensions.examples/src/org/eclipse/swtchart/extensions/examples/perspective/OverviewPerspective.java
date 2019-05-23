package org.eclipse.swtchart.extensions.examples.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class OverviewPerspective implements IPerspectiveFactory {

	public static final String ID = "org.eclipse.swtchart.extensions.examples.perspective.overview";

	@Override
	public void createInitialLayout(IPageLayout layout) {

		layout.setEditorAreaVisible(false);
		IFolderLayout f1 = layout.createFolder("one", IPageLayout.RIGHT, 0.5f, layout.getEditorArea());
		f1.addView("org.eclipse.swtchart.extensions.examples.part.lineseries1");
		f1.addView("org.eclipse.swtchart.extensions.examples.part.lineseries3");
		f1.addView("org.eclipse.swtchart.extensions.examples.part.lineseries4");

		IFolderLayout f2 = layout.createFolder("two", IPageLayout.LEFT, 0.5f, layout.getEditorArea());
		f2.addView("org.eclipse.swtchart.extensions.examples.part.lineseries2");
		f2.addView("org.eclipse.swtchart.extensions.examples.part.lineseries5");
		f2.addView("org.eclipse.swtchart.extensions.examples.part.lineseries6");

		IFolderLayout f3 = layout.createFolder("three", IPageLayout.BOTTOM, 0.5f, "one");
		f3.addView("org.eclipse.swtchart.extensions.examples.part.barseries1_1");
		f3.addView("org.eclipse.swtchart.extensions.examples.part.barseries1_2");
		f3.addView("org.eclipse.swtchart.extensions.examples.part.barseries1_3");
		f3.addView("org.eclipse.swtchart.extensions.examples.part.barseries3");

		IFolderLayout f4 = layout.createFolder("four", IPageLayout.BOTTOM, 0.5f, "two");
		f4.addView("org.eclipse.swtchart.extensions.examples.part.scatterseries2");
		f4.addView("org.eclipse.swtchart.extensions.examples.part.scatterseries1");
		f4.addView("org.eclipse.swtchart.extensions.examples.part.barseries2_1");
		f4.addView("org.eclipse.swtchart.extensions.examples.part.barseries2_2");
		f4.addView("org.eclipse.swtchart.extensions.examples.part.scatterseries3");
	}
}
