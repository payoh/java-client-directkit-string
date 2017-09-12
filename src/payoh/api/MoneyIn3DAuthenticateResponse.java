
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
 *         &lt;element name="MoneyIn3DAuthenticateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "moneyIn3DAuthenticateResult"
})
@XmlRootElement(name = "MoneyIn3DAuthenticateResponse")
public class MoneyIn3DAuthenticateResponse {

    @XmlElement(name = "MoneyIn3DAuthenticateResult")
    protected String moneyIn3DAuthenticateResult;

    /**
     * Gets the value of the moneyIn3DAuthenticateResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyIn3DAuthenticateResult() {
        return moneyIn3DAuthenticateResult;
    }

    /**
     * Sets the value of the moneyIn3DAuthenticateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyIn3DAuthenticateResult(String value) {
        this.moneyIn3DAuthenticateResult = value;
    }

}
