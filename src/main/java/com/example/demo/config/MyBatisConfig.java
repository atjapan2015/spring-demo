package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan(basePackages = "com.example.demo.mapper")
public class MyBatisConfig {

	@Autowired
	DataSourceProperties dataSourceProperties;

	@Bean(destroyMethod = "close")
	@Primary
	DataSource mysqlDataSource() throws Exception {

		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(this.dataSourceProperties.getDriverClassName());
		ds.setJdbcUrl(this.dataSourceProperties.getUrl());
		ds.setUsername(this.dataSourceProperties.getUsername());
		ds.setPassword(this.dataSourceProperties.getPassword());
		ds.setConnectionTestQuery("SELECT 1 FROM DUAL");
		return ds;
	}

	@Bean
	public SqlSessionFactory getSqlSessionFactory(DataSource ds) throws Exception {

		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		// factoryBean.setDataSource(new Log4jdbcProxyDataSource(ds));
		factoryBean.setDataSource(ds);
		factoryBean.setTypeAliasesPackage("com.example.demo.entity");
		factoryBean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:com/example/demo/mapper/*.xml"));

		return factoryBean.getObject();
	}
}
