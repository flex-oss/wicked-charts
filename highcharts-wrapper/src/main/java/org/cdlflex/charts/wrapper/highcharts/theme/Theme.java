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
package org.cdlflex.charts.wrapper.highcharts.theme;

import org.cdlflex.charts.wrapper.highcharts.options.DummyOption;
import org.cdlflex.charts.wrapper.highcharts.options.LanguageOptions;
import org.cdlflex.charts.wrapper.highcharts.options.Options;
import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;

/**
 * A theme can define any of the general Options and thus centralize all theme-relevant options in a single object.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Theme extends Options {

    private static final long serialVersionUID = 1L;

    private ColorReference legendBackgroundColor;

    private ColorReference legendBackgroundColorSolid;

    private ColorReference dataLabelsColor;

    private ColorReference textColor;

    private ColorReference maskColor;

    private DummyOption toolbar;

    private DummyOption rangeSelector;

    private DummyOption navigator;

    private DummyOption scrollbar;

    private LanguageOptions lang;

    public ColorReference getDataLabelsColor() {
        return this.dataLabelsColor;
    }

    public Theme setDataLabelsColor(final ColorReference dataLabelsColor) {
        this.dataLabelsColor = dataLabelsColor;
        return this;
    }

    public LanguageOptions getLang() {
        return this.lang;
    }

    public Theme setLang(final LanguageOptions lang) {
        this.lang = lang;
        return this;
    }

    public ColorReference getLegendBackgroundColor() {
        return this.legendBackgroundColor;
    }

    public Theme setLegendBackgroundColor(final ColorReference legendBackgroundColor) {
        this.legendBackgroundColor = legendBackgroundColor;
        return this;
    }

    public ColorReference getLegendBackgroundColorSolid() {
        return this.legendBackgroundColorSolid;
    }

    public Theme setLegendBackgroundColorSolid(final ColorReference legendBackgroundColorSolid) {
        this.legendBackgroundColorSolid = legendBackgroundColorSolid;
        return this;
    }

    public ColorReference getMaskColor() {
        return this.maskColor;
    }

    public Theme setMaskColor(final ColorReference maskColor) {
        this.maskColor = maskColor;
        return this;
    }

    public DummyOption getNavigator() {
        return this.navigator;
    }

    public Theme setNavigator(final DummyOption navigator) {
        this.navigator = navigator;
        return this;
    }

    public DummyOption getRangeSelector() {
        return this.rangeSelector;
    }

    public Theme setRangeSelector(final DummyOption rangeSelector) {
        this.rangeSelector = rangeSelector;
        return this;
    }

    public DummyOption getScrollbar() {
        return this.scrollbar;
    }

    public Theme setScrollbar(final DummyOption scrollbar) {
        this.scrollbar = scrollbar;
        return this;
    }

    public ColorReference getTextColor() {
        return this.textColor;
    }

    public Theme setTextColor(final ColorReference textColor) {
        this.textColor = textColor;
        return this;
    }

    public DummyOption getToolbar() {
        return this.toolbar;
    }

    public Theme setToolbar(final DummyOption toolbar) {
        this.toolbar = toolbar;
        return this;
    }

}
