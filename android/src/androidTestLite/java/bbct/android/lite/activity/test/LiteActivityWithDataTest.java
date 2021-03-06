/*
 * This file is part of BBCT for Android.
 *
 * Copyright 2012-14 codeguru <codeguru@users.sourceforge.net>
 *
 * BBCT for Android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BBCT for Android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bbct.android.lite.activity.test;

import android.support.test.runner.AndroidJUnit4;
import bbct.android.common.activity.test.BaseballCardListWithDataTest;
import bbct.android.lite.provider.LiteActivity;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LiteActivityWithDataTest extends BaseballCardListWithDataTest<LiteActivity> {

    /**
     * Create instrumented test cases for {@link LiteActivity}.
     */
    public LiteActivityWithDataTest() {
        super(LiteActivity.class);
    }

}
