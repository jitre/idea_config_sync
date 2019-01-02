#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.xquark.restapi.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: ${USER}
 * Date: ${DATE}.
 * Time: ${TIME}
 * ${DESCRIPTION}
 */
@RestController
@RequestMapping("${URL}")
@Validated
public class ${OBJ}Controller extends BaseController<${OBJ},${OBJ}Service> {

    private ${OBJ}Service service;

    @Autowired
    public void set${OBJ}Service(${OBJ}Service service) {
        this.service= service;
    }

    @Override
    protected ${OBJ}Service getService() {
        return service;
    }

}