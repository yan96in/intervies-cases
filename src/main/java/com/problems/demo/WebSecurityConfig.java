package com.problems.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
    public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //FIXME
    //@Value("${spring.profiles}")
    private String env;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

		/*if("dev".equals(env)){ //如果需要在开发服中免登录
			http.authorizeRequests().antMatchers("*//**","*//**//*filters").permitAll();
			http.csrf().disable();
			http.httpBasic();
			return;
		}*/
        http.headers().frameOptions().disable();
        http
                .formLogin()
               // .loginPage("/login.html").loginProcessingUrl("/login").permitAll()
                .defaultSuccessUrl("/index.html")
                 //.defaultSuccessUrl("/") // not worked,why?
                .failureUrl("/error.html")

                .and()
                .logout().logoutUrl("/logout")
                .and()
                .authorizeRequests()
              //  .antMatchers("/login.html", "/**/*.css", "/img/**", "/api/**") //放开"/api/**"：为了给被监控端免登录注册
               // .permitAll()
                .and()
                .authorizeRequests().antMatchers("/**").authenticated();
        http.csrf();
        http.httpBasic();
    }
}
