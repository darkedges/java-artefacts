package au.org.consumerdatastandards.api.v1_1_1.banking.models;

import au.org.consumerdatastandards.api.v1_1_1.common.models.BaseResponse;
import au.org.consumerdatastandards.support.data.*;

@DataDefinition
public class ResponseBankingAccountsBalanceById extends BaseResponse {

    @Property(
        required = true
    )
    BankingBalance data;
}
