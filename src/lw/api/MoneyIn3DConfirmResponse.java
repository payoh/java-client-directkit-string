
package lw.api;

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
 *         &lt;element name="MoneyIn3DConfirmResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "moneyIn3DConfirmResult"
})
@XmlRootElement(name = "MoneyIn3DConfirmResponse")
public class MoneyIn3DConfirmResponse {

    @XmlElement(name = "MoneyIn3DConfirmResult")
    protected String moneyIn3DConfirmResult;

    /**
     * Gets the value of the moneyIn3DConfirmResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyIn3DConfirmResult() {
        return moneyIn3DConfirmResult;
    }

    /**
     * Sets the value of the moneyIn3DConfirmResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyIn3DConfirmResult(String value) {
        this.moneyIn3DConfirmResult = value;
    }

}
