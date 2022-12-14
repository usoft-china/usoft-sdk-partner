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

    @Test
    public void logoutCustomer() throws Exception {
        LogoutCustomerReq.Builder req = LogoutCustomerReq.newBuilder();
        //enuu
        req.setEnuu(10047536);
        //系统类型（trade-app：SAAS贸易版  make-app：SAAS制造版）
        req.setCategory("trade-app");

        LogoutCustomerResp resp = openCustomerSdk.logoutCustomer(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateCustomerCategory() throws Exception {
        UpdateCustomerCategoryReq.Builder req = UpdateCustomerCategoryReq.newBuilder();
        //enuu
        req.setEnuu(10050985);
        //原系统类型（trade-app：SAAS贸易版  make-app：SAAS制造版）
        req.setCategory("make-app");
        //新的系统类型（trade-app：SAAS贸易版  make-app：SAAS制造版）
        req.setNewCategory("trade-app");

        UpdateCustomerCategoryResp resp = openCustomerSdk.updateCustomerCategory(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
