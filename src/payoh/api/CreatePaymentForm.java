
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
 *         &lt;element name="wlLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wlPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletReceiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountTot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstNamePayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastNamePayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wlLogin",
    "wlPass",
    "optId",
    "walletPayer",
    "walletReceiver",
    "walletIp",
    "walletUa",
    "amountTot",
    "amountCom",
    "comment",
    "language",
    "version",
    "firstNamePayer",
    "lastNamePayer",
    "emailPayer",
    "style"
})
@XmlRootElement(name = "CreatePaymentForm")
public class CreatePaymentForm {

    protected String wlLogin;
    protected String wlPass;
    protected String optId;
    protected String walletPayer;
    protected String walletReceiver;
    protected String walletIp;
    protected String walletUa;
    protected String amountTot;
    protected String amountCom;
    protected String comment;
    protected String language;
    protected String version;
    protected String firstNamePayer;
    protected String lastNamePayer;
    protected String emailPayer;
    protected String style;

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
     * Gets the value of the optId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptId() {
        return optId;
    }

    /**
     * Sets the value of the optId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptId(String value) {
        this.optId = value;
    }

    /**
     * Gets the value of the walletPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletPayer() {
        return walletPayer;
    }

    /**
     * Sets the value of the walletPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletPayer(String value) {
        this.walletPayer = value;
    }

    /**
     * Gets the value of the walletReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletReceiver() {
        return walletReceiver;
    }

    /**
     * Sets the value of the walletReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletReceiver(String value) {
        this.walletReceiver = value;
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

    /**
     * Gets the value of the amountTot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountTot() {
        return amountTot;
    }

    /**
     * Sets the value of the amountTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountTot(String value) {
        this.amountTot = value;
    }

    /**
     * Gets the value of the amountCom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountCom() {
        return amountCom;
    }

    /**
     * Sets the value of the amountCom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountCom(String value) {
        this.amountCom = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
     * Gets the value of the firstNamePayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNamePayer() {
        return firstNamePayer;
    }

    /**
     * Sets the value of the firstNamePayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNamePayer(String value) {
        this.firstNamePayer = value;
    }

    /**
     * Gets the value of the lastNamePayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNamePayer() {
        return lastNamePayer;
    }

    /**
     * Sets the value of the lastNamePayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNamePayer(String value) {
        this.lastNamePayer = value;
    }

    /**
     * Gets the value of the emailPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPayer() {
        return emailPayer;
    }

    /**
     * Sets the value of the emailPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPayer(String value) {
        this.emailPayer = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

}
