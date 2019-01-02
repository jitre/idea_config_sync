#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import com.xquark.service.base.impl.TemplateBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * User: ${USER}
 * Date: ${DATE}.
 * Time: ${TIME}
 * ${DESCRIPTION}
 */
@Service
@Transactional
@Validated
public class ${OBJ}ServiceImpl  extends TemplateBaseServiceImpl<${OBJ}, ${OBJ}Mapper> implements ${OBJ}Service {

    private ${OBJ}Mapper mapper;

    @Autowired
    public void set${OBJ}Mapper(${OBJ}Mapper mapper) {
        this.mapper =  mapper;
    }

    @Override
    protected ${OBJ}Mapper getMapper() {
        return mapper;
    }

}