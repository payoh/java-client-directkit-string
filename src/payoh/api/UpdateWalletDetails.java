
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
 *         &lt;element name="wallet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCtry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newMobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newIsCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCompanyWebsite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCompanyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newIsDebtor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newBirthcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newBirthcountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCompanyIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wallet",
    "newEmail",
    "newTitle",
    "newFirstName",
    "newLastName",
    "newStreet",
    "newPostCode",
    "newCity",
    "newCtry",
    "newIp",
    "newPhoneNumber",
    "newMobileNumber",
    "newBirthDate",
    "newIsCompany",
    "newCompanyName",
    "newCompanyWebsite",
    "newCompanyDescription",
    "newIsDebtor",
    "newNationality",
    "newBirthcity",
    "newBirthcountry",
    "newCompanyIdentificationNumber",
    "wlLogin",
    "wlPass",
    "language",
    "version",
    "walletIp",
    "walletUa"
})
@XmlRootElement(name = "UpdateWalletDetails")
public class UpdateWalletDetails {

    protected String wallet;
    protected String newEmail;
    protected String newTitle;
    protected String newFirstName;
    protected String newLastName;
    protected String newStreet;
    protected String newPostCode;
    protected String newCity;
    protected String newCtry;
    protected String newIp;
    protected String newPhoneNumber;
    protected String newMobileNumber;
    protected String newBirthDate;
    protected String newIsCompany;
    protected String newCompanyName;
    protected String newCompanyWebsite;
    protected String newCompanyDescription;
    protected String newIsDebtor;
    protected String newNationality;
    protected String newBirthcity;
    protected String newBirthcountry;
    protected String newCompanyIdentificationNumber;
    protected String wlLogin;
    protected String wlPass;
    protected String language;
    protected String version;
    protected String walletIp;
    protected String walletUa;

    /**
     * Gets the value of the wallet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWallet() {
        return wallet;
    }

    /**
     * Sets the value of the wallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWallet(String value) {
        this.wallet = value;
    }

    /**
     * Gets the value of the newEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmail() {
        return newEmail;
    }

    /**
     * Sets the value of the newEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmail(String value) {
        this.newEmail = value;
    }

    /**
     * Gets the value of the newTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTitle() {
        return newTitle;
    }

    /**
     * Sets the value of the newTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTitle(String value) {
        this.newTitle = value;
    }

    /**
     * Gets the value of the newFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFirstName() {
        return newFirstName;
    }

    /**
     * Sets the value of the newFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFirstName(String value) {
        this.newFirstName = value;
    }

    /**
     * Gets the value of the newLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewLastName() {
        return newLastName;
    }

    /**
     * Sets the value of the newLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewLastName(String value) {
        this.newLastName = value;
    }

    /**
     * Gets the value of the newStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStreet() {
        return newStreet;
    }

    /**
     * Sets the value of the newStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStreet(String value) {
        this.newStreet = value;
    }

    /**
     * Gets the value of the newPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPostCode() {
        return newPostCode;
    }

    /**
     * Sets the value of the newPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPostCode(String value) {
        this.newPostCode = value;
    }

    /**
     * Gets the value of the newCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCity() {
        return newCity;
    }

    /**
     * Sets the value of the newCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCity(String value) {
        this.newCity = value;
    }

    /**
     * Gets the value of the newCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCtry() {
        return newCtry;
    }

    /**
     * Sets the value of the newCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCtry(String value) {
        this.newCtry = value;
    }

    /**
     * Gets the value of the newIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIp() {
        return newIp;
    }

    /**
     * Sets the value of the newIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIp(String value) {
        this.newIp = value;
    }

    /**
     * Gets the value of the newPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }

    /**
     * Sets the value of the newPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPhoneNumber(String value) {
        this.newPhoneNumber = value;
    }

    /**
     * Gets the value of the newMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMobileNumber() {
        return newMobileNumber;
    }

    /**
     * Sets the value of the newMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMobileNumber(String value) {
        this.newMobileNumber = value;
    }

    /**
     * Gets the value of the newBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBirthDate() {
        return newBirthDate;
    }

    /**
     * Sets the value of the newBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBirthDate(String value) {
        this.newBirthDate = value;
    }

    /**
     * Gets the value of the newIsCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIsCompany() {
        return newIsCompany;
    }

    /**
     * Sets the value of the newIsCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIsCompany(String value) {
        this.newIsCompany = value;
    }

    /**
     * Gets the value of the newCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCompanyName() {
        return newCompanyName;
    }

    /**
     * Sets the value of the newCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCompanyName(String value) {
        this.newCompanyName = value;
    }

    /**
     * Gets the value of the newCompanyWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCompanyWebsite() {
        return newCompanyWebsite;
    }

    /**
     * Sets the value of the newCompanyWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCompanyWebsite(String value) {
        this.newCompanyWebsite = value;
    }

    /**
     * Gets the value of the newCompanyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCompanyDescription() {
        return newCompanyDescription;
    }

    /**
     * Sets the value of the newCompanyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCompanyDescription(String value) {
        this.newCompanyDescription = value;
    }

    /**
     * Gets the value of the newIsDebtor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIsDebtor() {
        return newIsDebtor;
    }

    /**
     * Sets the value of the newIsDebtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIsDebtor(String value) {
        this.newIsDebtor = value;
    }

    /**
     * Gets the value of the newNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewNationality() {
        return newNationality;
    }

    /**
     * Sets the value of the newNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewNationality(String value) {
        this.newNationality = value;
    }

    /**
     * Gets the value of the newBirthcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBirthcity() {
        return newBirthcity;
    }

    /**
     * Sets the value of the newBirthcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBirthcity(String value) {
        this.newBirthcity = value;
    }

    /**
     * Gets the value of the newBirthcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBirthcountry() {
        return newBirthcountry;
    }

    /**
     * Sets the value of the newBirthcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBirthcountry(String value) {
        this.newBirthcountry = value;
    }

    /**
     * Gets the value of the newCompanyIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCompanyIdentificationNumber() {
        return newCompanyIdentificationNumber;
    }

    /**
     * Sets the value of the newCompanyIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCompanyIdentificationNumber(String value) {
        this.newCompanyIdentificationNumber = value;
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
