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
package org.cdlflex.charts.wrapper.highcharts.jackson;

import org.cdlflex.charts.wrapper.highcharts.options.Symbol;
import org.junit.Assert;
import org.junit.Test;

public class SymbolSerializerTest {

    @Test
    public void testPredefined() {
        // given
        Symbol symbol = new Symbol(Symbol.PredefinedSymbol.TRIANGLEDOWN);
        JsonRenderer renderer = new JsonRenderer();

        // when
        String json = renderer.toJson(symbol);

        // then
        Assert.assertEquals("\"triangle-down\"", json);
    }

    @Test
    public void testUrl() {
        // given
        Symbol symbol = new Symbol("mysymbol.gif");
        JsonRenderer renderer = new JsonRenderer();

        // when
        String json = renderer.toJson(symbol);

        // then
        Assert.assertEquals("\"url(mysymbol.gif)\"", json);
    }

}
