package cn.ken.student.rubcourse.dto;

import cn.ken.student.rubcourse.common.entity.Page;
import lombok.Data;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/16 21:28
 */
@Data
public class StudentReq extends Page {
    
    Integer id;
    
    Integer gender;
    
    Integer status;
    
}
