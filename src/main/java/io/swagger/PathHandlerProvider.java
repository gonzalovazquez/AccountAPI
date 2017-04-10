package io.swagger;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;
import com.networknt.info.ServerInfoGetHandler;
import io.swagger.handler.*;

public class PathHandlerProvider implements HandlerProvider {
    @Override
    public HttpHandler getHandler() {
        return Handlers.routing()
            .add(Methods.GET, "/gonzalovazquez/Account/1.0.0/accounts/{id}", new AccountsIdGetHandler())
            .add(Methods.GET, "/gonzalovazquez/Account/1.0.0/server/info", new ServerInfoGetHandler())
        ;
    }
}

