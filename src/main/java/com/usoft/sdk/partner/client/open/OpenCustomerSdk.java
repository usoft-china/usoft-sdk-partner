package com.usoft.sdk.partner.client.open;

import com.usoft.partner.external.open.api.protobuf.*;
import com.usoft.sdk.partner.client.BaseSdk;
import com.usoft.sdk.partner.utils.HttpUtil;
import com.usoft.sdk.partner.utils.ProtoBufUtil;

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

    /**
     * 获取客户开通状态
     *
     * @param req
     * @return
     */
    public GetCustomerOpenStatusResp getCustomerOpenStatus(GetCustomerOpenStatusReq.Builder req) throws Exception {
        String url = baseUrl + "/open/customer/open/status";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetCustomerOpenStatusResp.Builder resp = ProtoBufUtil.toProtoBuf(GetCustomerOpenStatusResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 获取客户详情
     *
     * @param req
     * @return
     */
    public GetCustomerDetailResp getCustomerDetail(GetCustomerDetailReq.Builder req) throws Exception {
        String url = baseUrl + "/open/customer/detail/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetCustomerDetailResp.Builder resp = ProtoBufUtil.toProtoBuf(GetCustomerDetailResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 客户开通
     *
     * @param req
     * @return
     */
    public OpenCustomerResp openCustomer(OpenCustomerReq.Builder req) throws Exception {
        String url = baseUrl + "/open/customer/open";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        OpenCustomerResp.Builder resp = ProtoBufUtil.toProtoBuf(OpenCustomerResp.newBuilder(), respJson);
        return resp.build();
    }
}
