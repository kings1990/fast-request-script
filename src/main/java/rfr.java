import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;

import java.util.LinkedHashMap;

/**
 * Contains all variables and methods used in the plugin
 * Don't use new rfr()
 */
public class rfr {
    private rfr(){
        
    }

    /**
     * current http request object
     * @see  cn.hutool.http.HttpRequest
     */
    private static HttpRequest request;

    /**
     * current http response object
     * @see  cn.hutool.http.HttpResponse
     */
    private static HttpResponse response;

    /**
     * Return current domain, for example: <a href="http://localhost:8080">http://localhost:8080</a>
     */
    private static String currentDomain;
    
    /**
     * Return current env name, for example: dev, test, prod
     */
    private static String currentEnvName;

    /**
     * Return current module name, for example, fast-request-sample
     */
    private static String currentModuleName;

    /**
     * Return current project name, for example, fast-request
     */
    private static String currentProjectName;

    /**
     * Contains all environment variables for current project
     * How-to:
     * 1. Add or modify a value: rfr.environment.put("key","some value")
     * 2. Delete a value: rfr.environment.remove("key")
     * 3. Get a value: rfr.environment.get("key")
     * 
     * @see <a href="https://api-buddy.com/en/guide/features/environment.html">https://api-buddy.com/en/guide/features/environment.html</a>
     * @see <a href="https://api-buddy.cn/guide/features/environment.html">https://api-buddy.cn/guide/features/environment.html</a>
     */
    private static LinkedHashMap<String,String> environment;

    /**
     * Contains all project-level headers
     * Use rfr.projectHeader.put("key","some value") to set project-level header
     * How-to:
     * 1. Add or modify a value: rfr.projectHeader.put("key","some value") 
     * 2. Delete a value: rfr.projectHeader.remove("key")
     * 3. Get a value: rfr.projectHeader.get("key")
     */
    private static LinkedHashMap<String,String> projectHeader;

    /**
     * Contains all api-level headers for the current api
     * How-to:
     * 1. Add or modify a value: rfr.apiHeader.put("key","some value") 
     * 2. Delete a value: rfr.apiHeader.remove("key")
     * 3. Get a value: rfr.apiHeader.get("key")
     */
    private static LinkedHashMap<String,String> apiHeader;
}
