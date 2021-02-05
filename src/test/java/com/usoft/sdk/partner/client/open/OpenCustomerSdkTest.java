package com.usoft.sdk.partner.client.open;

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
    private OpenCustomerSdk openEntSdk = new OpenCustomerSdk("https://ssorest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

//    @Test
//    public void getEntSignet() throws Exception {
//        GetEntSignetReq.Builder req = GetEntSignetReq.newBuilder();
//        req.setEnuu(10050624);
//        GetEntSignetResp resp = openEntSdk.getEntSignet(req);
//        System.out.println(ProtoBufUtil.toJSON(resp));
//    }
//
//    @Test
//    public void updateEntSignet() throws Exception {
//        UpdateEntSignetReq.Builder req = UpdateEntSignetReq.newBuilder();
//        //企业ENUU号
//        req.setEnuu(10050624);
//        //公章文件
//        AttachFile.Builder builder = AttachFile.newBuilder();
//        // 文件编号
////		builder.setCode("12210104974310428258");
//        // 文件名称
//        builder.setName("1.png");
//        // 文件地址
//        builder.setUrl("https://static.uuzcc.cn/appsso/12210104974125509055.png");
//        // 文件大小
//        builder.setSize(241571);
//        req.setCommonFile(builder);
//        UpdateEntSignetResp resp = openEntSdk.updateEntSignet(req);
//        System.out.println(ProtoBufUtil.toJSON(resp));
//    }
}
