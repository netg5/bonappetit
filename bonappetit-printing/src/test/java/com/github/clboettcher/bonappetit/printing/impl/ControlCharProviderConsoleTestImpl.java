/*
 * Copyright (c) 2016 Claudius Boettcher (pos.bonappetit@gmail.com)
 *
 * This file is part of BonAppetit. BonAppetit is an Android based
 * Point-of-Sale client-server application for small restaurants.
 *
 * BonAppetit is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BonAppetit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with BonAppetit.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.clboettcher.bonappetit.printing.impl;

public class ControlCharProviderConsoleTestImpl implements ControlCharProvider {
    @Override
    public String getInit() {
        return "[INIT]\n";
    }

    @Override
    public String getAlignCenterString() {
        return "[CENTER]";
    }

    @Override
    public String getDoubleWidthDoubleHeightString() {
        return "[STRONG]";
    }

    @Override
    public String getLineFeedChar() {
        return "\n";
    }

    @Override
    public String getAlignLeftString() {
        return "[LEFT]";
    }

    @Override
    public String getNormalWidthNormalHeightString() {
        return "[NORMAL]";
    }

    @Override
    public String getPartialCutString() {
        return "----------------------- ** -----------------------\n";
    }
}
