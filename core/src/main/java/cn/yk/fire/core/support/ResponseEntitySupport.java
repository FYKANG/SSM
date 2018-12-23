package cn.yk.fire.core.support;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Author: YK
 * Title: ResponseEntitySupport
 * Description: ResponseEntity封装类
 * Date: 2018/12/23
 * Time: 17:25
 */
public class ResponseEntitySupport {

    private static JSONObject responseJson;
    private static JSONObject responseErrorJson;

    static {
        responseJson = new JSONObject();
        responseErrorJson = new JSONObject();
    }

    public static ResponseEntity<Object> success() {
        return obtainResponseEntity(responseJson,HttpStatus.OK);
    }
    public static ResponseEntity<Object> success(String msg, Object reason) {
        responseJson.put("message", msg);
        responseJson.put("reason", reason);
        return obtainResponseEntity(responseJson,HttpStatus.OK);
    }
    public static ResponseEntity<Object> success(Object obj) {
        return obtainResponseEntity(obj,HttpStatus.OK);
    }

    public static ResponseEntity<Object> error(HttpStatus httpStatus, String msg, Object reason) {
        responseErrorJson.put("message", msg);
        responseErrorJson.put("reason", reason);
        responseErrorJson.put("type", httpStatus.getReasonPhrase());
        return obtainResponseEntity(responseErrorJson,httpStatus);
    }

    private static ResponseEntity<Object> obtainResponseEntity(Object response,HttpStatus httpStatus) {
        return new ResponseEntity<>(response, httpStatus);
    }
}
