
package trainings.homeworkExceptions;
public class Url {

    private String protocol;
    private String domainName;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public Url(String protocol, String domainName) {
        this.protocol = protocol;
        this.domainName = domainName;
    }

    @Override
    public String toString() {
        return "Url{" +
                 protocol + domainName +
                '}';
    }
}

