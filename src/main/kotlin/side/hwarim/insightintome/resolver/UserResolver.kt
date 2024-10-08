package side.hwarim.insightintome.resolver

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class UserResolver
@QueryMapping
fun hello(): String {
    return "hello";
}
