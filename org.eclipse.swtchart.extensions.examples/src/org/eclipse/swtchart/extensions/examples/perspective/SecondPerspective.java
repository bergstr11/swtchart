package org.eclipse.swtchart.extensions.examples.perspective;

import org.eclipse.swtchart.extensions.examples.perspective.ChartView.BarSeries_4_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.BarSeries_Preferences_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_10_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_7_HighBackground_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_7_Normal_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_8_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_9_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_Edit_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_Preferences_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_Random_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.LineSeries_Selection_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.MeasurementSeries_1_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.MeasurementSeries_2_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.MeasurementSeries_3_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.ScatterSeries_Edit_Part;
import org.eclipse.swtchart.extensions.examples.perspective.ChartView.ScatterSeries_Preferences_Part;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class SecondPerspective implements IPerspectiveFactory {

	public static final String ID = "org.eclipse.swtchart.extensions.examples.perspective.second";

	@Override
	public void createInitialLayout(IPageLayout layout) {

		layout.setEditorAreaVisible(false);
		IFolderLayout f1 = layout.createFolder("one", IPageLayout.RIGHT, 0.5f, layout.getEditorArea());
		f1.addView(LineSeries_Selection_Part.id);
		f1.addView(MeasurementSeries_1_Part.id);
		f1.addView(MeasurementSeries_2_Part.id);

		IFolderLayout f2 = layout.createFolder("two", IPageLayout.LEFT, 0.5f, layout.getEditorArea());
		f2.addView(LineSeries_7_HighBackground_Part.id);
		f2.addView(MeasurementSeries_3_Part.id);
		f2.addView(LineSeries_7_Normal_Part.id);

		IFolderLayout f3 = layout.createFolder("three", IPageLayout.BOTTOM, 0.5f, "one");
		f3.addView(BarSeries_4_Part.id);
		f3.addView(LineSeries_8_Part.id);
		f3.addView(BarSeries_Preferences_Part.id);
		f3.addView(LineSeries_9_Part.id);
		f3.addView(LineSeries_Random_Part.id);

		IFolderLayout f4 = layout.createFolder("four", IPageLayout.BOTTOM, 0.5f, "two");
		f4.addView(LineSeries_Edit_Part.id);
		f4.addView(ScatterSeries_Edit_Part.id);
		f4.addView(LineSeries_10_Part.id);
		f4.addView(LineSeries_Preferences_Part.id);
		f4.addView(ScatterSeries_Preferences_Part.id);
	}
}