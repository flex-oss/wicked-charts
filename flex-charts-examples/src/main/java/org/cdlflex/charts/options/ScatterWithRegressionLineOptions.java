/**
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.cdlflex.charts.options;

import org.cdlflex.charts.options.base.ShowcaseOptions;
import org.cdlflex.charts.wrapper.highcharts.options.Axis;
import org.cdlflex.charts.wrapper.highcharts.options.ChartOptions;
import org.cdlflex.charts.wrapper.highcharts.options.Marker;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptionsState;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptionsStateChoice;
import org.cdlflex.charts.wrapper.highcharts.options.SeriesType;
import org.cdlflex.charts.wrapper.highcharts.options.Title;
import org.cdlflex.charts.wrapper.highcharts.options.series.CoordinatesSeries;
import org.cdlflex.charts.wrapper.highcharts.options.series.SimpleSeries;

public class ScatterWithRegressionLineOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public ScatterWithRegressionLineOptions() {

        this.setChartOptions(new ChartOptions());

        this.setxAxis(new Axis()
            .setMin(-0.5)
            .setMax(5.5));

        this.setyAxis(new Axis()
            .setMin(0));

        this.setTitle(new Title("Scatter plot with regression line"));

        this.addSeries(new CoordinatesSeries()
            .addPoint(0, 1.11)
            .addPoint(5, 4.51)
            .setName("Regression Line")
            .setType(SeriesType.LINE)
            .setMarker(new Marker(Boolean.TRUE))
            .setStates(new PlotOptionsStateChoice().setHover(new PlotOptionsState()
                .setLineWidth(0))));

        this.addSeries(new SimpleSeries()
            .setType(SeriesType.SCATTER)
            .setName("Observations")
            .addPoint(1)
            .addPoint(1.5)
            .addPoint(2.8)
            .addPoint(3.5)
            .addPoint(3.9)
            .addPoint(4.2)
            .setMarker(new Marker().setRadius(4)));

    }

    @Override
    public String getLabel() {
        return "Scatter with regression line";
    }

}
