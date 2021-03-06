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
package org.cdlflex.charts.wrapper.highcharts.options.livedata;

import org.cdlflex.charts.wrapper.highcharts.options.interaction.BaseEvent;

/**
 * An object of this event is passed to {@link LiveDataSeries#update(LiveDataUpdateEvent)}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class LiveDataUpdateEvent extends BaseEvent {

    private JavaScriptParameters parameters;

    public JavaScriptParameters getParameters() {
        return this.parameters;
    }

    /**
     * Sets the javascript parameters that are evaluated on the client side and transmitted to the server.
     *
     * @param parameters parameters that have been passed from javascript. You can define parameters to be transmitted
     *        from client side javascript to the server by calling
     *        {@link LiveDataSeries#addJavaScriptParameter(String, String)}.
     */
    public void setParameters(final JavaScriptParameters parameters) {
        this.parameters = parameters;
    }

}
