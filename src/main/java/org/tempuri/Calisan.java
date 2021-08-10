
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for Calisan complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Calisan"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Adi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Soyadi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SicilNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KayitDurumuAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CalisanTipiAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="BitisTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="Ruhsatlist" type="{http://tempuri.org/}ArrayOfRuhsat" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calisan", propOrder = {
    "tcKimlikNo",
    "adi",
    "soyadi",
    "sicilNo",
    "kayitDurumuAdi",
    "calisanTipiAdi",
    "baslangicTarihi",
    "bitisTarihi",
    "ruhsatlist"
})
public class Calisan {

    @XmlElement(name = "TcKimlikNo")
    protected String tcKimlikNo;
    @XmlElement(name = "Adi")
    protected String adi;
    @XmlElement(name = "Soyadi")
    protected String soyadi;
    @XmlElement(name = "SicilNo")
    protected String sicilNo;
    @XmlElement(name = "KayitDurumuAdi")
    protected String kayitDurumuAdi;
    @XmlElement(name = "CalisanTipiAdi")
    protected String calisanTipiAdi;
    @XmlElement(name = "BaslangicTarihi", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar baslangicTarihi;
    @XmlElement(name = "BitisTarihi", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bitisTarihi;
    @XmlElement(name = "Ruhsatlist")
    protected ArrayOfRuhsat ruhsatlist;

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcKimlikNo(String value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the adi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdi() {
        return adi;
    }

    /**
     * Sets the value of the adi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdi(String value) {
        this.adi = value;
    }

    /**
     * Gets the value of the soyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyadi() {
        return soyadi;
    }

    /**
     * Sets the value of the soyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyadi(String value) {
        this.soyadi = value;
    }

    /**
     * Gets the value of the sicilNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicilNo() {
        return sicilNo;
    }

    /**
     * Sets the value of the sicilNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicilNo(String value) {
        this.sicilNo = value;
    }

    /**
     * Gets the value of the kayitDurumuAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKayitDurumuAdi() {
        return kayitDurumuAdi;
    }

    /**
     * Sets the value of the kayitDurumuAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKayitDurumuAdi(String value) {
        this.kayitDurumuAdi = value;
    }

    /**
     * Gets the value of the calisanTipiAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalisanTipiAdi() {
        return calisanTipiAdi;
    }

    /**
     * Sets the value of the calisanTipiAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalisanTipiAdi(String value) {
        this.calisanTipiAdi = value;
    }

    /**
     * Gets the value of the baslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBaslangicTarihi() {
        return baslangicTarihi;
    }

    /**
     * Sets the value of the baslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBaslangicTarihi(XMLGregorianCalendar value) {
        this.baslangicTarihi = value;
    }

    /**
     * Gets the value of the bitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBitisTarihi() {
        return bitisTarihi;
    }

    /**
     * Sets the value of the bitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBitisTarihi(XMLGregorianCalendar value) {
        this.bitisTarihi = value;
    }

    /**
     * Gets the value of the ruhsatlist property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuhsat }
     *     
     */
    public ArrayOfRuhsat getRuhsatlist() {
        return ruhsatlist;
    }

    /**
     * Sets the value of the ruhsatlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuhsat }
     *     
     */
    public void setRuhsatlist(ArrayOfRuhsat value) {
        this.ruhsatlist = value;
    }

}
