package com.vaadin.addon.charts.model;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 2.0
 * (CVALv2).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv2 along with this program.
 * If not, see <http://vaadin.com/license/cval-2.0>.
 * #L%
 */

import com.vaadin.addon.charts.model.style.SolidColor;

public class FramePanel extends AbstractConfigurationObject {
    private SolidColor color;
    private Number size;

    public FramePanel() {
    }

    public FramePanel(SolidColor color, Number size) {
        this.color = color;
        this.size = size;

    }

    /**
     * @see #setColor(SolidColor)
     * @return color
     */
    public SolidColor getColor() {
        return color;
    }

    /**
     * The color of the frame panel. Defaults to Transparent
     * 
     * @param color
     */
    public void setColor(SolidColor color) {
        this.color = color;
    }

    /**
     * @see #setSize(Number)
     * @return size
     */
    public Number getSize() {
        return size;
    }

    /**
     * Thickness of the panel. Defaults to 1.
     * 
     * @param size
     */
    public void setSize(Number size) {
        this.size = size;
    }
}
