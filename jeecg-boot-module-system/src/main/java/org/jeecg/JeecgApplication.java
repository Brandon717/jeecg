package org.jeecg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Slf4j
//@EnableSwagger2
//@SpringBootApplication
//public class JeecgApplication {
//
//    public static void main(String[] args) throws UnknownHostException {
//        //System.setProperty("spring.devtools.restart.enabled", "true");
//
//        ConfigurableApplicationContext application = SpringApplication.run(JeecgApplication.class, args);
//        Environment env = application.getEnvironment();
//        String ip = InetAddress.getLocalHost().getHostAddress();
//        String port = env.getProperty("server.port");
//        String path = env.getProperty("server.servlet.context-path");
//        log.info("\n----------------------------------------------------------\n\t" +
//                "Application Jeecg-Boot is running! Access URLs:\n\t" +
//                "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
//                "External: \thttp://" + ip + ":" + port + path + "/\n\t" +
//                "swagger-ui: \thttp://" + ip + ":" + port + path + "/swagger-ui.html\n\t" +
//                "Doc: \t\thttp://" + ip + ":" + port + path + "/doc.html\n" +
//                "----------------------------------------------------------");
//
//    }
//
//    /**
//     * tomcat-embed-jasper引用后提示jar找不到的问题
//     */
//    @Bean
//    public TomcatServletWebServerFactory tomcatFactory() {
//        return new TomcatServletWebServerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                ((StandardJarScanner) context.getJarScanner()).setScanManifest(false);
//            }
//        };
//    }
//}
@SpringBootApplication
@EnableSwagger2
public class JeecgApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JeecgApplication.class);
    }


    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "true");
        SpringApplication.run(JeecgApplication.class, args);
    }
}