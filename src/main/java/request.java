import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.http.HttpRequest;

/**
 * current http request object
 * Use rfr.request
 */
@Deprecated
public class request extends HttpRequest {
    public request(){
        super(UrlBuilder.of());
    }
}
