package org.eclipse.swtchart.extensions.examples.perspective;

import java.util.ArrayList;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swtchart.Chart;
import org.eclipse.swtchart.examples.AngledAxisTickLabelsExample;
import org.eclipse.swtchart.examples.AreaChartExample;
import org.eclipse.swtchart.examples.BarChartExample;
import org.eclipse.swtchart.examples.CategoryExample;
import org.eclipse.swtchart.examples.ErrorBarsExample;
import org.eclipse.swtchart.examples.LargeSeriesExample;
import org.eclipse.swtchart.examples.LineChartExample;
import org.eclipse.swtchart.examples.LogScaleExample;
import org.eclipse.swtchart.examples.MultipleAxesExample;
import org.eclipse.swtchart.examples.OrientationExample;
import org.eclipse.swtchart.examples.ScatterChartExample;
import org.eclipse.swtchart.examples.SeriesLabelExample;
import org.eclipse.swtchart.examples.StackSeriesExample;
import org.eclipse.swtchart.examples.StepChartExample;
import org.eclipse.swtchart.examples.advanced.AxisTickBoundsExample;
import org.eclipse.swtchart.examples.advanced.BarBoundsExample;
import org.eclipse.swtchart.examples.advanced.CustomPaintListenerExample;
import org.eclipse.swtchart.examples.advanced.DataToPixelConversionExample;
import org.eclipse.swtchart.examples.advanced.LegendBoundsExample;
import org.eclipse.swtchart.examples.advanced.PxielToDataConversionExample;
import org.eclipse.swtchart.examples.advanced.SymbolBoundsExample;
import org.eclipse.ui.part.ViewPart;

public class SWTChartView extends ViewPart
{
	public static final String ID = "org.eclipse.swtchart.extensions.examples.view.swtchart";
	
	private java.util.List<Chart> charts = new ArrayList<>();

	private void createCharts(Composite parent) {

		charts.add(LineChartExample.createChart(parent));
		charts.add(BarChartExample.createChart(parent));
		charts.add(ScatterChartExample.createChart(parent));
		charts.add(AreaChartExample.createChart(parent));
		charts.add(StepChartExample.createChart(parent));
		charts.add(StackSeriesExample.createChart(parent));
		charts.add(LogScaleExample.createChart(parent));
		charts.add(OrientationExample.createChart(parent));
		charts.add(CategoryExample.createChart(parent));
		charts.add(SeriesLabelExample.createChart(parent));
		charts.add(ErrorBarsExample.createChart(parent));
		charts.add(MultipleAxesExample.createChart(parent));
		charts.add(LargeSeriesExample.createChart(parent));
		charts.add(AngledAxisTickLabelsExample.createChart(parent));
		charts.add(PxielToDataConversionExample.createChart(parent));
		charts.add(DataToPixelConversionExample.createChart(parent));
		charts.add(SymbolBoundsExample.createChart(parent));
		charts.add(BarBoundsExample.createChart(parent));
		charts.add(AxisTickBoundsExample.createChart(parent));
		charts.add(LegendBoundsExample.createChart(parent));
		charts.add(CustomPaintListenerExample.createChart(parent));
	}
	
	@Override
	public void createPartControl(Composite parent) {
		GridLayoutFactory.fillDefaults().applyTo(parent);
		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);
		GridDataFactory.fillDefaults().grab(true,  true).applyTo(sashForm);
		
		final List list = new List(sashForm, SWT.H_SCROLL | SWT.V_SCROLL);
		final Composite chartsComposite = new Composite(sashForm, SWT.NONE);
		
		chartsComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		final StackLayout layout = new StackLayout();
		chartsComposite.setLayout(layout);

		createCharts(chartsComposite);
		
		for(Chart chart : charts) {
			list.add(chart.getTitle().getText());
		}
		list.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {

				Chart chart = charts.get(list.getSelectionIndex());
				chart.getAxisSet().adjustRange();
				layout.topControl = chart;
				chartsComposite.layout();
			}
		});
		sashForm.setWeights(new int[]{1, 3});
	}

	@Override
	public void setFocus() {

	}
}
