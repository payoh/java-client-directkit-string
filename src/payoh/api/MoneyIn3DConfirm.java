
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
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPreAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delayedDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "md",
    "paRes",
    "cardType",
    "cardNumber",
    "cardCode",
    "cardDate",
    "isPreAuth",
    "specialConfig",
    "delayedDays",
    "wlLogin",
    "wlPass",
    "language",
    "version",
    "walletIp",
    "walletUa"
})
@XmlRootElement(name = "MoneyIn3DConfirm")
public class MoneyIn3DConfirm {

    protected String transactionId;
    @XmlElement(name = "MD")
    protected String md;
    @XmlElement(name = "PaRes")
    protected String paRes;
    protected String cardType;
    protected String cardNumber;
    protected String cardCode;
    protected String cardDate;
    protected String isPreAuth;
    protected String specialConfig;
    protected String delayedDays;
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
     * Gets the value of the md property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMD() {
        return md;
    }

    /**
     * Sets the value of the md property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMD(String value) {
        this.md = value;
    }

    /**
     * Gets the value of the paRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaRes() {
        return paRes;
    }

    /**
     * Sets the value of the paRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaRes(String value) {
        this.paRes = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the cardDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDate() {
        return cardDate;
    }

    /**
     * Sets the value of the cardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDate(String value) {
        this.cardDate = value;
    }

    /**
     * Gets the value of the isPreAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPreAuth() {
        return isPreAuth;
    }

    /**
     * Sets the value of the isPreAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPreAuth(String value) {
        this.isPreAuth = value;
    }

    /**
     * Gets the value of the specialConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialConfig() {
        return specialConfig;
    }

    /**
     * Sets the value of the specialConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialConfig(String value) {
        this.specialConfig = value;
    }

    /**
     * Gets the value of the delayedDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayedDays() {
        return delayedDays;
    }

    /**
     * Sets the value of the delayedDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayedDays(String value) {
        this.delayedDays = value;
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
