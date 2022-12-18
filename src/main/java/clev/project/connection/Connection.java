package clev.project.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Connection {
    private String url;
    private String username;
    private String password;
    private String dialect;
    private String driver;
    public Session Connect() throws IOException {
        Properties props = new Properties();
        try(InputStream in = Files.newInputStream(Paths.get("src\\main\\resources\\application.properties"))){
            props.load(in);
        }
        url = props.getProperty("url");
        username = props.getProperty("username");
        password = props.getProperty("password");
        dialect = props.getProperty("dialect");
        driver = props.getProperty("driver");


        StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
        serviceRegistryBuilder
                .applySetting("hibernate.connection.driver_class",driver)
                .applySetting("hibernate.connection.url",url)
                .applySetting("hibernate.connection.username",username)
                .applySetting("hibernate.connection.password",password)
                .applySetting("hibernate.dialect",dialect);
        ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        metadataSources.addAnnotatedClass(clev.project.models.Discount.class).addAnnotatedClass(clev.project.models.Product.class);
        MetadataBuilder metadataBuilder = metadataSources.getMetadataBuilder();
        Metadata metadata = metadataBuilder.build();
        SessionFactory sessionFactory = metadata.buildSessionFactory();
        return sessionFactory.openSession();
    }
}
