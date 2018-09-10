package com.liba.pay.utils;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayUserInfoShareRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayUserInfoShareResponse;

public class MainTest {
	public static void main(String[] args) throws AlipayApiException {
		/*String url="https://openapi.alipay.com/gateway.do";
		Map<String,Object> map2 =new HashMap<>();
		Map<String,Object> map =new HashMap<>();
		
		
		map.put("app_id", "2018042060033290");
		map.put("method", value);
		

		
		HttpURLConnectionUtil http =new HttpURLConnectionUtil();
		String sendPostRequest = http.sendPostRequest(url, map);
		
		System.out.println("返回内容"+sendPostRequest);*/
		
		
		String url="https://openapi.alipay.com/gateway.do";
		String app_id="2018042060033290";
		String private_key="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCguBW15s+X4NwH4zt4hOGXHHO5EZ10SNLW9W06JKyOeadQ+oY1JEZs+hSNtGH501tRBzJZ8mLuCgrB80Yf/VrEX6Vkmv4PHg5Ai8fk6kyQwpzPpwD/ON5avBym5fHBzSRxVGcYcu4iEm/MGwE20QcV9bHbqgMzBLiGseSGzGmPb+R/Y6sKclLLPF0YsQeUyUVtySMVf5DZ27jF+WAEITJ8HQh2vmOglu3JWQSJihWFpVdLciRrUp83VwWVJ3Y+O3IfyfMqE0s8Zpjql7YvbrD394H5UvWmYEYXdqdmLd768196TK+R0XgPuofCAgalyhA0YIgkqxeI4l7t9Bs5OOYjAgMBAAECggEAZG0Cq+owt297LbaQd6tYpyrRKMhYAcxraoRrHxTBejmMEi6o49Xp57iQVUdsnUWzXrtHfCrYJHPD6xNPMzgFmoVFfMrYi6u1LiHp4yGAfEgO4jYxikkHr9yxbpxqZzX/Wo1p6j4OjN3GW9xX8t/ENLWU0HS4kQ2XHBtWd+CM6WH8j++bHPqwUzapZRy9+5x6v6HSXsxzVKnc+VZdhc7fHgGAalnhuuf5QmhnQ23ze9bCKPa9WzGQ23VMpn7ufNReQQhWuPaYxvvGWlxOyiARUjivN3OO48jk3knmjKyEjjIDi2s3Zh8VmdK+9jy5gJZtJGPxxR/jE/hqSaYkgv4/UQKBgQDXHl7KjB5DrhcK7avYXlo88OMG+Um1g9DhcXt+eWyddDsM6zFNpMIpwWLc532M44AzISbaJu+ZXLhpdOKS7gDFUZu+byKoom2A641bHH746oxaIxDnd2WsfoiZSKA9Tg/GOZ2H0U7pNJGJhFxDCUjyYVum4ki0wmYryFRFXr6feQKBgQC/QyYgr2ci5mpDePSMhlEv1VVfKjCHoSbBevEZ2MuLPe2h7SVM0NrSgcPyIoHQ+CZkPL4WnMm4WWvkTKgNt8vucTs6p5cJLTbkiLqkv/zhrbKP8+Wu13eflcY/Vc185nq6K3GK+lnWnCTkwQp05GB5OHQMDkgA95yS9ILIwx+/ewKBgGS4bo+NbXoo39cZEvXar4uLCfEw9UcMsddsh/LerXFHg4J3+HyvIM3mIwDlTk6SEmteIU/RHSwEUr/ln1RGJYw9ups+c87bRkQvhd7cB8NKJm7prjeCGtPZ5uFGNOifTRl1zoFSCg18tIvbsksc5M+/r+cCWiJwRuBHCtX0F3KZAoGBAKT5NZ0BztNirgwO+9luTf8VY3MXgA6tKTHAatChmEg9nYiLdh4BFI540dw8eX8XXH4fitMUYEa8Ev00Rcy3WZcNYkpgnj2TG4MakOtkkqrS2W+jr90VC6DCXuLojruKThfhOynmcbFUs9oAzJUxHCnTUP3JH8B91DdJ4rlq3SqbAoGAB8dEFHwdq00pHD5URPxISIZHiwVVo0VSYKESkHVO/BwrbtBLOO+b32reLgC5vO4gAvOULsqy9g/0h2c/3AiQ6LCGVZASbFmVScie27A0ByVIGJZ6L5NVDGnVKes9XfMNNgvFC01rGl+Xqn3AduwFnnYZj0Gz4grcK2pp6uwY1Aw=";
		String format="json";
		String charset="GBK";
		String alipay_public_key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArqwIwUObA/m5nmMlIF4L4NQ3LwFZmB7XdvPrysq2rRpVT/Qr9z0QuwVbigacPBUTMfYng9jyeFKHmlY46/LA307xwauv/5alVJ71f4a23y5Q149NaQKSLwvXzgNILuvk0PsDtSzq34SjsWpmvfwaxv3bT6ICzYQgvGJ7Gp9HyXpgrbupEvAQtYrfxaWELmxe2NgOk9cnZ+hdsh28gcn6e8PSNGnE/t9N6lNtKseRhChVurySKyxq7ivAi1nQUAh4a246Y1OxORXrTRuW9DasLM+CESZX4ZQSru493T/8Oakrf4hFPtLQZyW+FISl3Q7t7CqwYNeFPKPcvk/K7BtrjwIDAQAB";
		String sign_type="RSA2";
		
		AlipayClient alipayClient = new DefaultAlipayClient(url,app_id,private_key,format,charset,alipay_public_key,sign_type);
		AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
		request.setBizContent("{" +
		"\"timeout_express\":\"90m\"," +
		"\"total_amount\":\"0.01\"," +
		"\"seller_id\":\"2088312834387830\"," +
		"\"product_code\":\"QUICK_MSECURITY_PAY\"," +
		"\"body\":\"Iphone6 16G\"," +
		"\"subject\":\"大乐透\"," +
		"\"out_trade_no\":\"70501111111S001111119\"," +
		"\"time_expire\":\"2016-12-31 10:05\"," +
		"\"goods_type\":\"0\"," +
		"\"promo_params\":\"{\\\"storeIdType\\\":\\\"1\\\"}\"," +
		"\"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
		"\"royalty_info\":{" +
		"\"royalty_type\":\"ROYALTY\"," +
		"        \"royalty_detail_infos\":[{" +
		"          \"serial_no\":1," +
		"\"trans_in_type\":\"userId\"," +
		"\"batch_no\":\"123\"," +
		"\"out_relation_id\":\"20131124001\"," +
		"\"trans_out_type\":\"userId\"," +
		"\"trans_out\":\"2088101126765726\"," +
		"\"trans_in\":\"2088101126708402\"," +
		"\"amount\":0.1," +
		"\"desc\":\"分账测试1\"," +
		"\"amount_percentage\":\"100\"" +
		"          }]" +
		"    }," +
		"\"extend_params\":{" +
		"\"sys_service_provider_id\":\"2088511833207846\"," +
		"\"hb_fq_num\":\"3\"," +
		"\"hb_fq_seller_percent\":\"100\"," +
		"\"industry_reflux_info\":\"{\\\\\\\"scene_code\\\\\\\":\\\\\\\"metro_tradeorder\\\\\\\",\\\\\\\"channel\\\\\\\":\\\\\\\"xxxx\\\\\\\",\\\\\\\"scene_data\\\\\\\":{\\\\\\\"asset_name\\\\\\\":\\\\\\\"ALIPAY\\\\\\\"}}\"," +
		"\"card_type\":\"S0JP0000\"" +
		"    }," +
		"\"sub_merchant\":{" +
		"\"merchant_id\":\"19023454\"," +
		"\"merchant_type\":\"alipay: 支付宝分配的间连商户编号, merchant: 商户端的间连商户编号\"" +
		"    }," +
		"\"enable_pay_channels\":\"pcredit,moneyFund,debitCardExpress\"," +
		"\"store_id\":\"NJ_001\"," +
		"\"specified_channel\":\"pcredit\"," +
		"\"disable_pay_channels\":\"pcredit,moneyFund,debitCardExpress\"," +
		"\"settle_info\":{" +
		"        \"settle_detail_infos\":[{" +
		"          \"trans_in_type\":\"cardSerialNo\"," +
		"\"trans_in\":\"A0001\"," +
		"\"summary_dimension\":\"A0001\"," +
		"\"amount\":0.1" +
		"          }]" +
		"    }," +
		"\"invoice_info\":{" +
		"\"key_info\":{" +
		"\"is_support_invoice\":true," +
		"\"invoice_merchant_name\":\"ABC|003\"," +
		"\"tax_num\":\"1464888883494\"" +
		"      }," +
		"\"details\":\"[{\\\"code\\\":\\\"100294400\\\",\\\"name\\\":\\\"服饰\\\",\\\"num\\\":\\\"2\\\",\\\"sumPrice\\\":\\\"200.00\\\",\\\"taxRate\\\":\\\"6%\\\"}]\"" +
		"    }," +
		"\"ext_user_info\":{" +
		"\"name\":\"李明\"," +
		"\"mobile\":\"16587658765\"," +
		"\"cert_type\":\"IDENTITY_CARD\"," +
		"\"cert_no\":\"362334768769238881\"," +
		"\"min_age\":\"18\"," +
		"\"fix_buyer\":\"F\"," +
		"\"need_check_info\":\"F\"" +
		"    }," +
		"\"business_params\":\"{\\\"data\\\":\\\"123\\\"}\"" +
		"  }");
		AlipayTradeAppPayResponse response = alipayClient.pageExecute(request);
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
		System.out.println("响应信息："+response);
	}
}
