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
package org.cdlflex.charts.highcharts.features.interaction; /**
                                                            *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
                                                            *
                                                            *   Licensed under the Apache License, Version 2.0 (the "License");
                                                            *   you may not use this file except in compliance with the License.
                                                            *   You may obtain a copy of the License at
                                                            *        http://www.apache.org/licenses/LICENSE-2.0
                                                            *
                                                            *   Unless required by applicable law or agreed to in writing, software
                                                            *   distributed under the License is distributed on an "AS IS" BASIS,
                                                            *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                                            *   See the License for the specific language governing permissions and
                                                            *   limitations under the License.
                                                            */

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.cdlflex.charts.wrapper.highcharts.options.Options;
import org.cdlflex.charts.wrapper.highcharts.options.interaction.InteractionEvent;
import org.cdlflex.charts.wrapper.highcharts.options.series.Point;
import org.cdlflex.charts.wrapper.highcharts.options.series.Series;

/**
 * Wicket-specific extension of {@link InteractionEvent}.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class WicketInteractionEvent extends InteractionEvent {

    private final InteractionEvent wrappedEvent;
    private AjaxRequestTarget ajaxRequestTarget;

    WicketInteractionEvent(final AjaxRequestTarget ajaxRequestTarget, final InteractionEvent wrappedEvent) {
        this.wrappedEvent = wrappedEvent;
        this.setAjaxRequestTarget(ajaxRequestTarget);
    }

    /**
     * Returns the {@link AjaxRequestTarget} that is connected to the AJAX request that was triggered by interacting
     * with a chart.
     *
     * @return the Wicket {@link AjaxRequestTarget}.
     */
    public AjaxRequestTarget getAjaxRequestTarget() {
        return this.ajaxRequestTarget;
    }

    public void setAjaxRequestTarget(final AjaxRequestTarget ajaxRequestTarget) {
        this.ajaxRequestTarget = ajaxRequestTarget;
    }

    @Override
    public Options getSelectedChart() {
        return this.wrappedEvent.getSelectedChart();
    }

    @Override
    public void setSelectedChart(final Options selectedChart) {
        this.wrappedEvent.setSelectedChart(selectedChart);
    }

    @Override
    public Point getSelectedPoint() {
        return this.wrappedEvent.getSelectedPoint();
    }

    @Override
    public void setSelectedPoint(final Point selectedPoint) {
        this.wrappedEvent.setSelectedPoint(selectedPoint);
    }

    @Override
    public Series<?> getSelectedSeries() {
        return this.wrappedEvent.getSelectedSeries();
    }

    ;

    @Override
    public void setSelectedSeries(final Series<?> selectedSeries) {
        this.wrappedEvent.setSelectedSeries(selectedSeries);
    }

    @Override
    public String getJavascriptChartName() {
        return this.wrappedEvent.getJavascriptChartName();
    }

}
