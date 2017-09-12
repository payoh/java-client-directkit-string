
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
 *         &lt;element name="GetChargebacksResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getChargebacksResult"
})
@XmlRootElement(name = "GetChargebacksResponse")
public class GetChargebacksResponse {

    @XmlElement(name = "GetChargebacksResult")
    protected String getChargebacksResult;

    /**
     * Gets the value of the getChargebacksResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetChargebacksResult() {
        return getChargebacksResult;
    }

    /**
     * Sets the value of the getChargebacksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetChargebacksResult(String value) {
        this.getChargebacksResult = value;
    }

}
