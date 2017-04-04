
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
 *         &lt;element name="GetMoneyOutTransDetailsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getMoneyOutTransDetailsResult"
})
@XmlRootElement(name = "GetMoneyOutTransDetailsResponse")
public class GetMoneyOutTransDetailsResponse {

    @XmlElement(name = "GetMoneyOutTransDetailsResult")
    protected String getMoneyOutTransDetailsResult;

    /**
     * Gets the value of the getMoneyOutTransDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetMoneyOutTransDetailsResult() {
        return getMoneyOutTransDetailsResult;
    }

    /**
     * Sets the value of the getMoneyOutTransDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetMoneyOutTransDetailsResult(String value) {
        this.getMoneyOutTransDetailsResult = value;
    }

}
