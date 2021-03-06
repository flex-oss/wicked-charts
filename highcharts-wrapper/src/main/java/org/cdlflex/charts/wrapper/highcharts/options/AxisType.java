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
package org.cdlflex.charts.wrapper.highcharts.options;

import org.cdlflex.charts.wrapper.highcharts.json.LowercaseEnum;

/**
 * Defines the type of an axis.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#Axis.type">http://api.highcharts.com/highcharts#Axis.type</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public enum AxisType implements LowercaseEnum {

    LINEAR,

    DATETIME,

    LOGARITHMIC,

    CATEGORY;
}
