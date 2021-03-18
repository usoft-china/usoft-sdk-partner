package com.usoft.sdk.partner.client.open;

import com.usoft.partner.external.open.api.protobuf.*;
import com.usoft.sdk.partner.utils.ProtoBufUtil;
import org.junit.Test;

/**
 * 企业sdk测试类
 *
 * @author uas
 * @date 2020/6/19 16:26
 */
public class OpenPartnerSdkTest {
    /**
     * 测试地址
     */
    private OpenPartnerSdk openPartnerSdk = new OpenPartnerSdk("https://partnerrest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

    @Test
    public void getPartnerListByMobile() throws Exception {
        GetPartnerListByMobileReq.Builder req = GetPartnerListByMobileReq.newBuilder();
        req.setMobile("13686489131");
        GetPartnerListByMobileResp resp = openPartnerSdk.getPartnerListByMobile(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

}
