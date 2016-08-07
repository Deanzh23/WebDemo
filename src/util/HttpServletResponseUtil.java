package util;

import javax.servlet.http.HttpServletResponse;

/**
 * 请求应答工具类
 * <p>
 * Created by Dean on 16/8/7.
 */
public class HttpServletResponseUtil {

    /**
     * 设置请求应答配置
     *
     * @param httpServletResponse
     */
    public static void setConfig(HttpServletResponse httpServletResponse) {
        // 设置编码集
        httpServletResponse.setCharacterEncoding("utf-8");
    }

}
