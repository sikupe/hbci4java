
package org.kapott.hbci.sepa.jaxb.pain_001_001_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Party5Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Party5Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OrgId" type="{urn:sepade:xsd:pain.001.001.02}OrganisationIdentification2"/>
 *           &lt;element name="PrvtId" type="{urn:sepade:xsd:pain.001.001.02}PersonIdentification3"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party5Choice", namespace = "urn:sepade:xsd:pain.001.001.02", propOrder = {
    "orgId",
    "prvtId"
})
public class Party5Choice {

    @XmlElement(name = "OrgId", namespace = "urn:sepade:xsd:pain.001.001.02")
    protected OrganisationIdentification2 orgId;
    @XmlElement(name = "PrvtId", namespace = "urn:sepade:xsd:pain.001.001.02")
    protected PersonIdentification3 prvtId;

    /**
     * Ruft den Wert der orgId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification2 }
     *     
     */
    public OrganisationIdentification2 getOrgId() {
        return orgId;
    }

    /**
     * Legt den Wert der orgId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification2 }
     *     
     */
    public void setOrgId(OrganisationIdentification2 value) {
        this.orgId = value;
    }

    /**
     * Ruft den Wert der prvtId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification3 }
     *     
     */
    public PersonIdentification3 getPrvtId() {
        return prvtId;
    }

    /**
     * Legt den Wert der prvtId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification3 }
     *     
     */
    public void setPrvtId(PersonIdentification3 value) {
        this.prvtId = value;
    }

}