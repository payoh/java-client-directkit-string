
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
 *         &lt;element name="clientMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyWebsite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDebtor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthcountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerOrBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOneTimeCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "clientMail",
    "clientTitle",
    "clientFirstName",
    "clientLastName",
    "phoneNumber",
    "mobileNumber",
    "street",
    "postCode",
    "city",
    "ctry",
    "birthdate",
    "isCompany",
    "companyName",
    "companyWebsite",
    "companyDescription",
    "isDebtor",
    "nationality",
    "birthcity",
    "birthcountry",
    "companyIdentificationNumber",
    "payerOrBeneficiary",
    "isOneTimeCustomer",
    "wlLogin",
    "wlPass",
    "language",
    "version",
    "walletIp",
    "walletUa"
})
@XmlRootElement(name = "RegisterWallet")
public class RegisterWallet {

    protected String wallet;
    protected String clientMail;
    protected String clientTitle;
    protected String clientFirstName;
    protected String clientLastName;
    protected String phoneNumber;
    protected String mobileNumber;
    protected String street;
    protected String postCode;
    protected String city;
    protected String ctry;
    protected String birthdate;
    protected String isCompany;
    protected String companyName;
    protected String companyWebsite;
    protected String companyDescription;
    protected String isDebtor;
    protected String nationality;
    protected String birthcity;
    protected String birthcountry;
    protected String companyIdentificationNumber;
    protected String payerOrBeneficiary;
    protected String isOneTimeCustomer;
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
     * Gets the value of the clientMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientMail() {
        return clientMail;
    }

    /**
     * Sets the value of the clientMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientMail(String value) {
        this.clientMail = value;
    }

    /**
     * Gets the value of the clientTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTitle() {
        return clientTitle;
    }

    /**
     * Sets the value of the clientTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTitle(String value) {
        this.clientTitle = value;
    }

    /**
     * Gets the value of the clientFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFirstName() {
        return clientFirstName;
    }

    /**
     * Sets the value of the clientFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFirstName(String value) {
        this.clientFirstName = value;
    }

    /**
     * Gets the value of the clientLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLastName() {
        return clientLastName;
    }

    /**
     * Sets the value of the clientLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLastName(String value) {
        this.clientLastName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the isCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCompany() {
        return isCompany;
    }

    /**
     * Sets the value of the isCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCompany(String value) {
        this.isCompany = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWebsite() {
        return companyWebsite;
    }

    /**
     * Sets the value of the companyWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWebsite(String value) {
        this.companyWebsite = value;
    }

    /**
     * Gets the value of the companyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Sets the value of the companyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyDescription(String value) {
        this.companyDescription = value;
    }

    /**
     * Gets the value of the isDebtor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDebtor() {
        return isDebtor;
    }

    /**
     * Sets the value of the isDebtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDebtor(String value) {
        this.isDebtor = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the birthcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthcity() {
        return birthcity;
    }

    /**
     * Sets the value of the birthcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthcity(String value) {
        this.birthcity = value;
    }

    /**
     * Gets the value of the birthcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthcountry() {
        return birthcountry;
    }

    /**
     * Sets the value of the birthcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthcountry(String value) {
        this.birthcountry = value;
    }

    /**
     * Gets the value of the companyIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIdentificationNumber() {
        return companyIdentificationNumber;
    }

    /**
     * Sets the value of the companyIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIdentificationNumber(String value) {
        this.companyIdentificationNumber = value;
    }

    /**
     * Gets the value of the payerOrBeneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerOrBeneficiary() {
        return payerOrBeneficiary;
    }

    /**
     * Sets the value of the payerOrBeneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerOrBeneficiary(String value) {
        this.payerOrBeneficiary = value;
    }

    /**
     * Gets the value of the isOneTimeCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOneTimeCustomer() {
        return isOneTimeCustomer;
    }

    /**
     * Sets the value of the isOneTimeCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOneTimeCustomer(String value) {
        this.isOneTimeCustomer = value;
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
