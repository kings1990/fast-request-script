import cn.hutool.http.HttpConfig;
import cn.hutool.http.HttpConnection;
import cn.hutool.http.HttpResponse;

import java.nio.charset.Charset;

public class response extends HttpResponse {
    
    private response(HttpConnection httpConnection, HttpConfig config, Charset charset, boolean isAsync, boolean isIgnoreBody) {
        super(httpConnection, config, charset, isAsync, isIgnoreBody);
    }
}
