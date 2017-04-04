
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
 *         &lt;element name="GetWalletTransHistoryResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getWalletTransHistoryResult"
})
@XmlRootElement(name = "GetWalletTransHistoryResponse")
public class GetWalletTransHistoryResponse {

    @XmlElement(name = "GetWalletTransHistoryResult")
    protected String getWalletTransHistoryResult;

    /**
     * Gets the value of the getWalletTransHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetWalletTransHistoryResult() {
        return getWalletTransHistoryResult;
    }

    /**
     * Sets the value of the getWalletTransHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetWalletTransHistoryResult(String value) {
        this.getWalletTransHistoryResult = value;
    }

}
