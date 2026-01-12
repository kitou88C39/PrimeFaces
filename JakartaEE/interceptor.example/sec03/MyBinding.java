package JakartaEE.interceptor.example.sec03;

import jakarta.interceptor.InterceptorBinding;
import static java.lang.annotation.ElementType.*;

@InterceptorBinding
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface MyBinding {

}
