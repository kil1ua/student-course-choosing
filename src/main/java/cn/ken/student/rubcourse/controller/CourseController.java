package cn.ken.student.rubcourse.controller;

import cn.ken.student.rubcourse.common.entity.Result;
import cn.ken.student.rubcourse.dto.req.CourseInfoAddReq;
import cn.ken.student.rubcourse.service.ICourseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 课程信息表 前端控制器
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-16
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    
    @Autowired
    private ICourseService courseService;

    @GetMapping("nameList")
    @ApiOperation("下拉框课程名(输入id或课程名)")
    public Result getCourseNameList(HttpServletRequest httpServletRequest, String searchContent) {
        return courseService.getCourseNameList(httpServletRequest, searchContent);
    }
    
    @PostMapping("addCourseInfo")
    @ApiOperation("添加课程信息")
    public Result addCourseInfo(HttpServletRequest httpServletRequest, CourseInfoAddReq courseInfoAddReq) {
        return courseService.addCourseInfo(httpServletRequest, courseInfoAddReq);
    }

    @PostMapping("removeCourseInfo")
    @ApiOperation("删除课程信息")
    public Result removeCourseInfo(HttpServletRequest httpServletRequest, @RequestParam List<String> courseInfoIds) {
        return courseService.removeCourseInfo(httpServletRequest, courseInfoIds);
    }

}
