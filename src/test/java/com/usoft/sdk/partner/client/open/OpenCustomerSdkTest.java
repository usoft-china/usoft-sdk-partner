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
public class OpenCustomerSdkTest {
    /**
     * 测试地址
     */
    private OpenCustomerSdk openCustomerSdk = new OpenCustomerSdk("https://partnerrest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");
//    /**
//     * 正式地址
//     */
//    private OpenCustomerSdk openCustomerSdk = new OpenCustomerSdk("https://partnerrest.usoftchina.com", "6Td4fgkYuFSTRkjhI1PZnQfhGMJ19mPRmRml7DX+4LE=");

    @Test
    public void getCustomerOpenStatus() throws Exception {
        GetCustomerOpenStatusReq.Builder req = GetCustomerOpenStatusReq.newBuilder();
        req.setEnuu(50000103);
        req.setCategory("trade-app");
        GetCustomerOpenStatusResp resp = openCustomerSdk.getCustomerOpenStatus(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getCustomerDetail() throws Exception {
        GetCustomerDetailReq.Builder req = GetCustomerDetailReq.newBuilder();
        req.setEnuu(50000103);
        req.setCategory("trade-app");
        GetCustomerDetailResp resp = openCustomerSdk.getCustomerDetail(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void openCustomer() throws Exception {
        OpenCustomerReq.Builder req = OpenCustomerReq.newBuilder();
        req.setEnuu(50000092);
        req.setUu(200040391);
        req.setCategory("trade-app");
        req.setOpenTime("2021-02-05 15:35:30");
        req.setInviteCode("DD6666");
        OpenCustomerResp resp = openCustomerSdk.openCustomer(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
