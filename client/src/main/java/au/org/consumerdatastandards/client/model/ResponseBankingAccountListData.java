/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.List;
import java.util.Objects;

public class ResponseBankingAccountListData {

    private List<BankingAccount> accounts;

    /**
     * The list of accounts returned. If the filter results in an empty set then this array may have no records
     * @return accounts
     */
    public List<BankingAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankingAccount> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBankingAccountListData responseBankingAccountListData = (ResponseBankingAccountListData) o;
        return Objects.equals(this.accounts, responseBankingAccountListData.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accounts);
    }

    @Override
    public String toString() {
        return "class ResponseBankingAccountListData {\n" +
            "   accounts: " + toIndentedString(accounts) + "\n" + 
            "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}