package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("ru", "RU"));
        // new Locale("ru", "RU") создает новый объект Locale для России с языковым кодом "ru" и кодом страны "RU".
        return localeResolver;
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource =
                new ResourceBundleMessageSource();
        messageSource.setUseCodeAsDefaultMessage(true);messageSource.setBasenames("messages");
        return messageSource;
    }
}



/**
 * ###
 *
 * 'localeResolver' создает новый объект SessionLocaleResolver,
 * который является реализацией интерфейса LocaleResolver.
 * Это означает, что мы можем использовать этот объект для управления локалью в нашем приложении.
 *
 * Далее, метод setDefaultLocale() устанавливает значение локали по умолчанию в Locale.RU.
 * Locale.RU представляет собой локаль для России,
 * которая используется для форматирования чисел, дат, времени и т.д.
 *
 * Таким образом, при использовании SessionLocaleResolver в приложении,
 * если пользователь не выбрал определенную локаль,
 * то будет использоваться локаль по умолчанию, которую мы установили как Locale.RU.
 *
 *
 * ###
 *
 *
 * 'messageSource' создает ResourceBundleMessageSource,
 * который используется для загрузки сообщений из файлов свойств (.properties).
 *
 * Метод setUseCodeAsDefaultMessage(true) говорит Spring использовать код сообщения
 * в качестве значения по умолчанию, если файл свойств не найден для данного ключа.
 *
 * Метод setBasenames("messages") указывает Spring на поиск файла messages.properties для загрузки сообщений.
 * Файл свойств должен располагаться в корневом каталоге классов, доступных для загрузки.
 *
 * Когда Spring загружает ResourceBundleMessageSource,
 * он использует его для поиска сообщений в указанном файле свойств.
 * Ключи сообщений используются в коде приложения, а их значения хранятся в файле свойств.
 */



