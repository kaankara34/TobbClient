
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetEksperResult" type="{http://tempuri.org/}Eksper" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getEksperResult"
})
@XmlRootElement(name = "GetEksperResponse")
public class GetEksperResponse {

    @XmlElement(name = "GetEksperResult")
    protected Eksper getEksperResult;

    /**
     * Gets the value of the getEksperResult property.
     * 
     * @return
     *     possible object is
     *     {@link Eksper }
     *     
     */
    public Eksper getGetEksperResult() {
        return getEksperResult;
    }

    /**
     * Sets the value of the getEksperResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eksper }
     *     
     */
    public void setGetEksperResult(Eksper value) {
        this.getEksperResult = value;
    }

}
