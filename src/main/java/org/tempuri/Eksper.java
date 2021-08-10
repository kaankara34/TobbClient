
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Eksper complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Eksper"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="EksperAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LevhaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VergiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FirmaVergiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Oda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsTelefonu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CepTelefonu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Eksper", propOrder = {
    "eksperAdi",
    "levhaNo",
    "vergiNo",
    "firmaVergiNo",
    "tcNo",
    "oda",
    "isTelefonu",
    "cepTelefonu",
    "email",
    "calisanlist",
    "adreslist"
})
public class Eksper {

    @XmlElement(name = "EksperAdi")
    protected String eksperAdi;
    @XmlElement(name = "LevhaNo")
    protected String levhaNo;
    @XmlElement(name = "VergiNo")
    protected String vergiNo;
    @XmlElement(name = "FirmaVergiNo")
    protected String firmaVergiNo;
    @XmlElement(name = "TcNo")
    protected String tcNo;
    @XmlElement(name = "Oda")
    protected String oda;
    @XmlElement(name = "IsTelefonu")
    protected String isTelefonu;
    @XmlElement(name = "CepTelefonu")
    protected String cepTelefonu;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Calisanlist")
    protected ArrayOfCalisan calisanlist;
    @XmlElement(name = "Adreslist")
    protected ArrayOfAdres adreslist;

    /**
     * Gets the value of the eksperAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEksperAdi() {
        return eksperAdi;
    }

    /**
     * Sets the value of the eksperAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEksperAdi(String value) {
        this.eksperAdi = value;
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
     * Gets the value of the firmaVergiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmaVergiNo() {
        return firmaVergiNo;
    }

    /**
     * Sets the value of the firmaVergiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmaVergiNo(String value) {
        this.firmaVergiNo = value;
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
     * Gets the value of the isTelefonu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTelefonu() {
        return isTelefonu;
    }

    /**
     * Sets the value of the isTelefonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTelefonu(String value) {
        this.isTelefonu = value;
    }

    /**
     * Gets the value of the cepTelefonu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepTelefonu() {
        return cepTelefonu;
    }

    /**
     * Sets the value of the cepTelefonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepTelefonu(String value) {
        this.cepTelefonu = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
