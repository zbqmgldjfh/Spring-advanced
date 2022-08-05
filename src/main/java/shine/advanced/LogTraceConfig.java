package shine.advanced;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import shine.advanced.trace.logtrace.LogTrace;
import shine.advanced.trace.logtrace.ThreadLocalLogTrace;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
