
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Adres complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Adres"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AdresTipi" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="MerkezSube" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="SubeKodu" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="Il" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Ilce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AcikAdres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Adresi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ListIpAdres" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adres", propOrder = {
    "adresTipi",
    "merkezSube",
    "subeKodu",
    "il",
    "ilce",
    "acikAdres",
    "adresi",
    "listIpAdres"
})
public class Adres {

    @XmlElement(name = "AdresTipi")
    protected int adresTipi;
    @XmlElement(name = "MerkezSube")
    protected int merkezSube;
    @XmlElement(name = "SubeKodu")
    protected int subeKodu;
    @XmlElement(name = "Il")
    protected String il;
    @XmlElement(name = "Ilce")
    protected String ilce;
    @XmlElement(name = "AcikAdres")
    protected String acikAdres;
    @XmlElement(name = "Adresi")
    protected String adresi;
    @XmlElement(name = "ListIpAdres")
    protected ArrayOfString listIpAdres;

    /**
     * Gets the value of the adresTipi property.
     * 
     */
    public int getAdresTipi() {
        return adresTipi;
    }

    /**
     * Sets the value of the adresTipi property.
     * 
     */
    public void setAdresTipi(int value) {
        this.adresTipi = value;
    }

    /**
     * Gets the value of the merkezSube property.
     * 
     */
    public int getMerkezSube() {
        return merkezSube;
    }

    /**
     * Sets the value of the merkezSube property.
     * 
     */
    public void setMerkezSube(int value) {
        this.merkezSube = value;
    }

    /**
     * Gets the value of the subeKodu property.
     * 
     */
    public int getSubeKodu() {
        return subeKodu;
    }

    /**
     * Sets the value of the subeKodu property.
     * 
     */
    public void setSubeKodu(int value) {
        this.subeKodu = value;
    }

    /**
     * Gets the value of the il property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIl() {
        return il;
    }

    /**
     * Sets the value of the il property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIl(String value) {
        this.il = value;
    }

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlce(String value) {
        this.ilce = value;
    }

    /**
     * Gets the value of the acikAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcikAdres() {
        return acikAdres;
    }

    /**
     * Sets the value of the acikAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcikAdres(String value) {
        this.acikAdres = value;
    }

    /**
     * Gets the value of the adresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresi() {
        return adresi;
    }

    /**
     * Sets the value of the adresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresi(String value) {
        this.adresi = value;
    }

    /**
     * Gets the value of the listIpAdres property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getListIpAdres() {
        return listIpAdres;
    }

    /**
     * Sets the value of the listIpAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setListIpAdres(ArrayOfString value) {
        this.listIpAdres = value;
    }

}
