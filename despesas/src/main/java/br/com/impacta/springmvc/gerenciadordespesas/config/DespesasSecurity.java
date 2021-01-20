package br.com.impacta.springmvc.gerenciadordespesas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class DespesasSecurity extends WebSecurityConfigurerAdapter {

    private PasswordEncoder encoder;

    @Autowired
    public void setEncoder(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    private static final String MASTER = "MASTER";
    private static final String CONVIDADO = "CONVIDADO";

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/api/**").permitAll()
                .antMatchers("/categorias/**").permitAll()
                .antMatchers("/despesas/form").hasRole(MASTER)
                .antMatchers("/despesas/**").hasAnyRole(MASTER, CONVIDADO)
                .and().formLogin()
                .and().logout().logoutSuccessUrl("/despesas");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Chris Redfield").password(encoder.encode("chris123")).roles(MASTER).and()
                .withUser("Jill Valentine").password(encoder.encode("jill123")).roles(MASTER).and()
                .withUser("Rebecca Chambers").password(encoder.encode("rebecca123")).roles(CONVIDADO);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
