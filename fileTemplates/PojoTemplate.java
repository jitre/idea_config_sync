#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import com.xquark.dal.Archivable;
import com.xquark.dal.BaseEntityImpl;
/**
 * User: ${USER}
 * Date: ${DATE}.
 * Time: ${TIME}
 * ${DESCRIPTION}
 */
public class ${OBJ} extends BaseEntityImpl implements Archivable {

    private static final long serialVersionUID = 1L;

    private Boolean archive;
    
    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

} 