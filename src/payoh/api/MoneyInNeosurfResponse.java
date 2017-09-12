
package payoh.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MoneyInNeosurfResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "moneyInNeosurfResult"
})
@XmlRootElement(name = "MoneyInNeosurfResponse")
public class MoneyInNeosurfResponse {

    @XmlElement(name = "MoneyInNeosurfResult")
    protected String moneyInNeosurfResult;

    /**
     * Gets the value of the moneyInNeosurfResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyInNeosurfResult() {
        return moneyInNeosurfResult;
    }

    /**
     * Sets the value of the moneyInNeosurfResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyInNeosurfResult(String value) {
        this.moneyInNeosurfResult = value;
    }

}
