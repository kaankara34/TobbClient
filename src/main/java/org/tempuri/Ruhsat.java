
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for Ruhsat complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Ruhsat"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RuhsatAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DokumanNumarasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Aciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DokumanTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ruhsat", propOrder = {
    "ruhsatAdi",
    "dokumanNumarasi",
    "aciklama",
    "dokumanTarihi"
})
public class Ruhsat {

    @XmlElement(name = "RuhsatAdi")
    protected String ruhsatAdi;
    @XmlElement(name = "DokumanNumarasi")
    protected String dokumanNumarasi;
    @XmlElement(name = "Aciklama")
    protected String aciklama;
    @XmlElement(name = "DokumanTarihi", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dokumanTarihi;

    /**
     * Gets the value of the ruhsatAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuhsatAdi() {
        return ruhsatAdi;
    }

    /**
     * Sets the value of the ruhsatAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuhsatAdi(String value) {
        this.ruhsatAdi = value;
    }

    /**
     * Gets the value of the dokumanNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokumanNumarasi() {
        return dokumanNumarasi;
    }

    /**
     * Sets the value of the dokumanNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokumanNumarasi(String value) {
        this.dokumanNumarasi = value;
    }

    /**
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAciklama(String value) {
        this.aciklama = value;
    }

    /**
     * Gets the value of the dokumanTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDokumanTarihi() {
        return dokumanTarihi;
    }

    /**
     * Sets the value of the dokumanTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDokumanTarihi(XMLGregorianCalendar value) {
        this.dokumanTarihi = value;
    }

}
