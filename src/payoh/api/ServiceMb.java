
package payoh.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Service_mb", targetNamespace = "Service_mb", wsdlLocation = "https://ws.lemonway.fr/mb/wiseed/dev/directkit/service.asmx?wsdl")
public class ServiceMb
    extends Service
{

    private final static URL SERVICEMB_WSDL_LOCATION;
    private final static WebServiceException SERVICEMB_EXCEPTION;
    private final static QName SERVICEMB_QNAME = new QName("Service_mb", "Service_mb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ws.lemonway.fr/mb/wiseed/dev/directkit/service.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEMB_WSDL_LOCATION = url;
        SERVICEMB_EXCEPTION = e;
    }

    public ServiceMb() {
        super(__getWsdlLocation(), SERVICEMB_QNAME);
    }

    public ServiceMb(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEMB_QNAME, features);
    }

    public ServiceMb(URL wsdlLocation) {
        super(wsdlLocation, SERVICEMB_QNAME);
    }

    public ServiceMb(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEMB_QNAME, features);
    }

    public ServiceMb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceMb(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceMbSoap
     */
    @WebEndpoint(name = "Service_mbSoap")
    public ServiceMbSoap getServiceMbSoap() {
        return super.getPort(new QName("Service_mb", "Service_mbSoap"), ServiceMbSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceMbSoap
     */
    @WebEndpoint(name = "Service_mbSoap")
    public ServiceMbSoap getServiceMbSoap(WebServiceFeature... features) {
        return super.getPort(new QName("Service_mb", "Service_mbSoap"), ServiceMbSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEMB_EXCEPTION!= null) {
            throw SERVICEMB_EXCEPTION;
        }
        return SERVICEMB_WSDL_LOCATION;
    }

}
