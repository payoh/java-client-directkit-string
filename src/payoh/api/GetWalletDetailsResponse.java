
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
 *         &lt;element name="GetWalletDetailsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getWalletDetailsResult"
})
@XmlRootElement(name = "GetWalletDetailsResponse")
public class GetWalletDetailsResponse {

    @XmlElement(name = "GetWalletDetailsResult")
    protected String getWalletDetailsResult;

    /**
     * Gets the value of the getWalletDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetWalletDetailsResult() {
        return getWalletDetailsResult;
    }

    /**
     * Sets the value of the getWalletDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetWalletDetailsResult(String value) {
        this.getWalletDetailsResult = value;
    }

}
