
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
 *         &lt;element name="MoneyIn3DInitResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "moneyIn3DInitResult"
})
@XmlRootElement(name = "MoneyIn3DInitResponse")
public class MoneyIn3DInitResponse {

    @XmlElement(name = "MoneyIn3DInitResult")
    protected String moneyIn3DInitResult;

    /**
     * Gets the value of the moneyIn3DInitResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyIn3DInitResult() {
        return moneyIn3DInitResult;
    }

    /**
     * Sets the value of the moneyIn3DInitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyIn3DInitResult(String value) {
        this.moneyIn3DInitResult = value;
    }

}
