package pl.matusiewicz.jdbc_car;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import java.sql.SQLException;

@Configuration
@ConfigurationProperties("oracle")
public class Config {

    @Bean
    DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser("wap03");
        dataSource.setPassword("wap43e");
        dataSource.setDriverType("oracle.jdbc.OracleDriver");
        dataSource.setURL("jdbc:oracle:thin:@kti-lab1.ue.poznan.pl:1521/venusdb.ue.poznan");
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }

    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String url;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }


//    public JdbcTemplate getJdbcTemplate () throws SQLException {
//            return new JdbcTemplate(dataSource());
//        }
//
//
//
//        @EventListener(ApplicationReadyEvent.class)
//
//        public void dbInit () throws SQLException {
//        String sql = "CREATE TABLE Cars(car_id int, mark varchar(255), model varchar(255), color varchar(255));";
//        getJdbcTemplate().update(sql);
//
//
//            }
        }

