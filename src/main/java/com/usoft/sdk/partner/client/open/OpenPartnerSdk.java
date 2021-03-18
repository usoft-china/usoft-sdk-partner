package com.usoft.sdk.partner.client.open;

import com.usoft.partner.external.open.api.protobuf.*;
import com.usoft.sdk.partner.client.BaseSdk;
import com.usoft.sdk.partner.utils.HttpUtil;
import com.usoft.sdk.partner.utils.ProtoBufUtil;

import java.util.Map;

/**
 * 合伙人sdk
 *
 * @author uas
 * @date 2020/8/11 15:59
 */
public class OpenPartnerSdk extends BaseSdk {

    public OpenPartnerSdk(String baseUrl, String secretKey) {
        super(baseUrl, secretKey);
    }

    public OpenPartnerSdk(String baseUrl, String secretKey, int timeout) {
        super(baseUrl, secretKey, timeout);
    }

    /**
     * 根据手机号获取合伙人列表
     *
     * @param req
     * @return
     */
    public GetPartnerListByMobileResp getPartnerListByMobile(GetPartnerListByMobileReq.Builder req) throws Exception {
        String url = baseUrl + "/open/partner/list/get/by/mobile";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetPartnerListByMobileResp.Builder resp = ProtoBufUtil.toProtoBuf(GetPartnerListByMobileResp.newBuilder(), respJson);
        return resp.build();
    }

}
