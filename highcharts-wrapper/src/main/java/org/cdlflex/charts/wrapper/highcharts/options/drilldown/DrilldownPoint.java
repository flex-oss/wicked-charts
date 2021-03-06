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
package org.cdlflex.charts.wrapper.highcharts.options.drilldown;

import org.cdlflex.charts.wrapper.highcharts.options.IProcessableOption;
import org.cdlflex.charts.wrapper.highcharts.options.Options;
import org.cdlflex.charts.wrapper.highcharts.options.series.Point;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A {@link Point} that allows to specify a drill down to show a different chart on click.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class DrilldownPoint extends Point implements IProcessableOption {

    /**
     * The key under which {@link DrilldownPoint}s are registered in the parent options. See
     * {@link Options#markForProcessing(IProcessableOption)} .
     */
    public static final String PROCESSING_KEY = "DRILLDOWN";

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private final Options drilldownOptions;

    private Integer drilldownOptionsIndex;

    /**
     * Constructs a {@link DrilldownPoint}.
     * 
     * @param parentOptions the {@link Options} object this {@link DrilldownPoint} is attached to.
     * @param drilldownOptions the chart configuration that is to be displayed when clicking the Point.
     */
    public DrilldownPoint(Options parentOptions, Options drilldownOptions) {
        if (drilldownOptions == null) {
            throw new IllegalArgumentException("parameter drilldownOptions must not be null!");
        }
        this.drilldownOptions = drilldownOptions;
        parentOptions.markForProcessing(this);
    }

    public Options getDrilldownOptions() {
        return drilldownOptions;
    }

    public Integer getDrilldownOptionsIndex() {
        return drilldownOptionsIndex;
    }

    /**
     * All drilldown options are stored in a javascript array. This method sets the index of the options a click on the
     * {@link DrilldownPoint} should show. This method is NOT part of the public API!
     * 
     * @param drilldownOptionsIndex the drilldown options index
     * @return returns the point for chaining
     */
    public Point setDrilldownOptionsIndex(Integer drilldownOptionsIndex) {
        this.drilldownOptionsIndex = drilldownOptionsIndex;
        return this;
    }

    @Override
    @JsonIgnore
    public String getProcessingKey() {
        return PROCESSING_KEY;
    }

}
