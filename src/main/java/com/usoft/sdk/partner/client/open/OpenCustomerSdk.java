package com.usoft.sdk.partner.client.open;

import com.usoft.sdk.partner.client.BaseSdk;
import com.usoft.sdk.partner.utils.HttpUtil;
import com.usoft.sdk.partner.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.*;

import java.util.Map;

/**
 * 企业sdk
 * @author uas
 * @date 2020/8/11 15:59
 */
public class OpenCustomerSdk extends BaseSdk {

    public OpenCustomerSdk(String baseUrl, String secretKey) {
        super(baseUrl, secretKey);
    }

    public OpenCustomerSdk(String baseUrl, String secretKey, int timeout) {
        super(baseUrl, secretKey, timeout);
    }
//
//    /**
//     * 获取企业印章
//     *
//     * @param req
//     * @return
//     */
//    public GetEntSignetResp getEntSignet(GetEntSignetReq.Builder req) throws Exception {
//        String url = baseUrl + "/openapi/enterprise/signet/get";
//        Map<String, String> params = genSignToMap(req);
//        String respJson = HttpUtil.doGet(url, params, timeout);
//        GetEntSignetResp.Builder resp = ProtoBufUtil.toProtoBuf(GetEntSignetResp.newBuilder(), respJson);
//        return resp.build();
//    }
//
//    /**
//     * 更新企业印章
//     *
//     * @param req
//     * @return
//     */
//    public UpdateEntSignetResp updateEntSignet(UpdateEntSignetReq.Builder req) throws Exception {
//        String url = baseUrl + "/openapi/enterprise/signet/update";
//        String paramJson = genSignToJson(req);
//        String respJson = HttpUtil.doPost(url, paramJson, timeout);
//        UpdateEntSignetResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateEntSignetResp.newBuilder(), respJson);
//        return resp.build();
//    }
}
