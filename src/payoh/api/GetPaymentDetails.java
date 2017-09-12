
package payoh.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="privateData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wlLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wlPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "transactionId",
    "transactionComment",
    "privateData",
    "wlLogin",
    "wlPass",
    "language",
    "version",
    "walletIp",
    "walletUa"
})
@XmlRootElement(name = "GetPaymentDetails")
public class GetPaymentDetails {

    protected String transactionId;
    protected String transactionComment;
    protected String privateData;
    protected String wlLogin;
    protected String wlPass;
    protected String language;
    protected String version;
    protected String walletIp;
    protected String walletUa;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionComment() {
        return transactionComment;
    }

    /**
     * Sets the value of the transactionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionComment(String value) {
        this.transactionComment = value;
    }

    /**
     * Gets the value of the privateData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateData() {
        return privateData;
    }

    /**
     * Sets the value of the privateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateData(String value) {
        this.privateData = value;
    }

    /**
     * Gets the value of the wlLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlLogin() {
        return wlLogin;
    }

    /**
     * Sets the value of the wlLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlLogin(String value) {
        this.wlLogin = value;
    }

    /**
     * Gets the value of the wlPass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlPass() {
        return wlPass;
    }

    /**
     * Sets the value of the wlPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlPass(String value) {
        this.wlPass = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the walletIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletIp() {
        return walletIp;
    }

    /**
     * Sets the value of the walletIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletIp(String value) {
        this.walletIp = value;
    }

    /**
     * Gets the value of the walletUa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletUa() {
        return walletUa;
    }

    /**
     * Sets the value of the walletUa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletUa(String value) {
        this.walletUa = value;
    }

}
