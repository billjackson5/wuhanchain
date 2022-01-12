package service;

import com.alibaba.fastjson.JSONObject;
import com.reddate.ddc.DDCSdkClient;
import com.reddate.ddc.dto.ddc.Account;
import com.reddate.ddc.listener.SignEventListener;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;


/**
 * @author wxq
 * @create 2021/12/25 15:49
 * @description accountTest
 */
@Slf4j
public class AccountTest {

    SignEventListener signEventListener = event -> null;
    DDCSdkClient  ddcSdkClient = new DDCSdkClient().instance("src/main/resources/contractConfig.json", signEventListener);

    @Test
    public void createAccount() {
        Account account = ddcSdkClient.accountService.createAccount();
        log.info(JSONObject.toJSONString(account));
    }

}
