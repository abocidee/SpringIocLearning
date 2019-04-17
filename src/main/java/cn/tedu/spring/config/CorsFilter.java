package cn.tedu.spring.config;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.util.StringUtils;

import java.io.IOException;

/**
 * 跨域过滤器
 * @author jitwxs
 * @since 2018/10/16 20:53
 */
public class CorsFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		 HttpServletResponse responses = (HttpServletResponse) response;
	        HttpServletRequest requests = (HttpServletRequest) request;

	        // 不使用*，自动适配跨域域名，避免携带Cookie时失效
	        String origin = requests.getHeader("Origin");
	        if(!StringUtils.isNullOrEmpty(origin)) {
	            responses.setHeader("Access-Control-Allow-Origin", origin);
	        }

	        // 自适应所有自定义头
	        String headers = requests.getHeader("Access-Control-Request-Headers");
	        if(StringUtils.isNullOrEmpty(headers)) {
	            responses.setHeader("Access-Control-Allow-Headers", headers);
	            responses.setHeader("Access-Control-Expose-Headers", headers);
	        }

	        // 允许跨域的请求方法类型
	        responses.setHeader("Access-Control-Allow-Methods", "*");
	        // 预检命令（OPTIONS）缓存时间，单位：秒
	        responses.setHeader("Access-Control-Max-Age", "3600");
	        // 明确许可客户端发送Cookie，不允许删除字段即可
	        responses.setHeader("Access-Control-Allow-Credentials", "true");
	        
	        chain.doFilter(request, response);
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

    /*
    注册过滤器：
    @Bean
    public FilterRegistrationBean registerFilter() {
        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>();
        bean.addUrlPatterns("/*");
        bean.setFilter(new CorsFilter());
        // 过滤顺序，从小到大依次过滤
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);

        return bean;
    }
     */
}
