
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
 *         &amp;lt;element name="GetAcenteResult" type="{http://tempuri.org/}Acente" minOccurs="0"/&amp;gt;
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
    "getAcenteResult"
})
@XmlRootElement(name = "GetAcenteResponse")
public class GetAcenteResponse {

    @XmlElement(name = "GetAcenteResult")
    protected Acente getAcenteResult;

    /**
     * Gets the value of the getAcenteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Acente }
     *     
     */
    public Acente getGetAcenteResult() {
        return getAcenteResult;
    }

    /**
     * Sets the value of the getAcenteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acente }
     *     
     */
    public void setGetAcenteResult(Acente value) {
        this.getAcenteResult = value;
    }

}
