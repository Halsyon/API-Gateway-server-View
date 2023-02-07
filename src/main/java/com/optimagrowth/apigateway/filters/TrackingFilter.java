package com.optimagrowth.apigateway.filters;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/*
 *  Создание предварительного фильтра
 *  будет проверять все входящие запросы и определять присутствие в них HTTP-заголовка tmx-correlation-id
 * tmx-correlation-id- содержит GUID глобальный универсальный идентификатор
 *
 */
@Data
@Order(1)
@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TrackingFilter implements GlobalFilter {

    @Autowired
    FilterUtils filterUtils;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return null;
    }
}