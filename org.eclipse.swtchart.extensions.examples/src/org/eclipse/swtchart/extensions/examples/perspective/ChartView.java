package org.eclipse.swtchart.extensions.examples.perspective;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;


public class ChartView<C extends Composite> extends ViewPart {

	final Constructor<C> constructor;
	C chart;

	protected ChartView(Class<C> clazz) throws Exception {

		constructor = clazz.getConstructor(Composite.class);
	}

	@Override
	public void createPartControl(Composite parent) {

		try {
			chart = constructor.newInstance(parent);
		} catch(InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setFocus() {

		chart.setFocus();
	}

	public static class LineSeries_1_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_1_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.lineseries1";

		public LineSeries_1_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_1_Part.class);
		}
	}

	public static class LineSeries_3_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_3_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.lineseries3";

		public LineSeries_3_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_3_Part.class);
		}
	}

	public static class LineSeries_4_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_4_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.lineseries4";

		public LineSeries_4_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_4_Part.class);
		}
	}

	public static class LineSeries_2_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_2_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.lineseries2";

		public LineSeries_2_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_2_Part.class);
		}
	}

	public static class LineSeries_5_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_5_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.lineseries5";

		public LineSeries_5_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_5_Part.class);
		}
	}

	public static class LineSeries_6_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_6_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.lineseries6";

		public LineSeries_6_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_6_Part.class);
		}
	}

	public static class BarSeries_1_1_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.BarSeries_1_1_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.barseries1_1";

		public BarSeries_1_1_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.BarSeries_1_1_Part.class);
		}
	}

	public static class BarSeries_1_2_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.BarSeries_1_2_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.barseries1_2";

		public BarSeries_1_2_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.BarSeries_1_2_Part.class);
		}
	}

	public static class BarSeries_1_3_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.BarSeries_1_3_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.barseries1_3";

		public BarSeries_1_3_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.BarSeries_1_3_Part.class);
		}
	}

	public static class BarSeries_3_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.BarSeries_3_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.barseries3";

		public BarSeries_3_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.BarSeries_3_Part.class);
		}
	}

	public static class ScatterSeries_2_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_2_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.scatterseries2";

		public ScatterSeries_2_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_2_Part.class);
		}
	}

	public static class ScatterSeries_1_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_1_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.scatterseries1";

		public ScatterSeries_1_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_1_Part.class);
		}
	}

	public static class BarSeries_2_1_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.BarSeries_2_1_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.barseries2_1";

		public BarSeries_2_1_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.BarSeries_2_1_Part.class);
		}
	}

	public static class BarSeries_2_2_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.BarSeries_2_2_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.barseries2_2";

		public BarSeries_2_2_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.BarSeries_2_2_Part.class);
		}
	}

	public static class ScatterSeries_3_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_3_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.scatterseries3";

		public ScatterSeries_3_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_3_Part.class);
		}
	}

	///
	public static class LineSeries_Selection_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_Selection_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_Selection_Part";

		public LineSeries_Selection_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_Selection_Part.class);
		}
	}

	public static class MeasurementSeries_1_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.MeasurementSeries_1_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.MeasurementSeries_1_Part";

		public MeasurementSeries_1_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.MeasurementSeries_1_Part.class);
		}
	}

	public static class MeasurementSeries_2_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.MeasurementSeries_2_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.MeasurementSeries_2_Part";

		public MeasurementSeries_2_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.MeasurementSeries_2_Part.class);
		}
	}

	public static class LineSeries_7_HighBackground_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_7_HighBackground_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_7_HighBackground_Part";

		public LineSeries_7_HighBackground_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_7_HighBackground_Part.class);
		}
	}

	public static class MeasurementSeries_3_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.MeasurementSeries_3_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.MeasurementSeries_3_Part";

		public MeasurementSeries_3_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.MeasurementSeries_3_Part.class);
		}
	}

	public static class LineSeries_7_Normal_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_7_Normal_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_7_Normal_Part";

		public LineSeries_7_Normal_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_7_Normal_Part.class);
		}
	}

	public static class BarSeries_4_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.BarSeries_4_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.BarSeries_4_Part";

		public BarSeries_4_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.BarSeries_4_Part.class);
		}
	}

	public static class LineSeries_8_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_8_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_8_Part";

		public LineSeries_8_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_8_Part.class);
		}
	}

	public static class BarSeries_Preferences_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.BarSeries_Preferences_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.BarSeries_Preferences_Part";

		public BarSeries_Preferences_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.BarSeries_Preferences_Part.class);
		}
	}

	public static class LineSeries_9_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_9_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_9_Part";

		public LineSeries_9_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_9_Part.class);
		}
	}

	public static class LineSeries_Edit_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_Edit_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_Edit_Part";

		public LineSeries_Edit_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_Edit_Part.class);
		}
	}

	public static class ScatterSeries_Edit_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_Edit_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.ScatterSeries_Edit_Part";

		public ScatterSeries_Edit_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_Edit_Part.class);
		}
	}

	public static class LineSeries_10_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_10_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_10_Part";

		public LineSeries_10_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_10_Part.class);
		}
	}

	public static class LineSeries_Preferences_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_Preferences_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_Preferences_Part";

		public LineSeries_Preferences_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_Preferences_Part.class);
		}
	}

	public static class ScatterSeries_Preferences_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_Preferences_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.ScatterSeries_Preferences_Part";

		public ScatterSeries_Preferences_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.ScatterSeries_Preferences_Part.class);
		}
	}

	public static class LineSeries_Random_Part extends ChartView<org.eclipse.swtchart.extensions.examples.parts.LineSeries_Random_Part> {

		public static final String id = "org.eclipse.swtchart.extensions.examples.part.LineSeries_Random_Part";

		public LineSeries_Random_Part() throws Exception {

			super(org.eclipse.swtchart.extensions.examples.parts.LineSeries_Random_Part.class);
		}
	}
}
