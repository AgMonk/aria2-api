package com.github.gin.utils.request;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/10 14:34
 **/
public class LoggingInterceptor implements Interceptor {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final String TAG = "LoggingInterceptor";

    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long startTime = System.nanoTime();
        System.out.printf("%s [DEBUG]发送请求 %s on %s\n",
                DATE_TIME_FORMATTER.format(ZonedDateTime.now()),
                request.url(),
                chain.connection()
        );
//        System.out.println(request.headers());
        Response response = chain.proceed(request);

        long endTime = System.nanoTime();
        System.out.printf("%s [DEBUG]收到响应 code:%d %s in %.1fms \n",
                DATE_TIME_FORMATTER.format(ZonedDateTime.now()),
                response.code(),
                response.request().url(),
                (endTime - startTime) / 1e6d);

        return response;
    }
}
