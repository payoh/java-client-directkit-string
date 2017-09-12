
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
 *         &lt;element name="RefundMoneyInResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "refundMoneyInResult"
})
@XmlRootElement(name = "RefundMoneyInResponse")
public class RefundMoneyInResponse {

    @XmlElement(name = "RefundMoneyInResult")
    protected String refundMoneyInResult;

    /**
     * Gets the value of the refundMoneyInResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundMoneyInResult() {
        return refundMoneyInResult;
    }

    /**
     * Sets the value of the refundMoneyInResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundMoneyInResult(String value) {
        this.refundMoneyInResult = value;
    }

}
