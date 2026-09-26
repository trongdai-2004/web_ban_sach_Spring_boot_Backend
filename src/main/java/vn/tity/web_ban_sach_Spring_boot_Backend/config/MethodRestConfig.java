package vn.tity.web_ban_sach_Spring_boot_Backend.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import vn.tity.web_ban_sach_Spring_boot_Backend.entity.Category;
import vn.tity.web_ban_sach_Spring_boot_Backend.entity.User;

@Configuration
public class MethodRestConfig implements RepositoryRestConfigurer {

    private String url = "http://localhost:8080";
    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] disableMethod = {
                HttpMethod.POST,
                HttpMethod.PUT,
                HttpMethod.PATCH,
                HttpMethod.DELETE,
        };

//        config.exposeIdsFor(Category.class);

//        config.exposeIdsFor(
//                entityManager
//                        .getMetamodel()
//                        .getEntities()
//                        .stream()
//                        .map(Type::getJavaType)
//                        .toArray(Class[]::new)
//        );

//        disableHttpMethod(Category.class,config, disableMethod);
//
//        HttpMethod[] deleteMethod = {
//                HttpMethod.DELETE,
//        };
//        disableHttpMethod(User.class,config, deleteMethod);

    }

    private void   disableHttpMethod( Class c ,
                                  RepositoryRestConfiguration config,
                                  HttpMethod[] methods
                                ) {
        config.getExposureConfiguration()
                .forDomainType(c)
                .withItemExposure((metdata, httpMethods) ->  httpMethods.disable(methods))
                .withCollectionExposure((metdata, httpMethods) ->  httpMethods.disable(methods));

    }
}
