
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
 *         &lt;element name="MoneyInPayTrailInitResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "moneyInPayTrailInitResult"
})
@XmlRootElement(name = "MoneyInPayTrailInitResponse")
public class MoneyInPayTrailInitResponse {

    @XmlElement(name = "MoneyInPayTrailInitResult")
    protected String moneyInPayTrailInitResult;

    /**
     * Gets the value of the moneyInPayTrailInitResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyInPayTrailInitResult() {
        return moneyInPayTrailInitResult;
    }

    /**
     * Sets the value of the moneyInPayTrailInitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyInPayTrailInitResult(String value) {
        this.moneyInPayTrailInitResult = value;
    }

}
