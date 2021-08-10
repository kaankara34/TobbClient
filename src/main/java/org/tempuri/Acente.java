
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Acente complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Acente"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AcenteAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LevhaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VergiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Oda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Calisanlist" type="{http://tempuri.org/}ArrayOfCalisan" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Adreslist" type="{http://tempuri.org/}ArrayOfAdres" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acente", propOrder = {
    "acenteAdi",
    "levhaNo",
    "vergiNo",
    "tcNo",
    "oda",
    "calisanlist",
    "adreslist"
})
public class Acente {

    @XmlElement(name = "AcenteAdi")
    protected String acenteAdi;
    @XmlElement(name = "LevhaNo")
    protected String levhaNo;
    @XmlElement(name = "VergiNo")
    protected String vergiNo;
    @XmlElement(name = "TcNo")
    protected String tcNo;
    @XmlElement(name = "Oda")
    protected String oda;
    @XmlElement(name = "Calisanlist")
    protected ArrayOfCalisan calisanlist;
    @XmlElement(name = "Adreslist")
    protected ArrayOfAdres adreslist;

    /**
     * Gets the value of the acenteAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcenteAdi() {
        return acenteAdi;
    }

    /**
     * Sets the value of the acenteAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcenteAdi(String value) {
        this.acenteAdi = value;
    }

    /**
     * Gets the value of the levhaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevhaNo() {
        return levhaNo;
    }

    /**
     * Sets the value of the levhaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevhaNo(String value) {
        this.levhaNo = value;
    }

    /**
     * Gets the value of the vergiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergiNo() {
        return vergiNo;
    }

    /**
     * Sets the value of the vergiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergiNo(String value) {
        this.vergiNo = value;
    }

    /**
     * Gets the value of the tcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcNo() {
        return tcNo;
    }

    /**
     * Sets the value of the tcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcNo(String value) {
        this.tcNo = value;
    }

    /**
     * Gets the value of the oda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOda() {
        return oda;
    }

    /**
     * Sets the value of the oda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOda(String value) {
        this.oda = value;
    }

    /**
     * Gets the value of the calisanlist property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCalisan }
     *     
     */
    public ArrayOfCalisan getCalisanlist() {
        return calisanlist;
    }

    /**
     * Sets the value of the calisanlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCalisan }
     *     
     */
    public void setCalisanlist(ArrayOfCalisan value) {
        this.calisanlist = value;
    }

    /**
     * Gets the value of the adreslist property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdres }
     *     
     */
    public ArrayOfAdres getAdreslist() {
        return adreslist;
    }

    /**
     * Sets the value of the adreslist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdres }
     *     
     */
    public void setAdreslist(ArrayOfAdres value) {
        this.adreslist = value;
    }

}
