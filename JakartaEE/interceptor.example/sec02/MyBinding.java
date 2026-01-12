package JakartaEE.interceptor.example.sec02;

import jakarta.interceptor.InterceptorBinding;
import static java.lang.annotation.ElementType.*;

@InterceptorBinding
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface MyBinding {

}
