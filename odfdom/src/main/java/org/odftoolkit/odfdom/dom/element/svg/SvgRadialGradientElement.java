/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.svg;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgCxAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgCyAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgFxAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgFyAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgGradientTransformAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgGradientUnitsAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgRAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgSpreadMethodAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element svg:radialGradient}. */
public class SvgRadialGradientElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.SVG, "radialGradient");

  /**
   * Create the instance of <code>SvgRadialGradientElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public SvgRadialGradientElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element svg:radialGradient}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawDisplayNameAttribute</code>
   * , See {@odf.attribute draw:display-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawDisplayNameAttribute() {
    DrawDisplayNameAttribute attr =
        (DrawDisplayNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "display-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See
   * {@odf.attribute draw:display-name}
   *
   * @param drawDisplayNameValue The type is <code>String</code>
   */
  public void setDrawDisplayNameAttribute(String drawDisplayNameValue) {
    DrawDisplayNameAttribute attr = new DrawDisplayNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawDisplayNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See
   * {@odf.attribute draw:name}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawNameAttribute() {
    DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See
   * {@odf.attribute draw:name}
   *
   * @param drawNameValue The type is <code>String</code>
   */
  public void setDrawNameAttribute(String drawNameValue) {
    DrawNameAttribute attr = new DrawNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgCxAttribute</code> , See
   * {@odf.attribute svg:cx}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgCxAttribute() {
    SvgCxAttribute attr = (SvgCxAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "cx");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SvgCxAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgCxAttribute</code> , See
   * {@odf.attribute svg:cx}
   *
   * @param svgCxValue The type is <code>String</code>
   */
  public void setSvgCxAttribute(String svgCxValue) {
    SvgCxAttribute attr = new SvgCxAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgCxValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgCyAttribute</code> , See
   * {@odf.attribute svg:cy}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgCyAttribute() {
    SvgCyAttribute attr = (SvgCyAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "cy");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SvgCyAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgCyAttribute</code> , See
   * {@odf.attribute svg:cy}
   *
   * @param svgCyValue The type is <code>String</code>
   */
  public void setSvgCyAttribute(String svgCyValue) {
    SvgCyAttribute attr = new SvgCyAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgCyValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgFxAttribute</code> , See
   * {@odf.attribute svg:fx}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgFxAttribute() {
    SvgFxAttribute attr = (SvgFxAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "fx");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgFxAttribute</code> , See
   * {@odf.attribute svg:fx}
   *
   * @param svgFxValue The type is <code>String</code>
   */
  public void setSvgFxAttribute(String svgFxValue) {
    SvgFxAttribute attr = new SvgFxAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgFxValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgFyAttribute</code> , See
   * {@odf.attribute svg:fy}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgFyAttribute() {
    SvgFyAttribute attr = (SvgFyAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "fy");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgFyAttribute</code> , See
   * {@odf.attribute svg:fy}
   *
   * @param svgFyValue The type is <code>String</code>
   */
  public void setSvgFyAttribute(String svgFyValue) {
    SvgFyAttribute attr = new SvgFyAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgFyValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgGradientTransformAttribute
   * </code> , See {@odf.attribute svg:gradientTransform}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgGradientTransformAttribute() {
    SvgGradientTransformAttribute attr =
        (SvgGradientTransformAttribute)
            getOdfAttribute(OdfDocumentNamespace.SVG, "gradientTransform");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgGradientTransformAttribute</code> ,
   * See {@odf.attribute svg:gradientTransform}
   *
   * @param svgGradientTransformValue The type is <code>String</code>
   */
  public void setSvgGradientTransformAttribute(String svgGradientTransformValue) {
    SvgGradientTransformAttribute attr =
        new SvgGradientTransformAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgGradientTransformValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgGradientUnitsAttribute
   * </code> , See {@odf.attribute svg:gradientUnits}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgGradientUnitsAttribute() {
    SvgGradientUnitsAttribute attr =
        (SvgGradientUnitsAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "gradientUnits");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SvgGradientUnitsAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgGradientUnitsAttribute</code> , See
   * {@odf.attribute svg:gradientUnits}
   *
   * @param svgGradientUnitsValue The type is <code>String</code>
   */
  public void setSvgGradientUnitsAttribute(String svgGradientUnitsValue) {
    SvgGradientUnitsAttribute attr = new SvgGradientUnitsAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgGradientUnitsValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgRAttribute</code> , See
   * {@odf.attribute svg:r}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgRAttribute() {
    SvgRAttribute attr = (SvgRAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "r");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SvgRAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgRAttribute</code> , See
   * {@odf.attribute svg:r}
   *
   * @param svgRValue The type is <code>String</code>
   */
  public void setSvgRAttribute(String svgRValue) {
    SvgRAttribute attr = new SvgRAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgRValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgSpreadMethodAttribute</code>
   * , See {@odf.attribute svg:spreadMethod}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgSpreadMethodAttribute() {
    SvgSpreadMethodAttribute attr =
        (SvgSpreadMethodAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "spreadMethod");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SvgSpreadMethodAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgSpreadMethodAttribute</code> , See
   * {@odf.attribute svg:spreadMethod}
   *
   * @param svgSpreadMethodValue The type is <code>String</code>
   */
  public void setSvgSpreadMethodAttribute(String svgSpreadMethodValue) {
    SvgSpreadMethodAttribute attr = new SvgSpreadMethodAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgSpreadMethodValue);
  }

  /**
   * Create child element {@odf.element svg:stop}.
   *
   * @param svgOffsetValue the <code>String</code> value of <code>SvgOffsetAttribute</code>, see
   *     {@odf.attribute svg:offset} at specification
   * @return the element {@odf.element svg:stop}
   */
  public SvgStopElement newSvgStopElement(String svgOffsetValue) {
    SvgStopElement svgStop = ((OdfFileDom) this.ownerDocument).newOdfElement(SvgStopElement.class);
    svgStop.setSvgOffsetAttribute(svgOffsetValue);
    this.appendChild(svgStop);
    return svgStop;
  }

  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }
}
